package classes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class GeneradorClases {
	
	public static String cabecera(String nombre, String atributos){
		return "import java.util.List;\n"
			+ "public class " + nombre + "{\n\n"
			+ atributos
			+ "\n\n}";
	}
	public static String generarAtributo(String tipo, String nombre){
		return "private " + tipo + " " + nombre + ";\n";
	}
	
	public static void generator(String clazzName, String content){
		try (Writer writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("src/" + clazzName + ".java"), "utf-8"))) {
			writer.write(content);
		} catch (Exception e) {
			System.out.println("No se pudo generar el archivo, nombre incorrecto");
			// TODO: handle exception
		}
	}

}
