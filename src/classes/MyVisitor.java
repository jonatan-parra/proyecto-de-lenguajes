/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import classes.MyLanguageParser.ParametrosContext;

/**
 *
 * @author Estudiante
 */
public class MyVisitor<T> extends MyLanguageBaseVisitor<T> {

	@Override
	public T visitCommands(MyLanguageParser.CommandsContext ctx) {

		String requestType = ctx.requesttype().getText();
		String id = ctx.ID().getText();
		String dir_url = (String) visitDir_url(ctx.dir_url());
		String methodType = ctx.metodo().getText();
		String returnType = ctx.returntype().getText();
		List<ParametrosContext> parametros = ctx.parametros();
		List<String> tipoParametros = new ArrayList<>();
		List<String> nombreParametros = new ArrayList<>();
		for (ParametrosContext parametrosContext : parametros) {
			tipoParametros.add(parametrosContext.valor_retorno().getText());
			nombreParametros.add(parametrosContext.ID().getText());
		}
		String definition = Generador.restMethod(requestType, id, dir_url, methodType, returnType, tipoParametros,
				nombreParametros);
		String URL = "url";
		String clazz = Generador.myClass(definition, URL);

		try (Writer writer = new BufferedWriter(
				new OutputStreamWriter(new FileOutputStream("src/ClienteRest.java"), "utf-8"))) {
			writer.write(clazz);
		} catch (Exception e) {
			// TODO: handle exception
		}

		return visitChildren(ctx);
	}

	@Override
	public T visitDir_url(MyLanguageParser.Dir_urlContext ctx) {
		String url = "";
		List<TerminalNode> id = ctx.ID();
		for (TerminalNode path : id) {
			url += "/" + path;
		}
		return (T) url;
		// return visitChildren(ctx);
	}

	@Override
	public T visitObject(MyLanguageParser.ObjectContext ctx) {
		
		return visitChildren(ctx);
	}

	/*
	 * @Override public T visitPrintexpr(PrintexprContext ctx){
	 * //System.out.println("Entrando a visitor expr");
	 * System.out.println(ctx.expr().getText()); return
	 * super.visitPrintexpr(ctx); }
	 */

}