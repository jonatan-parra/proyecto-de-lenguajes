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
		T__9=10, T__10=11, METHOD=12, URL=13, QUERY=14, TEMPLATE=15, HEADER=16, 
		MATRIX=17, PLAIN=18, REQUESTTYPE=19, NAMEMETHOD=20, COMMENT=21, LINE_COMMENT=22, 
		WS=23, VAR=24, A=25, B=26, C=27, D=28, E=29, F=30, G=31, H=32, I=33, J=34, 
		K=35, L=36, M=37, N=38, O=39, P=40, Q=41, R=42, S=43, T=44, U=45, V=46, 
		W=47, X=48, Y=49, Z=50, PAR_IZQ=51, PAR_DER=52, COR_IZQ=53, COR_DER=54, 
		LLA_IZQ=55, LLA_DER=56, DOS_PUNTOS=57, COMILLAS=58, COMA=59, MULOP=60, 
		SUMOP=61, MODOP=62, MODULO=63, POTENCIA=64, AND_OP=65, OR_OP=66, ID=67, 
		NUMBER=68, HEX=69, STRING=70, DIGITS=71;
	public static final int
		RULE_commands = 0, RULE_verbo = 1, RULE_parametros = 2, RULE_json = 3, 
		RULE_object = 4, RULE_pair = 5, RULE_array = 6, RULE_value = 7, RULE_fragmentaddress = 8, 
		RULE_uri = 9, RULE_url = 10, RULE_authority = 11, RULE_host = 12, RULE_cellname = 13, 
		RULE_hostname = 14, RULE_hostnumber = 15, RULE_port = 16, RULE_path = 17, 
		RULE_search = 18, RULE_searchparameter = 19, RULE_user = 20, RULE_login = 21, 
		RULE_password = 22, RULE_fragmentid = 23;
	public static final String[] ruleNames = {
		"commands", "verbo", "parametros", "json", "object", "pair", "array", 
		"value", "fragmentaddress", "uri", "url", "authority", "host", "cellname", 
		"hostname", "hostnumber", "port", "path", "search", "searchparameter", 
		"user", "login", "password", "fragmentid"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'true'", "'false'", "'null'", "'#'", "'://'", "'/'", "'?'", "'.'", 
		"'&'", "'='", "'@'", null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, "'('", "')'", "'['", "']'", "'{'", 
		"'}'", "':'", "'\"'", "','", null, null, "'%'", null, "'^'", null, null, 
		null, null, null, "'dia'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"METHOD", "URL", "QUERY", "TEMPLATE", "HEADER", "MATRIX", "PLAIN", "REQUESTTYPE", 
		"NAMEMETHOD", "COMMENT", "LINE_COMMENT", "WS", "VAR", "A", "B", "C", "D", 
		"E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", 
		"S", "T", "U", "V", "W", "X", "Y", "Z", "PAR_IZQ", "PAR_DER", "COR_IZQ", 
		"COR_DER", "LLA_IZQ", "LLA_DER", "DOS_PUNTOS", "COMILLAS", "COMA", "MULOP", 
		"SUMOP", "MODOP", "MODULO", "POTENCIA", "AND_OP", "OR_OP", "ID", "NUMBER", 
		"HEX", "STRING", "DIGITS"
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
		public TerminalNode NAMEMETHOD() { return getToken(MyLanguageParser.NAMEMETHOD, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(MyLanguageParser.DOS_PUNTOS, 0); }
		public TerminalNode ID() { return getToken(MyLanguageParser.ID, 0); }
		public VerboContext verbo() {
			return getRuleContext(VerboContext.class,0);
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(NAMEMETHOD);
			setState(49);
			match(DOS_PUNTOS);
			setState(50);
			match(ID);
			setState(51);
			verbo();
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

	public static class VerboContext extends ParserRuleContext {
		public TerminalNode METHOD() { return getToken(MyLanguageParser.METHOD, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(MyLanguageParser.DOS_PUNTOS, 0); }
		public TerminalNode LLA_IZQ() { return getToken(MyLanguageParser.LLA_IZQ, 0); }
		public TerminalNode LLA_DER() { return getToken(MyLanguageParser.LLA_DER, 0); }
		public List<ParametrosContext> parametros() {
			return getRuleContexts(ParametrosContext.class);
		}
		public ParametrosContext parametros(int i) {
			return getRuleContext(ParametrosContext.class,i);
		}
		public VerboContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_verbo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterVerbo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitVerbo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitVerbo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VerboContext verbo() throws RecognitionException {
		VerboContext _localctx = new VerboContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_verbo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(METHOD);
			setState(54);
			match(DOS_PUNTOS);
			setState(55);
			match(LLA_IZQ);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==URL || _la==REQUESTTYPE) {
				{
				{
				setState(56);
				parametros();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
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

	public static class ParametrosContext extends ParserRuleContext {
		public TerminalNode URL() { return getToken(MyLanguageParser.URL, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(MyLanguageParser.DOS_PUNTOS, 0); }
		public List<TerminalNode> COMILLAS() { return getTokens(MyLanguageParser.COMILLAS); }
		public TerminalNode COMILLAS(int i) {
			return getToken(MyLanguageParser.COMILLAS, i);
		}
		public FragmentaddressContext fragmentaddress() {
			return getRuleContext(FragmentaddressContext.class,0);
		}
		public TerminalNode COMA() { return getToken(MyLanguageParser.COMA, 0); }
		public TerminalNode REQUESTTYPE() { return getToken(MyLanguageParser.REQUESTTYPE, 0); }
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
		enterRule(_localctx, 4, RULE_parametros);
		try {
			setState(77);
			switch (_input.LA(1)) {
			case URL:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				match(URL);
				setState(65);
				match(DOS_PUNTOS);
				setState(66);
				match(COMILLAS);
				setState(67);
				fragmentaddress();
				setState(68);
				match(COMILLAS);
				setState(69);
				match(COMA);
				}
				break;
			case REQUESTTYPE:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				match(REQUESTTYPE);
				setState(72);
				match(DOS_PUNTOS);
				setState(73);
				match(COMILLAS);
				setState(74);
				match(ID);
				setState(75);
				match(COMILLAS);
				setState(76);
				match(COMA);
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
		enterRule(_localctx, 6, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
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
		enterRule(_localctx, 8, RULE_object);
		int _la;
		try {
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				match(LLA_IZQ);
				setState(82);
				pair();
				setState(87);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(83);
					match(COMA);
					setState(84);
					pair();
					}
					}
					setState(89);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(90);
				match(LLA_DER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(92);
				match(LLA_IZQ);
				setState(93);
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
		enterRule(_localctx, 10, RULE_pair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			match(STRING);
			setState(97);
			match(DOS_PUNTOS);
			setState(98);
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
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			setState(113);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				match(COR_IZQ);
				setState(101);
				value();
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMA) {
					{
					{
					setState(102);
					match(COMA);
					setState(103);
					value();
					}
					}
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(109);
				match(COR_DER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(COR_IZQ);
				setState(112);
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
		enterRule(_localctx, 14, RULE_value);
		try {
			setState(122);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(115);
				match(STRING);
				}
				break;
			case NUMBER:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(NUMBER);
				}
				break;
			case LLA_IZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(117);
				object();
				}
				break;
			case COR_IZQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(118);
				array();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 5);
				{
				setState(119);
				match(T__0);
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 6);
				{
				setState(120);
				match(T__1);
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 7);
				{
				setState(121);
				match(T__2);
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

	public static class FragmentaddressContext extends ParserRuleContext {
		public UriContext uri() {
			return getRuleContext(UriContext.class,0);
		}
		public FragmentidContext fragmentid() {
			return getRuleContext(FragmentidContext.class,0);
		}
		public TerminalNode WS() { return getToken(MyLanguageParser.WS, 0); }
		public FragmentaddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentaddress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterFragmentaddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitFragmentaddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitFragmentaddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragmentaddressContext fragmentaddress() throws RecognitionException {
		FragmentaddressContext _localctx = new FragmentaddressContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_fragmentaddress);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			uri();
			setState(127);
			_la = _input.LA(1);
			if (_la==T__3) {
				{
				setState(125);
				match(T__3);
				setState(126);
				fragmentid();
				}
			}

			setState(130);
			_la = _input.LA(1);
			if (_la==WS) {
				{
				setState(129);
				match(WS);
				}
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

	public static class UriContext extends ParserRuleContext {
		public UrlContext url() {
			return getRuleContext(UrlContext.class,0);
		}
		public UriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_uri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterUri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitUri(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitUri(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UriContext uri() throws RecognitionException {
		UriContext _localctx = new UriContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_uri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			url();
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

	public static class UrlContext extends ParserRuleContext {
		public AuthorityContext authority() {
			return getRuleContext(AuthorityContext.class,0);
		}
		public HostContext host() {
			return getRuleContext(HostContext.class,0);
		}
		public LoginContext login() {
			return getRuleContext(LoginContext.class,0);
		}
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public SearchContext search() {
			return getRuleContext(SearchContext.class,0);
		}
		public UrlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_url; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterUrl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitUrl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitUrl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UrlContext url() throws RecognitionException {
		UrlContext _localctx = new UrlContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_url);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			authority();
			setState(135);
			match(T__4);
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(136);
				login();
				}
				break;
			}
			setState(139);
			host();
			setState(142);
			_la = _input.LA(1);
			if (_la==DOS_PUNTOS) {
				{
				setState(140);
				match(DOS_PUNTOS);
				setState(141);
				port();
				}
			}

			setState(146);
			_la = _input.LA(1);
			if (_la==T__5) {
				{
				setState(144);
				match(T__5);
				setState(145);
				path();
				}
			}

			setState(150);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(148);
				match(T__6);
				setState(149);
				search();
				}
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

	public static class AuthorityContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MyLanguageParser.STRING, 0); }
		public AuthorityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_authority; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterAuthority(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitAuthority(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitAuthority(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AuthorityContext authority() throws RecognitionException {
		AuthorityContext _localctx = new AuthorityContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_authority);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(STRING);
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

	public static class HostContext extends ParserRuleContext {
		public HostnameContext hostname() {
			return getRuleContext(HostnameContext.class,0);
		}
		public HostnumberContext hostnumber() {
			return getRuleContext(HostnumberContext.class,0);
		}
		public HostContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_host; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterHost(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitHost(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitHost(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostContext host() throws RecognitionException {
		HostContext _localctx = new HostContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_host);
		try {
			setState(156);
			switch (_input.LA(1)) {
			case STRING:
				enterOuterAlt(_localctx, 1);
				{
				setState(154);
				hostname();
				}
				break;
			case DIGITS:
				enterOuterAlt(_localctx, 2);
				{
				setState(155);
				hostnumber();
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

	public static class CellnameContext extends ParserRuleContext {
		public HostnameContext hostname() {
			return getRuleContext(HostnameContext.class,0);
		}
		public CellnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cellname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterCellname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitCellname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitCellname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CellnameContext cellname() throws RecognitionException {
		CellnameContext _localctx = new CellnameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cellname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			hostname();
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

	public static class HostnameContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MyLanguageParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyLanguageParser.STRING, i);
		}
		public HostnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterHostname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitHostname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitHostname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostnameContext hostname() throws RecognitionException {
		HostnameContext _localctx = new HostnameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_hostname);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(STRING);
			setState(165);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(161);
				match(T__7);
				setState(162);
				match(STRING);
				}
				}
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class HostnumberContext extends ParserRuleContext {
		public List<TerminalNode> DIGITS() { return getTokens(MyLanguageParser.DIGITS); }
		public TerminalNode DIGITS(int i) {
			return getToken(MyLanguageParser.DIGITS, i);
		}
		public HostnumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostnumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterHostnumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitHostnumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitHostnumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostnumberContext hostnumber() throws RecognitionException {
		HostnumberContext _localctx = new HostnumberContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_hostnumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(DIGITS);
			setState(169);
			match(T__7);
			setState(170);
			match(DIGITS);
			setState(171);
			match(T__7);
			setState(172);
			match(DIGITS);
			setState(173);
			match(T__7);
			setState(174);
			match(DIGITS);
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

	public static class PortContext extends ParserRuleContext {
		public TerminalNode DIGITS() { return getToken(MyLanguageParser.DIGITS, 0); }
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitPort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitPort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_port);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(DIGITS);
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

	public static class PathContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MyLanguageParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyLanguageParser.STRING, i);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_path);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(178);
			match(STRING);
			setState(183);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__5) {
				{
				{
				setState(179);
				match(T__5);
				setState(180);
				match(STRING);
				}
				}
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SearchContext extends ParserRuleContext {
		public List<SearchparameterContext> searchparameter() {
			return getRuleContexts(SearchparameterContext.class);
		}
		public SearchparameterContext searchparameter(int i) {
			return getRuleContext(SearchparameterContext.class,i);
		}
		public SearchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_search; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterSearch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitSearch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitSearch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchContext search() throws RecognitionException {
		SearchContext _localctx = new SearchContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_search);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			searchparameter();
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__8) {
				{
				{
				setState(187);
				match(T__8);
				setState(188);
				searchparameter();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class SearchparameterContext extends ParserRuleContext {
		public List<TerminalNode> STRING() { return getTokens(MyLanguageParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(MyLanguageParser.STRING, i);
		}
		public TerminalNode DIGITS() { return getToken(MyLanguageParser.DIGITS, 0); }
		public TerminalNode HEX() { return getToken(MyLanguageParser.HEX, 0); }
		public SearchparameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_searchparameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterSearchparameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitSearchparameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitSearchparameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SearchparameterContext searchparameter() throws RecognitionException {
		SearchparameterContext _localctx = new SearchparameterContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_searchparameter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(STRING);
			setState(197);
			_la = _input.LA(1);
			if (_la==T__9) {
				{
				setState(195);
				match(T__9);
				setState(196);
				_la = _input.LA(1);
				if ( !(((((_la - 69)) & ~0x3f) == 0 && ((1L << (_la - 69)) & ((1L << (HEX - 69)) | (1L << (STRING - 69)) | (1L << (DIGITS - 69)))) != 0)) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
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

	public static class UserContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MyLanguageParser.STRING, 0); }
		public UserContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_user; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterUser(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitUser(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitUser(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserContext user() throws RecognitionException {
		UserContext _localctx = new UserContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(STRING);
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

	public static class LoginContext extends ParserRuleContext {
		public UserContext user() {
			return getRuleContext(UserContext.class,0);
		}
		public PasswordContext password() {
			return getRuleContext(PasswordContext.class,0);
		}
		public LoginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_login; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterLogin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitLogin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitLogin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoginContext login() throws RecognitionException {
		LoginContext _localctx = new LoginContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_login);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			user();
			setState(202);
			match(DOS_PUNTOS);
			setState(203);
			password();
			setState(204);
			match(T__10);
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

	public static class PasswordContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MyLanguageParser.STRING, 0); }
		public PasswordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_password; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterPassword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitPassword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitPassword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PasswordContext password() throws RecognitionException {
		PasswordContext _localctx = new PasswordContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_password);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(STRING);
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

	public static class FragmentidContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(MyLanguageParser.STRING, 0); }
		public FragmentidContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fragmentid; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).enterFragmentid(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MyLanguageListener ) ((MyLanguageListener)listener).exitFragmentid(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MyLanguageVisitor ) return ((MyLanguageVisitor<? extends T>)visitor).visitFragmentid(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FragmentidContext fragmentid() throws RecognitionException {
		FragmentidContext _localctx = new FragmentidContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_fragmentid);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			match(STRING);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3I\u00d5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\7\3<\n\3\f\3\16\3?\13\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4P\n\4\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\7\6X\n\6\f\6\16\6[\13\6\3\6\3\6\3\6\3\6\5\6a\n\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bk\n\b\f\b\16\bn\13\b\3\b\3\b\3\b\3\b\5\b"+
		"t\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t}\n\t\3\n\3\n\3\n\5\n\u0082\n\n\3"+
		"\n\5\n\u0085\n\n\3\13\3\13\3\f\3\f\3\f\5\f\u008c\n\f\3\f\3\f\3\f\5\f\u0091"+
		"\n\f\3\f\3\f\5\f\u0095\n\f\3\f\3\f\5\f\u0099\n\f\3\r\3\r\3\16\3\16\5\16"+
		"\u009f\n\16\3\17\3\17\3\20\3\20\3\20\7\20\u00a6\n\20\f\20\16\20\u00a9"+
		"\13\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\7\23\u00b8\n\23\f\23\16\23\u00bb\13\23\3\24\3\24\3\24\7\24\u00c0\n\24"+
		"\f\24\16\24\u00c3\13\24\3\25\3\25\3\25\5\25\u00c8\n\25\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\2\2\32\2\4\6\b\n\f\16\20"+
		"\22\24\26\30\32\34\36 \"$&(*,.\60\2\3\3\2GI\u00d3\2\62\3\2\2\2\4\67\3"+
		"\2\2\2\6O\3\2\2\2\bQ\3\2\2\2\n`\3\2\2\2\fb\3\2\2\2\16s\3\2\2\2\20|\3\2"+
		"\2\2\22~\3\2\2\2\24\u0086\3\2\2\2\26\u0088\3\2\2\2\30\u009a\3\2\2\2\32"+
		"\u009e\3\2\2\2\34\u00a0\3\2\2\2\36\u00a2\3\2\2\2 \u00aa\3\2\2\2\"\u00b2"+
		"\3\2\2\2$\u00b4\3\2\2\2&\u00bc\3\2\2\2(\u00c4\3\2\2\2*\u00c9\3\2\2\2,"+
		"\u00cb\3\2\2\2.\u00d0\3\2\2\2\60\u00d2\3\2\2\2\62\63\7\26\2\2\63\64\7"+
		";\2\2\64\65\7E\2\2\65\66\5\4\3\2\66\3\3\2\2\2\678\7\16\2\289\7;\2\29="+
		"\79\2\2:<\5\6\4\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?="+
		"\3\2\2\2@A\7:\2\2A\5\3\2\2\2BC\7\17\2\2CD\7;\2\2DE\7<\2\2EF\5\22\n\2F"+
		"G\7<\2\2GH\7=\2\2HP\3\2\2\2IJ\7\25\2\2JK\7;\2\2KL\7<\2\2LM\7E\2\2MN\7"+
		"<\2\2NP\7=\2\2OB\3\2\2\2OI\3\2\2\2P\7\3\2\2\2QR\5\20\t\2R\t\3\2\2\2ST"+
		"\79\2\2TY\5\f\7\2UV\7=\2\2VX\5\f\7\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3"+
		"\2\2\2Z\\\3\2\2\2[Y\3\2\2\2\\]\7:\2\2]a\3\2\2\2^_\79\2\2_a\7:\2\2`S\3"+
		"\2\2\2`^\3\2\2\2a\13\3\2\2\2bc\7H\2\2cd\7;\2\2de\5\20\t\2e\r\3\2\2\2f"+
		"g\7\67\2\2gl\5\20\t\2hi\7=\2\2ik\5\20\t\2jh\3\2\2\2kn\3\2\2\2lj\3\2\2"+
		"\2lm\3\2\2\2mo\3\2\2\2nl\3\2\2\2op\78\2\2pt\3\2\2\2qr\7\67\2\2rt\78\2"+
		"\2sf\3\2\2\2sq\3\2\2\2t\17\3\2\2\2u}\7H\2\2v}\7F\2\2w}\5\n\6\2x}\5\16"+
		"\b\2y}\7\3\2\2z}\7\4\2\2{}\7\5\2\2|u\3\2\2\2|v\3\2\2\2|w\3\2\2\2|x\3\2"+
		"\2\2|y\3\2\2\2|z\3\2\2\2|{\3\2\2\2}\21\3\2\2\2~\u0081\5\24\13\2\177\u0080"+
		"\7\6\2\2\u0080\u0082\5\60\31\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0084\3\2\2\2\u0083\u0085\7\31\2\2\u0084\u0083\3\2\2\2\u0084\u0085\3"+
		"\2\2\2\u0085\23\3\2\2\2\u0086\u0087\5\26\f\2\u0087\25\3\2\2\2\u0088\u0089"+
		"\5\30\r\2\u0089\u008b\7\7\2\2\u008a\u008c\5,\27\2\u008b\u008a\3\2\2\2"+
		"\u008b\u008c\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u0090\5\32\16\2\u008e\u008f"+
		"\7;\2\2\u008f\u0091\5\"\22\2\u0090\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091"+
		"\u0094\3\2\2\2\u0092\u0093\7\b\2\2\u0093\u0095\5$\23\2\u0094\u0092\3\2"+
		"\2\2\u0094\u0095\3\2\2\2\u0095\u0098\3\2\2\2\u0096\u0097\7\t\2\2\u0097"+
		"\u0099\5&\24\2\u0098\u0096\3\2\2\2\u0098\u0099\3\2\2\2\u0099\27\3\2\2"+
		"\2\u009a\u009b\7H\2\2\u009b\31\3\2\2\2\u009c\u009f\5\36\20\2\u009d\u009f"+
		"\5 \21\2\u009e\u009c\3\2\2\2\u009e\u009d\3\2\2\2\u009f\33\3\2\2\2\u00a0"+
		"\u00a1\5\36\20\2\u00a1\35\3\2\2\2\u00a2\u00a7\7H\2\2\u00a3\u00a4\7\n\2"+
		"\2\u00a4\u00a6\7H\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a9\3\2\2\2\u00a7\u00a5"+
		"\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\37\3\2\2\2\u00a9\u00a7\3\2\2\2\u00aa"+
		"\u00ab\7I\2\2\u00ab\u00ac\7\n\2\2\u00ac\u00ad\7I\2\2\u00ad\u00ae\7\n\2"+
		"\2\u00ae\u00af\7I\2\2\u00af\u00b0\7\n\2\2\u00b0\u00b1\7I\2\2\u00b1!\3"+
		"\2\2\2\u00b2\u00b3\7I\2\2\u00b3#\3\2\2\2\u00b4\u00b9\7H\2\2\u00b5\u00b6"+
		"\7\b\2\2\u00b6\u00b8\7H\2\2\u00b7\u00b5\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00b7\3\2\2\2\u00b9\u00ba\3\2\2\2\u00ba%\3\2\2\2\u00bb\u00b9\3\2\2\2"+
		"\u00bc\u00c1\5(\25\2\u00bd\u00be\7\13\2\2\u00be\u00c0\5(\25\2\u00bf\u00bd"+
		"\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2"+
		"\'\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\7H\2\2\u00c5\u00c6\7\f\2\2"+
		"\u00c6\u00c8\t\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8)\3"+
		"\2\2\2\u00c9\u00ca\7H\2\2\u00ca+\3\2\2\2\u00cb\u00cc\5*\26\2\u00cc\u00cd"+
		"\7;\2\2\u00cd\u00ce\5.\30\2\u00ce\u00cf\7\r\2\2\u00cf-\3\2\2\2\u00d0\u00d1"+
		"\7H\2\2\u00d1/\3\2\2\2\u00d2\u00d3\7H\2\2\u00d3\61\3\2\2\2\24=OY`ls|\u0081"+
		"\u0084\u008b\u0090\u0094\u0098\u009e\u00a7\u00b9\u00c1\u00c7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}