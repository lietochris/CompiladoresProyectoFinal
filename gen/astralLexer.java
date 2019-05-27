// Generated from D:/CHRIS/Escuela/Semestre6/Compiladores/compiladores_proyectofinal/src\astral.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class astralLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, VAR=2, IF=3, ELSE=4, ENDIF=5, WHILE=6, ENDWHILE=7, FOR=8, ENDFOR=9, 
		SUMA=10, RESTA=11, MULTI=12, DIVI=13, PARA=14, PARB=15, IGUAL=16, BOOLEANO=17, 
		MAYOR=18, MENOR=19, MAYORIGUAL=20, MENORIGUAL=21, TOTALIGUAL=22, PYQ=23, 
		DP=24, COMILLAS=25, NUMERO=26, STRING=27, ID=28, COMENTARIO=29, WS=30;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PRINT", "VAR", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", "FOR", "ENDFOR", 
			"SUMA", "RESTA", "MULTI", "DIVI", "PARA", "PARB", "IGUAL", "BOOLEANO", 
			"MAYOR", "MENOR", "MAYORIGUAL", "MENORIGUAL", "TOTALIGUAL", "PYQ", "DP", 
			"COMILLAS", "NUMERO", "STRING", "ID", "COMENTARIO", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'var'", "'if'", "'else'", "'endif'", "'while'", "'endwhile'", 
			"'for'", "'endfor'", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'='", 
			null, "'>'", "'<'", "'>='", "'<='", "'=='", "';'", "':'", "'\"'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PRINT", "VAR", "IF", "ELSE", "ENDIF", "WHILE", "ENDWHILE", "FOR", 
			"ENDFOR", "SUMA", "RESTA", "MULTI", "DIVI", "PARA", "PARB", "IGUAL", 
			"BOOLEANO", "MAYOR", "MENOR", "MAYORIGUAL", "MENORIGUAL", "TOTALIGUAL", 
			"PYQ", "DP", "COMILLAS", "NUMERO", "STRING", "ID", "COMENTARIO", "WS"
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


	public astralLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "astral.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00d9\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3"+
		"\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u0089\n\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3\33\6\33"+
		"\u009f\n\33\r\33\16\33\u00a0\3\33\6\33\u00a4\n\33\r\33\16\33\u00a5\3\33"+
		"\3\33\6\33\u00aa\n\33\r\33\16\33\u00ab\5\33\u00ae\n\33\3\34\3\34\7\34"+
		"\u00b2\n\34\f\34\16\34\u00b5\13\34\3\34\3\34\3\35\3\35\7\35\u00bb\n\35"+
		"\f\35\16\35\u00be\13\35\3\36\3\36\3\36\3\36\3\36\6\36\u00c5\n\36\r\36"+
		"\16\36\u00c6\7\36\u00c9\n\36\f\36\16\36\u00cc\13\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\37\6\37\u00d4\n\37\r\37\16\37\u00d5\3\37\3\37\2\2 \3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= \3\2\7\3\2"+
		"\62;\3\2$$\5\2C\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00e3\2\3\3"+
		"\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2"+
		"\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3"+
		"\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2"+
		"%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61"+
		"\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2"+
		"\2=\3\2\2\2\3?\3\2\2\2\5E\3\2\2\2\7I\3\2\2\2\tL\3\2\2\2\13Q\3\2\2\2\r"+
		"W\3\2\2\2\17]\3\2\2\2\21f\3\2\2\2\23j\3\2\2\2\25q\3\2\2\2\27s\3\2\2\2"+
		"\31u\3\2\2\2\33w\3\2\2\2\35y\3\2\2\2\37{\3\2\2\2!}\3\2\2\2#\u0088\3\2"+
		"\2\2%\u008a\3\2\2\2\'\u008c\3\2\2\2)\u008e\3\2\2\2+\u0091\3\2\2\2-\u0094"+
		"\3\2\2\2/\u0097\3\2\2\2\61\u0099\3\2\2\2\63\u009b\3\2\2\2\65\u00ad\3\2"+
		"\2\2\67\u00af\3\2\2\29\u00b8\3\2\2\2;\u00bf\3\2\2\2=\u00d3\3\2\2\2?@\7"+
		"r\2\2@A\7t\2\2AB\7k\2\2BC\7p\2\2CD\7v\2\2D\4\3\2\2\2EF\7x\2\2FG\7c\2\2"+
		"GH\7t\2\2H\6\3\2\2\2IJ\7k\2\2JK\7h\2\2K\b\3\2\2\2LM\7g\2\2MN\7n\2\2NO"+
		"\7u\2\2OP\7g\2\2P\n\3\2\2\2QR\7g\2\2RS\7p\2\2ST\7f\2\2TU\7k\2\2UV\7h\2"+
		"\2V\f\3\2\2\2WX\7y\2\2XY\7j\2\2YZ\7k\2\2Z[\7n\2\2[\\\7g\2\2\\\16\3\2\2"+
		"\2]^\7g\2\2^_\7p\2\2_`\7f\2\2`a\7y\2\2ab\7j\2\2bc\7k\2\2cd\7n\2\2de\7"+
		"g\2\2e\20\3\2\2\2fg\7h\2\2gh\7q\2\2hi\7t\2\2i\22\3\2\2\2jk\7g\2\2kl\7"+
		"p\2\2lm\7f\2\2mn\7h\2\2no\7q\2\2op\7t\2\2p\24\3\2\2\2qr\7-\2\2r\26\3\2"+
		"\2\2st\7/\2\2t\30\3\2\2\2uv\7,\2\2v\32\3\2\2\2wx\7\61\2\2x\34\3\2\2\2"+
		"yz\7*\2\2z\36\3\2\2\2{|\7+\2\2| \3\2\2\2}~\7?\2\2~\"\3\2\2\2\177\u0080"+
		"\7v\2\2\u0080\u0081\7t\2\2\u0081\u0082\7w\2\2\u0082\u0089\7g\2\2\u0083"+
		"\u0084\7h\2\2\u0084\u0085\7c\2\2\u0085\u0086\7n\2\2\u0086\u0087\7u\2\2"+
		"\u0087\u0089\7g\2\2\u0088\177\3\2\2\2\u0088\u0083\3\2\2\2\u0089$\3\2\2"+
		"\2\u008a\u008b\7@\2\2\u008b&\3\2\2\2\u008c\u008d\7>\2\2\u008d(\3\2\2\2"+
		"\u008e\u008f\7@\2\2\u008f\u0090\7?\2\2\u0090*\3\2\2\2\u0091\u0092\7>\2"+
		"\2\u0092\u0093\7?\2\2\u0093,\3\2\2\2\u0094\u0095\7?\2\2\u0095\u0096\7"+
		"?\2\2\u0096.\3\2\2\2\u0097\u0098\7=\2\2\u0098\60\3\2\2\2\u0099\u009a\7"+
		"<\2\2\u009a\62\3\2\2\2\u009b\u009c\7$\2\2\u009c\64\3\2\2\2\u009d\u009f"+
		"\t\2\2\2\u009e\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\u00ae\3\2\2\2\u00a2\u00a4\t\2\2\2\u00a3\u00a2\3\2"+
		"\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6"+
		"\u00a7\3\2\2\2\u00a7\u00a9\7\60\2\2\u00a8\u00aa\t\2\2\2\u00a9\u00a8\3"+
		"\2\2\2\u00aa\u00ab\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac"+
		"\u00ae\3\2\2\2\u00ad\u009e\3\2\2\2\u00ad\u00a3\3\2\2\2\u00ae\66\3\2\2"+
		"\2\u00af\u00b3\7$\2\2\u00b0\u00b2\n\3\2\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5"+
		"\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3\u00b4\3\2\2\2\u00b4\u00b6\3\2\2\2\u00b5"+
		"\u00b3\3\2\2\2\u00b6\u00b7\7$\2\2\u00b78\3\2\2\2\u00b8\u00bc\t\4\2\2\u00b9"+
		"\u00bb\t\5\2\2\u00ba\u00b9\3\2\2\2\u00bb\u00be\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd:\3\2\2\2\u00be\u00bc\3\2\2\2\u00bf\u00c0"+
		"\7\61\2\2\u00c0\u00c1\7,\2\2\u00c1\u00ca\3\2\2\2\u00c2\u00c9\7\"\2\2\u00c3"+
		"\u00c5\t\5\2\2\u00c4\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c4\3\2"+
		"\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c2\3\2\2\2\u00c8"+
		"\u00c4\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00ca\u00cb\3\2"+
		"\2\2\u00cb\u00cd\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cd\u00ce\7,\2\2\u00ce"+
		"\u00cf\7\61\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\b\36\2\2\u00d1<\3\2\2"+
		"\2\u00d2\u00d4\t\6\2\2\u00d3\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00d3"+
		"\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\b\37\2\2"+
		"\u00d8>\3\2\2\2\16\2\u0088\u00a0\u00a5\u00ab\u00ad\u00b3\u00bc\u00c6\u00c8"+
		"\u00ca\u00d5\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}