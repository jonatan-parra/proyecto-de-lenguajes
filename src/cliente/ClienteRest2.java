package cliente;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ClienteRest2 {
	// URL DE CONEXION AL SERVICIO RESTful
	private final static String URL = "url";

	public static String PRUEBA(Double var5, String HoLa) {
		String myUrl = URL;
		myUrl = myUrl.concat("/dia/notas/mis");

		// Se anaden los parametros a la URL
		myUrl = myUrl.concat(";var5=" + var5);
		myUrl = myUrl.concat(";HoLa=" + HoLa);

		Client client = Client.create();
		WebResource webResource = client.resource(myUrl);
		// Recurso para tipificar el cliente
		WebResource.Builder builder = webResource.getRequestBuilder();
		builder.accept(MediaType.APPLICATION_JSON);
		builder.type(MediaType.APPLICATION_JSON);

		// Accede al metodo GET del servicio RESTful dependiente a la URL
		ClientResponse response = builder.post(ClientResponse.class);
		// Contiene el JSON
		String respuestaJson = response.getEntity(String.class);
		return respuestaJson;

	}
}
