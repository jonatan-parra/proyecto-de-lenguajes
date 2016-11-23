/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.tree.TerminalNode;

import classes.MyLanguageParser.PairContext;
import classes.MyLanguageParser.ParametrosContext;
import classes.MyLanguageParser.ValueContext;

/**
 *
 * @author Estudiante
 */
public class MyVisitor<T> extends MyLanguageBaseVisitor<T> {

	public static String URLREST = "MyUrl";
	public static String METODOSREST = "";

	@Override
	public T visitCommands(MyLanguageParser.CommandsContext ctx) {
		URLREST = ctx.urlrest().url().getText();
		return visitChildren(ctx);
	}

	@Override
	public T visitMetodosRest(MyLanguageParser.MetodosRestContext ctx) {
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

		METODOSREST += definition;
		/*
		 * String clazz = Generador.myClass(definition, URLREST);
		 * 
		 * Generador.generator(clazz);
		 */

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

	public String getValueFromJson(ValueContext value) {
		if (value.ID() != null) {
			return "String";
		}
		if (value.NUMBER() != null) {
			return "Double";
		}
		if (value.object() != null) {
			return value.object().getText();
		}
		if (value.array() != null) {
			return "List<" + auxClazzName + ">";
		}
		if (value.bool() != null) {
			return "boolean";
		}
		if (value.getText().equals("null")) {
			return "String";
		} else {
			return "String";
		}
	}

	public boolean isObjectFromJson(ValueContext value) {
		if (value.object() != null) {
			return true;
		}
		return false;

	}

	public static String clazzName = "DefaultClazz";
	public static String auxClazzName = "DefaultAuxClazz";

	@Override
	public T visitObject(MyLanguageParser.ObjectContext ctx) {
		String nameClass = clazzName;

		String atributos = "";
		String nombreAtributo = "";
		String tipoAtributo = "";
		List<PairContext> pair = ctx.pair();
		for (PairContext pairContext : pair) {
			// System.out.println(pairContext.value1().value().getText());
			nombreAtributo = pairContext.ID().getText();
			auxClazzName = nombreAtributo;
			tipoAtributo = getValueFromJson(pairContext.value1().value());
			System.out.println(tipoAtributo);
			if (isObjectFromJson(pairContext.value1().value())) {
				clazzName = nombreAtributo;
			}
			atributos += GeneradorClases.generarAtributo(tipoAtributo, nombreAtributo);
			visitPair(pairContext);
		}

		String clazz = GeneradorClases.cabecera(nameClass, atributos);
		GeneradorClases.generator(nameClass, clazz);
		return (T) new Integer(0);
		// return visitChildren(ctx);
	}

	public static int nombreAtribute = 0;
	
	@Override
	public T visitArray(MyLanguageParser.ArrayContext ctx) {
		
		String atributos = "";
		String tipoAtributo = "";
		String nombreAtributo = "";
		List<ValueContext> valueList = ctx.value();
		if(valueList!=null){
			ValueContext value = valueList.get(0);
			tipoAtributo = getValueFromJson(value);
			if (isObjectFromJson(value)) {
				clazzName = auxClazzName;
				visitChildren(value);
			}
			else{
				nombreAtributo = "default" + nombreAtribute;
				nombreAtribute++;
			}
			//nombreAtributo = pairContext.ID().getText();
			System.out.println(tipoAtributo);
			atributos += GeneradorClases.generarAtributo(tipoAtributo, nombreAtributo);
			//return (T) atributos;
		}
		return (T) new String();
		//return visitChildren(ctx);
	}

	/*
	 * @Override public T visitPrintexpr(PrintexprContext ctx){
	 * //System.out.println("Entrando a visitor expr");
	 * System.out.println(ctx.expr().getText()); return
	 * super.visitPrintexpr(ctx); }
	 */

}