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
	 * Visit a parse tree produced by {@link MyLanguageParser#metodosRest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodosRest(MyLanguageParser.MetodosRestContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#urlrest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrlrest(MyLanguageParser.UrlrestContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#url_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl_rest(MyLanguageParser.Url_restContext ctx);
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
	 * Visit a parse tree produced by {@link MyLanguageParser#value1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue1(MyLanguageParser.Value1Context ctx);
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
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#url}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUrl(MyLanguageParser.UrlContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#authority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthority(MyLanguageParser.AuthorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(MyLanguageParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#cellname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCellname(MyLanguageParser.CellnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostname(MyLanguageParser.HostnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#hostnumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostnumber(MyLanguageParser.HostnumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(MyLanguageParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(MyLanguageParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#search}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch(MyLanguageParser.SearchContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#searchparameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchparameter(MyLanguageParser.SearchparameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser(MyLanguageParser.UserContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#login}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogin(MyLanguageParser.LoginContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#password}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPassword(MyLanguageParser.PasswordContext ctx);
	/**
	 * Visit a parse tree produced by {@link MyLanguageParser#fragmentid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFragmentid(MyLanguageParser.FragmentidContext ctx);
}