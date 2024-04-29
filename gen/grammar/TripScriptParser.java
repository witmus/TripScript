// Generated from C:/Users/witek/IdeaProjects/TripScript/src/grammar/TripScript.g4 by ANTLR 4.13.1
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TripScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, FROM_KW=4, ADD_TOWN_KW=5, ADD_ATTRACTION_KW=6, 
		REMOVE_TOWN_KW=7, REMOVE_ATTRACTION_KW=8, FIRST_KW=9, SHOW_ATTRACTIONS_KW=10, 
		SHOW_ROUTE_KW=11, LAST_DAY_KW=12, START_KW=13, DATE=14, INT=15, WORD=16, 
		NEWLINE=17, WS=18;
	public static final int
		RULE_prog = 0, RULE_stat = 1;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "stat"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'('", "')'", "','", "'from'", "'add_town'", "'add_attraction'", 
			"'remove_town'", "'remove_attraction'", "'first'", "'show_attractions'", 
			"'show_route'", "'last_day'", "'start'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "FROM_KW", "ADD_TOWN_KW", "ADD_ATTRACTION_KW", 
			"REMOVE_TOWN_KW", "REMOVE_ATTRACTION_KW", "FIRST_KW", "SHOW_ATTRACTIONS_KW", 
			"SHOW_ROUTE_KW", "LAST_DAY_KW", "START_KW", "DATE", "INT", "WORD", "NEWLINE", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "TripScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TripScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TripScriptParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripScriptVisitor ) return ((TripScriptVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(7);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16368L) != 0)) {
				{
				{
				setState(4);
				stat();
				}
				}
				setState(9);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(10);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Add_town_statContext extends StatContext {
		public Token town;
		public Token days;
		public TerminalNode ADD_TOWN_KW() { return getToken(TripScriptParser.ADD_TOWN_KW, 0); }
		public TerminalNode WORD() { return getToken(TripScriptParser.WORD, 0); }
		public TerminalNode INT() { return getToken(TripScriptParser.INT, 0); }
		public Add_town_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).enterAdd_town_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).exitAdd_town_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripScriptVisitor ) return ((TripScriptVisitor<? extends T>)visitor).visitAdd_town_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Add_attraction_statContext extends StatContext {
		public Token town;
		public Token name;
		public TerminalNode ADD_ATTRACTION_KW() { return getToken(TripScriptParser.ADD_ATTRACTION_KW, 0); }
		public List<TerminalNode> WORD() { return getTokens(TripScriptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(TripScriptParser.WORD, i);
		}
		public Add_attraction_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).enterAdd_attraction_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).exitAdd_attraction_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripScriptVisitor ) return ((TripScriptVisitor<? extends T>)visitor).visitAdd_attraction_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Remove_town_statContext extends StatContext {
		public Token town;
		public TerminalNode REMOVE_TOWN_KW() { return getToken(TripScriptParser.REMOVE_TOWN_KW, 0); }
		public TerminalNode WORD() { return getToken(TripScriptParser.WORD, 0); }
		public Remove_town_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).enterRemove_town_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).exitRemove_town_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripScriptVisitor ) return ((TripScriptVisitor<? extends T>)visitor).visitRemove_town_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Remove_attraction_statContext extends StatContext {
		public Token town;
		public Token name;
		public TerminalNode REMOVE_ATTRACTION_KW() { return getToken(TripScriptParser.REMOVE_ATTRACTION_KW, 0); }
		public List<TerminalNode> WORD() { return getTokens(TripScriptParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(TripScriptParser.WORD, i);
		}
		public Remove_attraction_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).enterRemove_attraction_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).exitRemove_attraction_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripScriptVisitor ) return ((TripScriptVisitor<? extends T>)visitor).visitRemove_attraction_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class From_statContext extends StatContext {
		public Token date;
		public TerminalNode FROM_KW() { return getToken(TripScriptParser.FROM_KW, 0); }
		public TerminalNode DATE() { return getToken(TripScriptParser.DATE, 0); }
		public From_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).enterFrom_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).exitFrom_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripScriptVisitor ) return ((TripScriptVisitor<? extends T>)visitor).visitFrom_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class First_statContext extends StatContext {
		public Token town;
		public TerminalNode FIRST_KW() { return getToken(TripScriptParser.FIRST_KW, 0); }
		public TerminalNode WORD() { return getToken(TripScriptParser.WORD, 0); }
		public First_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).enterFirst_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).exitFirst_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripScriptVisitor ) return ((TripScriptVisitor<? extends T>)visitor).visitFirst_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Show_attractions_statContext extends StatContext {
		public Token town;
		public TerminalNode SHOW_ATTRACTIONS_KW() { return getToken(TripScriptParser.SHOW_ATTRACTIONS_KW, 0); }
		public TerminalNode WORD() { return getToken(TripScriptParser.WORD, 0); }
		public Show_attractions_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).enterShow_attractions_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).exitShow_attractions_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripScriptVisitor ) return ((TripScriptVisitor<? extends T>)visitor).visitShow_attractions_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Start_statContext extends StatContext {
		public TerminalNode START_KW() { return getToken(TripScriptParser.START_KW, 0); }
		public Start_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).enterStart_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).exitStart_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripScriptVisitor ) return ((TripScriptVisitor<? extends T>)visitor).visitStart_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Last_day_statContext extends StatContext {
		public TerminalNode LAST_DAY_KW() { return getToken(TripScriptParser.LAST_DAY_KW, 0); }
		public Last_day_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).enterLast_day_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).exitLast_day_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripScriptVisitor ) return ((TripScriptVisitor<? extends T>)visitor).visitLast_day_stat(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Show_route_statContext extends StatContext {
		public TerminalNode SHOW_ROUTE_KW() { return getToken(TripScriptParser.SHOW_ROUTE_KW, 0); }
		public Show_route_statContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).enterShow_route_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TripScriptListener ) ((TripScriptListener)listener).exitShow_route_stat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TripScriptVisitor ) return ((TripScriptVisitor<? extends T>)visitor).visitShow_route_stat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(51);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FROM_KW:
				_localctx = new From_statContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(12);
				match(FROM_KW);
				setState(13);
				match(T__0);
				setState(14);
				((From_statContext)_localctx).date = match(DATE);
				setState(15);
				match(T__1);
				}
				break;
			case ADD_TOWN_KW:
				_localctx = new Add_town_statContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(ADD_TOWN_KW);
				setState(17);
				match(T__0);
				setState(18);
				((Add_town_statContext)_localctx).town = match(WORD);
				setState(19);
				match(T__2);
				setState(20);
				((Add_town_statContext)_localctx).days = match(INT);
				setState(21);
				match(T__1);
				}
				break;
			case ADD_ATTRACTION_KW:
				_localctx = new Add_attraction_statContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(22);
				match(ADD_ATTRACTION_KW);
				setState(23);
				match(T__0);
				setState(24);
				((Add_attraction_statContext)_localctx).town = match(WORD);
				setState(25);
				match(T__2);
				setState(26);
				((Add_attraction_statContext)_localctx).name = match(WORD);
				setState(27);
				match(T__1);
				}
				break;
			case REMOVE_TOWN_KW:
				_localctx = new Remove_town_statContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(28);
				match(REMOVE_TOWN_KW);
				setState(29);
				match(T__0);
				setState(30);
				((Remove_town_statContext)_localctx).town = match(WORD);
				setState(31);
				match(T__1);
				}
				break;
			case REMOVE_ATTRACTION_KW:
				_localctx = new Remove_attraction_statContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(32);
				match(REMOVE_ATTRACTION_KW);
				setState(33);
				match(T__0);
				setState(34);
				((Remove_attraction_statContext)_localctx).town = match(WORD);
				setState(35);
				match(T__2);
				setState(36);
				((Remove_attraction_statContext)_localctx).name = match(WORD);
				setState(37);
				match(T__1);
				}
				break;
			case FIRST_KW:
				_localctx = new First_statContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(38);
				match(FIRST_KW);
				setState(39);
				match(T__0);
				setState(40);
				((First_statContext)_localctx).town = match(WORD);
				setState(41);
				match(T__1);
				}
				break;
			case SHOW_ATTRACTIONS_KW:
				_localctx = new Show_attractions_statContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(42);
				match(SHOW_ATTRACTIONS_KW);
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(43);
					match(T__0);
					setState(44);
					((Show_attractions_statContext)_localctx).town = match(WORD);
					setState(45);
					match(T__1);
					}
				}

				}
				break;
			case SHOW_ROUTE_KW:
				_localctx = new Show_route_statContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(48);
				match(SHOW_ROUTE_KW);
				}
				break;
			case LAST_DAY_KW:
				_localctx = new Last_day_statContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(49);
				match(LAST_DAY_KW);
				}
				break;
			case START_KW:
				_localctx = new Start_statContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(50);
				match(START_KW);
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

	public static final String _serializedATN =
		"\u0004\u0001\u00126\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0001"+
		"\u0000\u0005\u0000\u0006\b\u0000\n\u0000\f\u0000\t\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001"+
		"/\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00014\b\u0001\u0001"+
		"\u0001\u0000\u0000\u0002\u0000\u0002\u0000\u0000>\u0000\u0007\u0001\u0000"+
		"\u0000\u0000\u00023\u0001\u0000\u0000\u0000\u0004\u0006\u0003\u0002\u0001"+
		"\u0000\u0005\u0004\u0001\u0000\u0000\u0000\u0006\t\u0001\u0000\u0000\u0000"+
		"\u0007\u0005\u0001\u0000\u0000\u0000\u0007\b\u0001\u0000\u0000\u0000\b"+
		"\n\u0001\u0000\u0000\u0000\t\u0007\u0001\u0000\u0000\u0000\n\u000b\u0005"+
		"\u0000\u0000\u0001\u000b\u0001\u0001\u0000\u0000\u0000\f\r\u0005\u0004"+
		"\u0000\u0000\r\u000e\u0005\u0001\u0000\u0000\u000e\u000f\u0005\u000e\u0000"+
		"\u0000\u000f4\u0005\u0002\u0000\u0000\u0010\u0011\u0005\u0005\u0000\u0000"+
		"\u0011\u0012\u0005\u0001\u0000\u0000\u0012\u0013\u0005\u0010\u0000\u0000"+
		"\u0013\u0014\u0005\u0003\u0000\u0000\u0014\u0015\u0005\u000f\u0000\u0000"+
		"\u00154\u0005\u0002\u0000\u0000\u0016\u0017\u0005\u0006\u0000\u0000\u0017"+
		"\u0018\u0005\u0001\u0000\u0000\u0018\u0019\u0005\u0010\u0000\u0000\u0019"+
		"\u001a\u0005\u0003\u0000\u0000\u001a\u001b\u0005\u0010\u0000\u0000\u001b"+
		"4\u0005\u0002\u0000\u0000\u001c\u001d\u0005\u0007\u0000\u0000\u001d\u001e"+
		"\u0005\u0001\u0000\u0000\u001e\u001f\u0005\u0010\u0000\u0000\u001f4\u0005"+
		"\u0002\u0000\u0000 !\u0005\b\u0000\u0000!\"\u0005\u0001\u0000\u0000\""+
		"#\u0005\u0010\u0000\u0000#$\u0005\u0003\u0000\u0000$%\u0005\u0010\u0000"+
		"\u0000%4\u0005\u0002\u0000\u0000&\'\u0005\t\u0000\u0000\'(\u0005\u0001"+
		"\u0000\u0000()\u0005\u0010\u0000\u0000)4\u0005\u0002\u0000\u0000*.\u0005"+
		"\n\u0000\u0000+,\u0005\u0001\u0000\u0000,-\u0005\u0010\u0000\u0000-/\u0005"+
		"\u0002\u0000\u0000.+\u0001\u0000\u0000\u0000./\u0001\u0000\u0000\u0000"+
		"/4\u0001\u0000\u0000\u000004\u0005\u000b\u0000\u000014\u0005\f\u0000\u0000"+
		"24\u0005\r\u0000\u00003\f\u0001\u0000\u0000\u00003\u0010\u0001\u0000\u0000"+
		"\u00003\u0016\u0001\u0000\u0000\u00003\u001c\u0001\u0000\u0000\u00003"+
		" \u0001\u0000\u0000\u00003&\u0001\u0000\u0000\u00003*\u0001\u0000\u0000"+
		"\u000030\u0001\u0000\u0000\u000031\u0001\u0000\u0000\u000032\u0001\u0000"+
		"\u0000\u00004\u0003\u0001\u0000\u0000\u0000\u0003\u0007.3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}