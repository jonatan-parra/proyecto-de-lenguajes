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
	 * Enter a parse tree produced by {@link MyLanguageParser#metodosRest}.
	 * @param ctx the parse tree
	 */
	void enterMetodosRest(MyLanguageParser.MetodosRestContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#metodosRest}.
	 * @param ctx the parse tree
	 */
	void exitMetodosRest(MyLanguageParser.MetodosRestContext ctx);
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
	 * Enter a parse tree produced by {@link MyLanguageParser#url_rest}.
	 * @param ctx the parse tree
	 */
	void enterUrl_rest(MyLanguageParser.Url_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#url_rest}.
	 * @param ctx the parse tree
	 */
	void exitUrl_rest(MyLanguageParser.Url_restContext ctx);
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
	 * Enter a parse tree produced by {@link MyLanguageParser#value1}.
	 * @param ctx the parse tree
	 */
	void enterValue1(MyLanguageParser.Value1Context ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#value1}.
	 * @param ctx the parse tree
	 */
	void exitValue1(MyLanguageParser.Value1Context ctx);
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
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#url}.
	 * @param ctx the parse tree
	 */
	void enterUrl(MyLanguageParser.UrlContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#url}.
	 * @param ctx the parse tree
	 */
	void exitUrl(MyLanguageParser.UrlContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#authority}.
	 * @param ctx the parse tree
	 */
	void enterAuthority(MyLanguageParser.AuthorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#authority}.
	 * @param ctx the parse tree
	 */
	void exitAuthority(MyLanguageParser.AuthorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(MyLanguageParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(MyLanguageParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#cellname}.
	 * @param ctx the parse tree
	 */
	void enterCellname(MyLanguageParser.CellnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#cellname}.
	 * @param ctx the parse tree
	 */
	void exitCellname(MyLanguageParser.CellnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHostname(MyLanguageParser.HostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHostname(MyLanguageParser.HostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#hostnumber}.
	 * @param ctx the parse tree
	 */
	void enterHostnumber(MyLanguageParser.HostnumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#hostnumber}.
	 * @param ctx the parse tree
	 */
	void exitHostnumber(MyLanguageParser.HostnumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(MyLanguageParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(MyLanguageParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(MyLanguageParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(MyLanguageParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#search}.
	 * @param ctx the parse tree
	 */
	void enterSearch(MyLanguageParser.SearchContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#search}.
	 * @param ctx the parse tree
	 */
	void exitSearch(MyLanguageParser.SearchContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#searchparameter}.
	 * @param ctx the parse tree
	 */
	void enterSearchparameter(MyLanguageParser.SearchparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#searchparameter}.
	 * @param ctx the parse tree
	 */
	void exitSearchparameter(MyLanguageParser.SearchparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#user}.
	 * @param ctx the parse tree
	 */
	void enterUser(MyLanguageParser.UserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#user}.
	 * @param ctx the parse tree
	 */
	void exitUser(MyLanguageParser.UserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#login}.
	 * @param ctx the parse tree
	 */
	void enterLogin(MyLanguageParser.LoginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#login}.
	 * @param ctx the parse tree
	 */
	void exitLogin(MyLanguageParser.LoginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#password}.
	 * @param ctx the parse tree
	 */
	void enterPassword(MyLanguageParser.PasswordContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#password}.
	 * @param ctx the parse tree
	 */
	void exitPassword(MyLanguageParser.PasswordContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#fragmentid}.
	 * @param ctx the parse tree
	 */
	void enterFragmentid(MyLanguageParser.FragmentidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#fragmentid}.
	 * @param ctx the parse tree
	 */
	void exitFragmentid(MyLanguageParser.FragmentidContext ctx);
}