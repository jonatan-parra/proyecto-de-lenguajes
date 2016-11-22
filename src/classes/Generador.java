package classes;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;



public class Generador {
	/**
	 * @param name
	 * @param definition
	 * La cabecera de la clase
	 * @return
	 */
	public static String myClass(String definition, String url) {
		return  "import javax.ws.rs.core.MediaType;\n"
				+ "import org.codehaus.jackson.map.ObjectMapper;\n"
				+ "import com.sun.jersey.api.client.Client;\n"
				+ "import com.sun.jersey.api.client.ClientResponse;\n"
				+ "import com.sun.jersey.api.client.WebResource;\n"
				+ "public class " + "ClienteRest" + "{\n\n"
				+ "// URL DE CONEXION AL SERVICIO RESTful\n" 
				+ "private final static String URL = \"" + url + "\";\n"
				+ definition
				+ "\n\n}";
	}
	/**
	 * Es el que formula el metodo por completitud para cada metodo definido en neustro lenguaje
	 * @param methodType
	 * @param returnType
	 * @param parametros
	 * @return
	 */
	public static String restMethod(String requestType, String id, String url, String methodType, String returnType, List<String> tipoParametros, List<String> nombreParametros) {
		List<String> formatoTipoParametros = formatoTipoParemetros(tipoParametros);
		String metodo = "public static "  + returnType(returnType) + " " + id + "(" + parametrosForm(formatoTipoParametros, nombreParametros) + "){\n"
				+ "String myUrl = URL;\n"		
				+ "myUrl = myUrl.concat(\"" + url + "\");\n\n"
				+ "//Se anaden los parametros a la URL\n"
				+ formaParametros(requestType, nombreParametros)
				+ "\n"
				+ "Client client = Client.create();\n"
				+ "WebResource webResource = client.resource(myUrl);\n"
				+ restMethod(methodType)
				+ "}";

		return metodo;
	}
	
	public static List<String> formatoTipoParemetros(List<String> tipoParametros){
		//'STRING' | 'NUMBER' | 'object' | 'array' | 'bool' | 'null'
		List<String> formatoTipoParametros = new ArrayList<String>();
		for (String string : tipoParametros) {
			switch (string) {
			case "STRING":
				formatoTipoParametros.add("String");
				break;
			case "NUMBER":
				formatoTipoParametros.add("Double");
				break;
			case "object":
				formatoTipoParametros.add("object");
				break;
			case "array":
				formatoTipoParametros.add("array");
				break;
			case "bool":
				formatoTipoParametros.add("boolean");
				break;
			case "null":
				formatoTipoParametros.add("boolean");
				break;
			default:
				break;
			}
		}
		return formatoTipoParametros;

		
	}
	
	public static String returnType(String returnType){
		return "String";
	}
	public static String parametrosForm(List<String> tipoParametros, List<String> nombreParametros){
		String params = "";
		int paramNum = 0;
		for (int i=0; i<tipoParametros.size();i++) {
			params += (paramNum==0?"":", ") + tipoParametros.get(i) + " " + nombreParametros.get(i);
			paramNum++;
		}
		return params;
	}

	/**
	 * 
	 * @param methodType
	 * @param parametros
	 * Obtiene el metodo que consume el cliente, siendo de tipo methodType y pasando parametros
	 * @return
	 */
	public static String restMethod(String methodType) {
		String metodo = "// Recurso para tipificar el cliente\n"
				+ "WebResource.Builder builder = webResource.getRequestBuilder();\n"
				+ "builder.accept(MediaType.APPLICATION_JSON);\nbuilder.type(MediaType.APPLICATION_JSON);\n\n"
				+ "// Accede al metodo GET del servicio RESTful dependiente a la URL\n"
				+ "ClientResponse response = builder."
				+ methodGetType(methodType)
				+ "(ClientResponse.class"
				+ ");\n"
				+ "// Contiene el JSON\n"
				+ "String respuestaJson = response.getEntity(String.class);\n"
				+ "return respuestaJson;\n\n";
			
		return metodo;
	}
    /**
     * 
     * @param methodType
     * Según lo que indique el parametro methodType en nuestro lenguaje obtiene el metodo como esta definido el servicio REST
     * @return
     */
	public static String methodGetType(String methodType) {
		// metodo: ('GET' | 'POST' | 'PUT' | 'DELETE' | 'HEAD' | 'OPTIONS' |
		// 'TRACE' | 'PATCH');
		switch (methodType) {
		case "GET":
			return "get";
		case "POST":
			return "post";
		case "PUT":
			break;
		case "DELETE":
			break;
		default:
			return "-1";
		}
		return methodType;
	}
	

	
	public static String formaParametros(String requestType, List<String> nombreParametros){
		switch (requestType) {
		case "REQUESTTYPE:\"QUERY\"":
			return queryCase(nombreParametros);
		case "REQUESTTYPE:\"PATH\"":
			return pathCase(nombreParametros);
		case "REQUESTTYPE:\"MATRIX\"":
			return matrixCase(nombreParametros);
		default:
			return "//error\n";
		}
	}
	
	public static String queryCase(List<String> nombreParametros){
		String params = "";
		int paramNum = 0;
		for (String string : nombreParametros) {
			params += "myUrl = myUrl.concat(\"" + (paramNum==0?"?":"&") + string + "=\" + " + string + ");\n";
			paramNum++;
		}
		return params;
		
	}
	public static String pathCase(List<String> nombreParametros){
		String params = "";
		for (String string : nombreParametros) {
			params += "myUrl = myUrl.concat(\"/\" + "+ string + ");\n";
		}
		return params;
		
	}
	public static String matrixCase(List<String> nombreParametros){
		String params = "";
		for (String string : nombreParametros) {
			params += "myUrl = myUrl.concat(\";" + string + "=\" + " + string + ");\n";
		}
		return params;
		
	}
	

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException {
		
		List<String> nombreParametros = new ArrayList<>();
		nombreParametros.add("param");
		
		List<String> tipoParametros = new ArrayList<>();
		tipoParametros.add("String");
		
		 
		
		String definition = (restMethod("QUERY", "getExample", "/example/get", "GET", "String", tipoParametros, nombreParametros));
		String URL = "http://johan-pc:8080/lenguajes-ejemplosrest/rest";
		String clazz = myClass(definition, URL);
		
		try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("src/ClienteRest.java"), "utf-8"))) {
				writer.write(clazz);
		}
	}

}
