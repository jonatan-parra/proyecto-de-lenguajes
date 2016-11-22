// Generated from MyLanguage.g by ANTLR 4.5.3
package classes;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MyLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		URL=18, QUERY=19, TEMPLATE=20, HEADER=21, MATRIX=22, PLAIN=23, RETURNTYPE=24, 
		URLREST=25, REQUESTTYPE=26, DIR_URL=27, COMMENT=28, LINE_COMMENT=29, WS=30, 
		VAR=31, A=32, B=33, C=34, D=35, E=36, F=37, G=38, H=39, I=40, J=41, K=42, 
		L=43, M=44, N=45, O=46, P=47, Q=48, R=49, S=50, T=51, U=52, V=53, W=54, 
		X=55, Y=56, Z=57, PAR_IZQ=58, PAR_DER=59, COR_IZQ=60, COR_DER=61, LLA_IZQ=62, 
		LLA_DER=63, DOS_PUNTOS=64, COMILLAS=65, COMA=66, SLASH=67, MULOP=68, SUMOP=69, 
		MODOP=70, MODULO=71, POTENCIA=72, AND_OP=73, OR_OP=74, ID=75, ID_METODO=76, 
		STRING=77, NUMBER=78;
	public static final int
		RULE_commands = 0, RULE_urlrest = 1, RULE_metodo = 2, RULE_returntype = 3, 
		RULE_requesttype = 4, RULE_dir_url = 5, RULE_parametros = 6, RULE_json = 7, 
		RULE_object = 8, RULE_pair = 9, RULE_array = 10, RULE_value = 11, RULE_valor_retorno = 12, 
		RULE_bool = 13;
	public static final String[] ruleNames = {
		"commands", "urlrest", "metodo", "returntype", "requesttype", "dir_url", 
		"parametros", "json", "object", "pair", "array", "value", "valor_retorno", 
		"bool"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'url'", "'GET'", "'POST'", "'PUT'", "'DELETE'", "'HEAD'", "'OPTIONS'", 
		"'TRACE'", "'PATCH'", "'null'", "'STRING'", "'NUMBER'", "'object'", "'array'", 
		"'bool'", "'true'", "'false'", null, null, null, null, null, null, "'RETURNTYPE'", 
		"'URLREST'", "'REQUESTTYPE'", "'DIR_URL'", null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "'('", "')'", "'['", "']'", "'{'", "'}'", "':'", "'\"'", "','", 
		"'/'", null, null, "'%'", null, "'^'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "URL", "QUERY", "TEMPLATE", "HEADER", 
		"MATRIX", "PLAIN", "RETURNTYPE", "URLREST", "REQUESTTYPE", "DIR_URL", 
		"COMMENT", "LINE_COMMENT", "WS", "VAR", "A", "B", "C", "D", "E", "F", 
		"G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", 
		"U", "V", "W", "X", "Y", "Z", "PAR_IZQ", "PAR_DER", "COR_IZQ", "COR_DER", 
		"LLA_IZQ", "LLA_DER", "DOS_PUNTOS", "COMILLAS", "COMA", "SLASH", "MULOP", 
		"SUMOP", "MODOP", "MODULO", "POTENCIA", "AND_OP", "OR_OP", "ID", "ID_METODO", 
		"STRING", "NUMBER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "MyLanguage.g"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MyLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CommandsContext extends ParserRuleContext {
		public UrlrestContext urlrest() {
			return getRuleContext(UrlrestContext.class,0);
		}
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public MetodoContext metodo() {
			return getRuleContext(MetodoContext.class,0);
		}
		public TerminalNode DOS_PUNTOS() { return getToken(MyLanguageParser.DOS_PUNTOS, 0); }
		public TerminalNode LLA_IZQ() { return getToken(MyLanguageParser.LLA_IZQ, 0); }
		public ReturntypeContext returntype() {
			return getRuleContext(ReturntypeContext.class,0);
		}
		public RequesttypeContext requesttype() {
			return getRuleContext(RequesttypeContext.class,0);
		}
		public Dir_urlContext dir_url() {
			return getRuleContext(Dir_urlContext.class,0);
		}
		public TerminalNode LLA_DER() { return getToken(MyLanguageParser.LLA_DER, 0); }
		public List<ParametrosContext> parametros() {
			return getRuleContexts(ParametrosContext.class);
		}
		public ParametrosContext parametros(int i) {
			return getRuleContext(ParametrosContext.class,i);
		}
		public CommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandsContext commands() throws RecognitionException {
		CommandsContext _localctx = new CommandsContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_commands);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			urlrest();
			setState(29);
			match(ID);
			setState(30);
			metodo();
			setState(31);
			match(DOS_PUNTOS);
			setState(32);
			match(LLA_IZQ);
			setState(33);
			returntype();
			setState(34);
			requesttype();
			setState(35);
			dir_url();
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) {
				{
				{
				setState(36);
				parametros();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(LLA_DER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UrlrestContext extends ParserRuleContext {
		public TerminalNode URLREST() { return getToken(MyLanguageParser.URLREST, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(MyLanguageParser.DOS_PUNTOS, 0); }
		public List<TerminalNode> COMILLAS() { return getTokens(MyLanguageParser.COMILLAS); }
		public TerminalNode COMILLAS(int i) {
			return getToken(MyLanguageParser.COMILLAS, i);
		}
		public UrlrestContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_urlrest; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterUrlrest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitUrlrest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitUrlrest(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlrestContext urlrest() throws RecognitionException {
		UrlrestContext _localctx = new UrlrestContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_urlrest);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(URLREST);
			setState(45);
			match(DOS_PUNTOS);
			setState(46);
			match(COMILLAS);
			setState(47);
			match(T__0);
			setState(48);
			match(COMILLAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetodoContext extends ParserRuleContext {
		public MetodoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterMetodo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitMetodo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitMetodo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoContext metodo() throws RecognitionException {
		MetodoContext _localctx = new MetodoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_metodo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReturntypeContext extends ParserRuleContext {
		public TerminalNode RETURNTYPE() { return getToken(MyLanguageParser.RETURNTYPE, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(MyLanguageParser.DOS_PUNTOS, 0); }
		public Valor_retornoContext valor_retorno() {
			return getRuleContext(Valor_retornoContext.class,0);
		}
		public ReturntypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returntype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterReturntype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitReturntype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitReturntype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturntypeContext returntype() throws RecognitionException {
		ReturntypeContext _localctx = new ReturntypeContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_returntype);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(RETURNTYPE);
			setState(53);
			match(DOS_PUNTOS);
			setState(54);
			valor_retorno();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RequesttypeContext extends ParserRuleContext {
		public TerminalNode REQUESTTYPE() { return getToken(MyLanguageParser.REQUESTTYPE, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(MyLanguageParser.DOS_PUNTOS, 0); }
		public List<TerminalNode> COMILLAS() { return getTokens(MyLanguageParser.COMILLAS); }
		public TerminalNode COMILLAS(int i) {
			return getToken(MyLanguageParser.COMILLAS, i);
		}
		public TerminalNode QUERY() { return getToken(MyLanguageParser.QUERY, 0); }
		public TerminalNode TEMPLATE() { return getToken(MyLanguageParser.TEMPLATE, 0); }
		public TerminalNode HEADER() { return getToken(MyLanguageParser.HEADER, 0); }
		public TerminalNode MATRIX() { return getToken(MyLanguageParser.MATRIX, 0); }
		public TerminalNode PLAIN() { return getToken(MyLanguageParser.PLAIN, 0); }
		public RequesttypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_requesttype; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterRequesttype(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitRequesttype(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitRequesttype(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RequesttypeContext requesttype() throws RecognitionException {
		RequesttypeContext _localctx = new RequesttypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_requesttype);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(REQUESTTYPE);
			setState(57);
			match(DOS_PUNTOS);
			setState(58);
			match(COMILLAS);
			setState(59);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << QUERY) | (1L << TEMPLATE) | (1L << HEADER) | (1L << MATRIX) | (1L << PLAIN))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			setState(60);
			match(COMILLAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Dir_urlContext extends ParserRuleContext {
		public TerminalNode DIR_URL() { return getToken(MyLanguageParser.DIR_URL, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(MyLanguageParser.DOS_PUNTOS, 0); }
		public List<TerminalNode> COMILLAS() { return getTokens(MyLanguageParser.COMILLAS); }
		public TerminalNode COMILLAS(int i) {
			return getToken(MyLanguageParser.COMILLAS, i);
		}
		public List<TerminalNode> SLASH() { return getTokens(MyLanguageParser.SLASH); }
		public TerminalNode SLASH(int i) {
			return getToken(MyLanguageParser.SLASH, i);
		}
		public List<TerminalNode> ID() { return getTokens(MyLanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MyLanguageParser.ID, i);
		}
		public Dir_urlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dir_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterDir_url(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitDir_url(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitDir_url(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dir_urlContext dir_url() throws RecognitionException {
		Dir_urlContext _localctx = new Dir_urlContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_dir_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(DIR_URL);
			setState(63);
			match(DOS_PUNTOS);
			setState(64);
			match(COMILLAS);
			setState(67); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				match(SLASH);
				setState(66);
				match(ID);
				}
				}
				setState(69); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==SLASH );
			setState(71);
			match(COMILLAS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametrosContext extends ParserRuleContext {
		public Valor_retornoContext valor_retorno() {
			return getRuleContext(Valor_retornoContext.class,0);
		}
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_parametros);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			valor_retorno();
			setState(74);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JsonContext extends ParserRuleContext {
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterJson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitJson(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitJson(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjectContext extends ParserRuleContext {
		public List<PairContext> pair() {
			return getRuleContexts(PairContext.class);
		}
		public PairContext pair(int i) {
			return getRuleContext(PairContext.class,i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_object);
		int _la;
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(78);
				match(LLA_IZQ);
				setState(79);
				pair();
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(80);
					match(COMA);
					setState(81);
					pair();
					}
					}
					setState(86);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(87);
				match(LLA_DER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(LLA_IZQ);
				setState(90);
				match(LLA_DER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PairContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MyLanguageParser.STRING, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public PairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PairContext pair() throws RecognitionException {
		PairContext _localctx = new PairContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			match(STRING);
			setState(94);
			match(DOS_PUNTOS);
			setState(95);
			value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_array);
		int _la;
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				match(COR_IZQ);
				setState(98);
				value();
				setState(103);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(99);
					match(COMA);
					setState(100);
					value();
					}
					}
					setState(105);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(106);
				match(COR_DER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(108);
				match(COR_IZQ);
				setState(109);
				match(COR_DER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MyLanguageParser.STRING, 0); }
		public TerminalNode NUMBER() { return getToken(MyLanguageParser.NUMBER, 0); }
		public ObjectContext object() {
			return getRuleContext(ObjectContext.class,0);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public BoolContext bool() {
			return getRuleContext(BoolContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_value);
		try {
			setState(118);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				match(NUMBER);
				}
				break;
			case LLA_IZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(114);
				object();
				}
				break;
			case COR_IZQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(115);
				array();
				}
				break;
			case T__15:
			case T__16:
				enterOuterAlt(_localctx, 5);
				{
				setState(116);
				bool();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				match(T__9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_retornoContext extends ParserRuleContext {
		public Valor_retornoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_retorno; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterValor_retorno(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitValor_retorno(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitValor_retorno(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_retornoContext valor_retorno() throws RecognitionException {
		Valor_retornoContext _localctx = new Valor_retornoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_valor_retorno);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12) | (1L << T__13) | (1L << T__14))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BoolContext extends ParserRuleContext {
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bool);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !(_la==T__15 || _la==T__16) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3P\177\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13"+
		"\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\7\2(\n\2\f\2\16\2+\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\6\7F\n\7\r\7"+
		"\16\7G\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\n\7\nU\n\n\f\n\16\nX"+
		"\13\n\3\n\3\n\3\n\3\n\5\n^\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\7\f"+
		"h\n\f\f\f\16\fk\13\f\3\f\3\f\3\f\3\f\5\fq\n\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\ry\n\r\3\16\3\16\3\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\2\6\3\2\4\13\3\2\25\31\3\2\f\21\3\2\22\23{\2\36\3\2\2\2\4.\3\2"+
		"\2\2\6\64\3\2\2\2\b\66\3\2\2\2\n:\3\2\2\2\f@\3\2\2\2\16K\3\2\2\2\20N\3"+
		"\2\2\2\22]\3\2\2\2\24_\3\2\2\2\26p\3\2\2\2\30x\3\2\2\2\32z\3\2\2\2\34"+
		"|\3\2\2\2\36\37\5\4\3\2\37 \7M\2\2 !\5\6\4\2!\"\7B\2\2\"#\7@\2\2#$\5\b"+
		"\5\2$%\5\n\6\2%)\5\f\7\2&(\5\16\b\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*"+
		"\3\2\2\2*,\3\2\2\2+)\3\2\2\2,-\7A\2\2-\3\3\2\2\2./\7\33\2\2/\60\7B\2\2"+
		"\60\61\7C\2\2\61\62\7\3\2\2\62\63\7C\2\2\63\5\3\2\2\2\64\65\t\2\2\2\65"+
		"\7\3\2\2\2\66\67\7\32\2\2\678\7B\2\289\5\32\16\29\t\3\2\2\2:;\7\34\2\2"+
		";<\7B\2\2<=\7C\2\2=>\t\3\2\2>?\7C\2\2?\13\3\2\2\2@A\7\35\2\2AB\7B\2\2"+
		"BE\7C\2\2CD\7E\2\2DF\7M\2\2EC\3\2\2\2FG\3\2\2\2GE\3\2\2\2GH\3\2\2\2HI"+
		"\3\2\2\2IJ\7C\2\2J\r\3\2\2\2KL\5\32\16\2LM\7M\2\2M\17\3\2\2\2NO\5\30\r"+
		"\2O\21\3\2\2\2PQ\7@\2\2QV\5\24\13\2RS\7D\2\2SU\5\24\13\2TR\3\2\2\2UX\3"+
		"\2\2\2VT\3\2\2\2VW\3\2\2\2WY\3\2\2\2XV\3\2\2\2YZ\7A\2\2Z^\3\2\2\2[\\\7"+
		"@\2\2\\^\7A\2\2]P\3\2\2\2][\3\2\2\2^\23\3\2\2\2_`\7O\2\2`a\7B\2\2ab\5"+
		"\30\r\2b\25\3\2\2\2cd\7>\2\2di\5\30\r\2ef\7D\2\2fh\5\30\r\2ge\3\2\2\2"+
		"hk\3\2\2\2ig\3\2\2\2ij\3\2\2\2jl\3\2\2\2ki\3\2\2\2lm\7?\2\2mq\3\2\2\2"+
		"no\7>\2\2oq\7?\2\2pc\3\2\2\2pn\3\2\2\2q\27\3\2\2\2ry\7O\2\2sy\7P\2\2t"+
		"y\5\22\n\2uy\5\26\f\2vy\5\34\17\2wy\7\f\2\2xr\3\2\2\2xs\3\2\2\2xt\3\2"+
		"\2\2xu\3\2\2\2xv\3\2\2\2xw\3\2\2\2y\31\3\2\2\2z{\t\4\2\2{\33\3\2\2\2|"+
		"}\t\5\2\2}\35\3\2\2\2\t)GV]ipx";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}