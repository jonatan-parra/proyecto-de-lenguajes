// Generated from MyLanguage.g by ANTLR 4.5.3
package classes;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageParser}.
 */
public interface MyLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#commands}.
	 * @param ctx the parse tree
	 */
	void enterCommands(MyLanguageParser.CommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#commands}.
	 * @param ctx the parse tree
	 */
	void exitCommands(MyLanguageParser.CommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#urlrest}.
	 * @param ctx the parse tree
	 */
	void enterUrlrest(MyLanguageParser.UrlrestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#urlrest}.
	 * @param ctx the parse tree
	 */
	void exitUrlrest(MyLanguageParser.UrlrestContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#metodo}.
	 * @param ctx the parse tree
	 */
	void enterMetodo(MyLanguageParser.MetodoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#metodo}.
	 * @param ctx the parse tree
	 */
	void exitMetodo(MyLanguageParser.MetodoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#returntype}.
	 * @param ctx the parse tree
	 */
	void enterReturntype(MyLanguageParser.ReturntypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#returntype}.
	 * @param ctx the parse tree
	 */
	void exitReturntype(MyLanguageParser.ReturntypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#requesttype}.
	 * @param ctx the parse tree
	 */
	void enterRequesttype(MyLanguageParser.RequesttypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#requesttype}.
	 * @param ctx the parse tree
	 */
	void exitRequesttype(MyLanguageParser.RequesttypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#dir_url}.
	 * @param ctx the parse tree
	 */
	void enterDir_url(MyLanguageParser.Dir_urlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#dir_url}.
	 * @param ctx the parse tree
	 */
	void exitDir_url(MyLanguageParser.Dir_urlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(MyLanguageParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(MyLanguageParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#json}.
	 * @param ctx the parse tree
	 */
	void enterJson(MyLanguageParser.JsonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#json}.
	 * @param ctx the parse tree
	 */
	void exitJson(MyLanguageParser.JsonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(MyLanguageParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(MyLanguageParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#pair}.
	 * @param ctx the parse tree
	 */
	void enterPair(MyLanguageParser.PairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#pair}.
	 * @param ctx the parse tree
	 */
	void exitPair(MyLanguageParser.PairContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(MyLanguageParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(MyLanguageParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MyLanguageParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MyLanguageParser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#valor_retorno}.
	 * @param ctx the parse tree
	 */
	void enterValor_retorno(MyLanguageParser.Valor_retornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#valor_retorno}.
	 * @param ctx the parse tree
	 */
	void exitValor_retorno(MyLanguageParser.Valor_retornoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#bool}.
	 * @param ctx the parse tree
	 */
	void enterBool(MyLanguageParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#bool}.
	 * @param ctx the parse tree
	 */
	void exitBool(MyLanguageParser.BoolContext ctx);
}