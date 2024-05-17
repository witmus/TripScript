// Generated from C:/Users/witek/IdeaProjects/TripScript/src/grammar/TripScript.g4 by ANTLR 4.13.1
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TripScriptLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, FROM_KW=4, ADD_TOWN_KW=5, ADD_ATTRACTION_KW=6, 
		REMOVE_TOWN_KW=7, REMOVE_ATTRACTION_KW=8, FIRST_KW=9, SHOW_ATTRACTIONS_KW=10, 
		SHOW_ROUTE_KW=11, LAST_DAY_KW=12, START_KW=13, DATE=14, INT=15, WORD=16, 
		NEWLINE=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "FROM_KW", "ADD_TOWN_KW", "ADD_ATTRACTION_KW", 
			"REMOVE_TOWN_KW", "REMOVE_ATTRACTION_KW", "FIRST_KW", "SHOW_ATTRACTIONS_KW", 
			"SHOW_ROUTE_KW", "LAST_DAY_KW", "START_KW", "DATE", "INT", "WORD", "NEWLINE", 
			"WS"
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


	public TripScriptLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "TripScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u0012\u00b7\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0004\u000e\u009f\b\u000e"+
		"\u000b\u000e\f\u000e\u00a0\u0001\u000f\u0001\u000f\u0005\u000f\u00a5\b"+
		"\u000f\n\u000f\f\u000f\u00a8\t\u000f\u0001\u0010\u0004\u0010\u00ab\b\u0010"+
		"\u000b\u0010\f\u0010\u00ac\u0001\u0010\u0001\u0010\u0001\u0011\u0004\u0011"+
		"\u00b2\b\u0011\u000b\u0011\f\u0011\u00b3\u0001\u0011\u0001\u0011\u0000"+
		"\u0000\u0012\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012\u0001\u0000\u0004\u0001\u0000"+
		"09\u0003\u0000AZ__az\u0002\u0000\n\n\r\r\u0002\u0000\t\t  \u00ba\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000\u0000!\u0001"+
		"\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0001%\u0001\u0000\u0000"+
		"\u0000\u0003\'\u0001\u0000\u0000\u0000\u0005)\u0001\u0000\u0000\u0000"+
		"\u0007+\u0001\u0000\u0000\u0000\t0\u0001\u0000\u0000\u0000\u000b9\u0001"+
		"\u0000\u0000\u0000\rH\u0001\u0000\u0000\u0000\u000fT\u0001\u0000\u0000"+
		"\u0000\u0011f\u0001\u0000\u0000\u0000\u0013l\u0001\u0000\u0000\u0000\u0015"+
		"}\u0001\u0000\u0000\u0000\u0017\u0088\u0001\u0000\u0000\u0000\u0019\u0091"+
		"\u0001\u0000\u0000\u0000\u001b\u0097\u0001\u0000\u0000\u0000\u001d\u009e"+
		"\u0001\u0000\u0000\u0000\u001f\u00a2\u0001\u0000\u0000\u0000!\u00aa\u0001"+
		"\u0000\u0000\u0000#\u00b1\u0001\u0000\u0000\u0000%&\u0005(\u0000\u0000"+
		"&\u0002\u0001\u0000\u0000\u0000\'(\u0005)\u0000\u0000(\u0004\u0001\u0000"+
		"\u0000\u0000)*\u0005,\u0000\u0000*\u0006\u0001\u0000\u0000\u0000+,\u0005"+
		"f\u0000\u0000,-\u0005r\u0000\u0000-.\u0005o\u0000\u0000./\u0005m\u0000"+
		"\u0000/\b\u0001\u0000\u0000\u000001\u0005a\u0000\u000012\u0005d\u0000"+
		"\u000023\u0005d\u0000\u000034\u0005_\u0000\u000045\u0005t\u0000\u0000"+
		"56\u0005o\u0000\u000067\u0005w\u0000\u000078\u0005n\u0000\u00008\n\u0001"+
		"\u0000\u0000\u00009:\u0005a\u0000\u0000:;\u0005d\u0000\u0000;<\u0005d"+
		"\u0000\u0000<=\u0005_\u0000\u0000=>\u0005a\u0000\u0000>?\u0005t\u0000"+
		"\u0000?@\u0005t\u0000\u0000@A\u0005r\u0000\u0000AB\u0005a\u0000\u0000"+
		"BC\u0005c\u0000\u0000CD\u0005t\u0000\u0000DE\u0005i\u0000\u0000EF\u0005"+
		"o\u0000\u0000FG\u0005n\u0000\u0000G\f\u0001\u0000\u0000\u0000HI\u0005"+
		"r\u0000\u0000IJ\u0005e\u0000\u0000JK\u0005m\u0000\u0000KL\u0005o\u0000"+
		"\u0000LM\u0005v\u0000\u0000MN\u0005e\u0000\u0000NO\u0005_\u0000\u0000"+
		"OP\u0005t\u0000\u0000PQ\u0005o\u0000\u0000QR\u0005w\u0000\u0000RS\u0005"+
		"n\u0000\u0000S\u000e\u0001\u0000\u0000\u0000TU\u0005r\u0000\u0000UV\u0005"+
		"e\u0000\u0000VW\u0005m\u0000\u0000WX\u0005o\u0000\u0000XY\u0005v\u0000"+
		"\u0000YZ\u0005e\u0000\u0000Z[\u0005_\u0000\u0000[\\\u0005a\u0000\u0000"+
		"\\]\u0005t\u0000\u0000]^\u0005t\u0000\u0000^_\u0005r\u0000\u0000_`\u0005"+
		"a\u0000\u0000`a\u0005c\u0000\u0000ab\u0005t\u0000\u0000bc\u0005i\u0000"+
		"\u0000cd\u0005o\u0000\u0000de\u0005n\u0000\u0000e\u0010\u0001\u0000\u0000"+
		"\u0000fg\u0005f\u0000\u0000gh\u0005i\u0000\u0000hi\u0005r\u0000\u0000"+
		"ij\u0005s\u0000\u0000jk\u0005t\u0000\u0000k\u0012\u0001\u0000\u0000\u0000"+
		"lm\u0005s\u0000\u0000mn\u0005h\u0000\u0000no\u0005o\u0000\u0000op\u0005"+
		"w\u0000\u0000pq\u0005_\u0000\u0000qr\u0005a\u0000\u0000rs\u0005t\u0000"+
		"\u0000st\u0005t\u0000\u0000tu\u0005r\u0000\u0000uv\u0005a\u0000\u0000"+
		"vw\u0005c\u0000\u0000wx\u0005t\u0000\u0000xy\u0005i\u0000\u0000yz\u0005"+
		"o\u0000\u0000z{\u0005n\u0000\u0000{|\u0005s\u0000\u0000|\u0014\u0001\u0000"+
		"\u0000\u0000}~\u0005s\u0000\u0000~\u007f\u0005h\u0000\u0000\u007f\u0080"+
		"\u0005o\u0000\u0000\u0080\u0081\u0005w\u0000\u0000\u0081\u0082\u0005_"+
		"\u0000\u0000\u0082\u0083\u0005r\u0000\u0000\u0083\u0084\u0005o\u0000\u0000"+
		"\u0084\u0085\u0005u\u0000\u0000\u0085\u0086\u0005t\u0000\u0000\u0086\u0087"+
		"\u0005e\u0000\u0000\u0087\u0016\u0001\u0000\u0000\u0000\u0088\u0089\u0005"+
		"l\u0000\u0000\u0089\u008a\u0005a\u0000\u0000\u008a\u008b\u0005s\u0000"+
		"\u0000\u008b\u008c\u0005t\u0000\u0000\u008c\u008d\u0005_\u0000\u0000\u008d"+
		"\u008e\u0005d\u0000\u0000\u008e\u008f\u0005a\u0000\u0000\u008f\u0090\u0005"+
		"y\u0000\u0000\u0090\u0018\u0001\u0000\u0000\u0000\u0091\u0092\u0005s\u0000"+
		"\u0000\u0092\u0093\u0005t\u0000\u0000\u0093\u0094\u0005a\u0000\u0000\u0094"+
		"\u0095\u0005r\u0000\u0000\u0095\u0096\u0005t\u0000\u0000\u0096\u001a\u0001"+
		"\u0000\u0000\u0000\u0097\u0098\u0003\u001d\u000e\u0000\u0098\u0099\u0005"+
		"-\u0000\u0000\u0099\u009a\u0003\u001d\u000e\u0000\u009a\u009b\u0005-\u0000"+
		"\u0000\u009b\u009c\u0003\u001d\u000e\u0000\u009c\u001c\u0001\u0000\u0000"+
		"\u0000\u009d\u009f\u0007\u0000\u0000\u0000\u009e\u009d\u0001\u0000\u0000"+
		"\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u009e\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a1\u0001\u0000\u0000\u0000\u00a1\u001e\u0001\u0000\u0000"+
		"\u0000\u00a2\u00a6\u0007\u0001\u0000\u0000\u00a3\u00a5\u0007\u0001\u0000"+
		"\u0000\u00a4\u00a3\u0001\u0000\u0000\u0000\u00a5\u00a8\u0001\u0000\u0000"+
		"\u0000\u00a6\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a7 \u0001\u0000\u0000\u0000\u00a8\u00a6\u0001\u0000\u0000\u0000"+
		"\u00a9\u00ab\u0007\u0002\u0000\u0000\u00aa\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac\u00aa\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae\u0001\u0000\u0000\u0000"+
		"\u00ae\u00af\u0006\u0010\u0000\u0000\u00af\"\u0001\u0000\u0000\u0000\u00b0"+
		"\u00b2\u0007\u0003\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000\u00b2"+
		"\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3"+
		"\u00b4\u0001\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5"+
		"\u00b6\u0006\u0011\u0000\u0000\u00b6$\u0001\u0000\u0000\u0000\u0005\u0000"+
		"\u00a0\u00a6\u00ac\u00b3\u0001\u0000\u0001\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}