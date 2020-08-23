// Generated from Car.g4 by ANTLR 4.4
package co.edu.javeriana.car;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMA=1, GOTO=2, BACK=3, DERECHA=4, IZQUIERDA=5, COLOR=6, PROGRAM=7, MAS=8, 
		MENOS=9, MULTI=10, DIV=11, AND=12, OR=13, NOT=14, MAYOR=15, MENOR=16, 
		IGUAL=17, MAY_I=18, MEN_I=19, ASIGNAR=20, BRACKETS_OPEN=21, BRACKETS_CLOSE=22, 
		PAR_OPEN=23, PAR_CLOSE=24, PUNTOCOMA=25, ID=26, NUMBER=27, WS=28;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'", "'\b'", "'\t'", "'\n'", "'\\u000B'", "'\f'", 
		"'\r'", "'\\u000E'", "'\\u000F'", "'\\u0010'", "'\\u0011'", "'\\u0012'", 
		"'\\u0013'", "'\\u0014'", "'\\u0015'", "'\\u0016'", "'\\u0017'", "'\\u0018'", 
		"'\\u0019'", "'\\u001A'", "'\\u001B'", "'\\u001C'"
	};
	public static final String[] ruleNames = {
		"COMA", "GOTO", "BACK", "DERECHA", "IZQUIERDA", "COLOR", "PROGRAM", "MAS", 
		"MENOS", "MULTI", "DIV", "AND", "OR", "NOT", "MAYOR", "MENOR", "IGUAL", 
		"MAY_I", "MEN_I", "ASIGNAR", "BRACKETS_OPEN", "BRACKETS_CLOSE", "PAR_OPEN", 
		"PAR_CLOSE", "PUNTOCOMA", "ID", "NUMBER", "WS"
	};


	public CarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Car.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\36\u00aa\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\3\33\3\33\7\33\u009a\n\33\f\33\16\33\u009d\13"+
		"\33\3\34\6\34\u00a0\n\34\r\34\16\34\u00a1\3\35\6\35\u00a5\n\35\r\35\16"+
		"\35\u00a6\3\35\3\35\2\2\36\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25"+
		"\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32"+
		"\63\33\65\34\67\359\36\3\2\6\5\2C\\aac|\6\2\62;C\\aac|\3\2\62;\5\2\13"+
		"\f\17\17\"\"\u00ac\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\29\3\2\2\2\3;\3\2\2\2\5=\3\2\2\2\7E\3\2\2\2\tM\3\2\2\2\13U\3\2\2\2\r"+
		"]\3\2\2\2\17f\3\2\2\2\21n\3\2\2\2\23p\3\2\2\2\25r\3\2\2\2\27t\3\2\2\2"+
		"\31v\3\2\2\2\33y\3\2\2\2\35|\3\2\2\2\37~\3\2\2\2!\u0080\3\2\2\2#\u0082"+
		"\3\2\2\2%\u0085\3\2\2\2\'\u0088\3\2\2\2)\u008b\3\2\2\2+\u008d\3\2\2\2"+
		"-\u008f\3\2\2\2/\u0091\3\2\2\2\61\u0093\3\2\2\2\63\u0095\3\2\2\2\65\u0097"+
		"\3\2\2\2\67\u009f\3\2\2\29\u00a4\3\2\2\2;<\7.\2\2<\4\3\2\2\2=>\7o\2\2"+
		">?\7q\2\2?@\7x\2\2@A\7g\2\2AB\7a\2\2BC\7h\2\2CD\7y\2\2D\6\3\2\2\2EF\7"+
		"o\2\2FG\7q\2\2GH\7x\2\2HI\7g\2\2IJ\7a\2\2JK\7d\2\2KL\7m\2\2L\b\3\2\2\2"+
		"MN\7v\2\2NO\7w\2\2OP\7t\2\2PQ\7p\2\2QR\7a\2\2RS\7t\2\2ST\7v\2\2T\n\3\2"+
		"\2\2UV\7v\2\2VW\7w\2\2WX\7t\2\2XY\7p\2\2YZ\7a\2\2Z[\7n\2\2[\\\7v\2\2\\"+
		"\f\3\2\2\2]^\7u\2\2^_\7g\2\2_`\7v\2\2`a\7a\2\2ab\7t\2\2bc\7i\2\2cd\7d"+
		"\2\2de\7c\2\2e\16\3\2\2\2fg\7r\2\2gh\7t\2\2hi\7q\2\2ij\7i\2\2jk\7t\2\2"+
		"kl\7c\2\2lm\7o\2\2m\20\3\2\2\2no\7-\2\2o\22\3\2\2\2pq\7/\2\2q\24\3\2\2"+
		"\2rs\7,\2\2s\26\3\2\2\2tu\7\61\2\2u\30\3\2\2\2vw\7(\2\2wx\7(\2\2x\32\3"+
		"\2\2\2yz\7~\2\2z{\7~\2\2{\34\3\2\2\2|}\7#\2\2}\36\3\2\2\2~\177\7@\2\2"+
		"\177 \3\2\2\2\u0080\u0081\7>\2\2\u0081\"\3\2\2\2\u0082\u0083\7?\2\2\u0083"+
		"\u0084\7?\2\2\u0084$\3\2\2\2\u0085\u0086\7@\2\2\u0086\u0087\7?\2\2\u0087"+
		"&\3\2\2\2\u0088\u0089\7>\2\2\u0089\u008a\7?\2\2\u008a(\3\2\2\2\u008b\u008c"+
		"\7?\2\2\u008c*\3\2\2\2\u008d\u008e\7}\2\2\u008e,\3\2\2\2\u008f\u0090\7"+
		"\177\2\2\u0090.\3\2\2\2\u0091\u0092\7*\2\2\u0092\60\3\2\2\2\u0093\u0094"+
		"\7+\2\2\u0094\62\3\2\2\2\u0095\u0096\7=\2\2\u0096\64\3\2\2\2\u0097\u009b"+
		"\t\2\2\2\u0098\u009a\t\3\2\2\u0099\u0098\3\2\2\2\u009a\u009d\3\2\2\2\u009b"+
		"\u0099\3\2\2\2\u009b\u009c\3\2\2\2\u009c\66\3\2\2\2\u009d\u009b\3\2\2"+
		"\2\u009e\u00a0\t\4\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a28\3\2\2\2\u00a3\u00a5\t\5\2\2\u00a4"+
		"\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a6\u00a7\3\2"+
		"\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a9\b\35\2\2\u00a9:\3\2\2\2\6\2\u009b"+
		"\u00a1\u00a6\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}