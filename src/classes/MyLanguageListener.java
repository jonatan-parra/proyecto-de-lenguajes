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
	 * Enter a parse tree produced by {@link MyLanguageParser#verbo}.
	 * @param ctx the parse tree
	 */
	void enterVerbo(MyLanguageParser.VerboContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#verbo}.
	 * @param ctx the parse tree
	 */
	void exitVerbo(MyLanguageParser.VerboContext ctx);
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
	 * Enter a parse tree produced by {@link MyLanguageParser#fragmentaddress}.
	 * @param ctx the parse tree
	 */
	void enterFragmentaddress(MyLanguageParser.FragmentaddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#fragmentaddress}.
	 * @param ctx the parse tree
	 */
	void exitFragmentaddress(MyLanguageParser.FragmentaddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#uri}.
	 * @param ctx the parse tree
	 */
	void enterUri(MyLanguageParser.UriContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#uri}.
	 * @param ctx the parse tree
	 */
	void exitUri(MyLanguageParser.UriContext ctx);
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