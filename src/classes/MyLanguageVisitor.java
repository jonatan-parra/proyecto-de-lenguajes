// Generated from MyLanguage.g by ANTLR 4.5.3
package classes;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MyLanguageParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MyLanguageVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommands(MyLanguageParser.CommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#urlrest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlrest(MyLanguageParser.UrlrestContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#metodo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodo(MyLanguageParser.MetodoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#returntype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturntype(MyLanguageParser.ReturntypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#requesttype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRequesttype(MyLanguageParser.RequesttypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#dir_url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDir_url(MyLanguageParser.Dir_urlContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(MyLanguageParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#json}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJson(MyLanguageParser.JsonContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(MyLanguageParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPair(MyLanguageParser.PairContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(MyLanguageParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue(MyLanguageParser.ValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#valor_retorno}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_retorno(MyLanguageParser.Valor_retornoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#bool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(MyLanguageParser.BoolContext ctx);
}