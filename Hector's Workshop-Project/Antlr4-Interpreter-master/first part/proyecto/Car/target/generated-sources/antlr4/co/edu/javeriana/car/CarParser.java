// Generated from Car.g4 by ANTLR 4.4
package co.edu.javeriana.car;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		COMA=1, GOTO=2, BACK=3, DERECHA=4, IZQUIERDA=5, COLOR=6, PROGRAM=7, MAS=8, 
		MENOS=9, MULTI=10, DIV=11, AND=12, OR=13, NOT=14, MAYOR=15, MENOR=16, 
		IGUAL=17, MAY_I=18, MEN_I=19, ASIGNAR=20, BRACKETS_OPEN=21, BRACKETS_CLOSE=22, 
		PAR_OPEN=23, PAR_CLOSE=24, PUNTOCOMA=25, ID=26, NUMBER=27, WS=28;
	public static final String[] tokenNames = {
		"<INVALID>", "','", "'move_fw'", "'move_bk'", "'turn_rt'", "'turn_lt'", 
		"'set_rgba'", "'program'", "'+'", "'-'", "'*'", "'/'", "'&&'", "'||'", 
		"'!'", "'>'", "'<'", "'=='", "'>='", "'<='", "'='", "'{'", "'}'", "'('", 
		"')'", "';'", "ID", "NUMBER", "WS"
	};
	public static final int
		RULE_program = 0, RULE_instrucciones = 1, RULE_go = 2, RULE_back = 3, 
		RULE_der = 4, RULE_izq = 5, RULE_color = 6, RULE_numero = 7;
	public static final String[] ruleNames = {
		"program", "instrucciones", "go", "back", "der", "izq", "color", "numero"
	};

	@Override
	public String getGrammarFileName() { return "Car.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	private Car car;

	public CarParser(TokenStream input, Car car) {
	    this(input);
	    this.car = car;
	}

	public CarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public InstruccionesContext instrucciones(int i) {
			return getRuleContext(InstruccionesContext.class,i);
		}
		public TerminalNode BRACKETS_OPEN() { return getToken(CarParser.BRACKETS_OPEN, 0); }
		public TerminalNode PROGRAM() { return getToken(CarParser.PROGRAM, 0); }
		public TerminalNode BRACKETS_CLOSE() { return getToken(CarParser.BRACKETS_CLOSE, 0); }
		public List<InstruccionesContext> instrucciones() {
			return getRuleContexts(InstruccionesContext.class);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16); match(PROGRAM);
			setState(17); match(BRACKETS_OPEN);
			setState(21);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GOTO) | (1L << BACK) | (1L << DERECHA) | (1L << IZQUIERDA) | (1L << COLOR))) != 0)) {
				{
				{
				setState(18); instrucciones();
				}
				}
				setState(23);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(24); match(BRACKETS_CLOSE);
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

	public static class InstruccionesContext extends ParserRuleContext {
		public TerminalNode PUNTOCOMA() { return getToken(CarParser.PUNTOCOMA, 0); }
		public GoContext go() {
			return getRuleContext(GoContext.class,0);
		}
		public ColorContext color() {
			return getRuleContext(ColorContext.class,0);
		}
		public BackContext back() {
			return getRuleContext(BackContext.class,0);
		}
		public IzqContext izq() {
			return getRuleContext(IzqContext.class,0);
		}
		public DerContext der() {
			return getRuleContext(DerContext.class,0);
		}
		public InstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterInstrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitInstrucciones(this);
		}
	}

	public final InstruccionesContext instrucciones() throws RecognitionException {
		InstruccionesContext _localctx = new InstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instrucciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			switch (_input.LA(1)) {
			case GOTO:
				{
				setState(26); go();
				}
				break;
			case BACK:
				{
				setState(27); back();
				}
				break;
			case DERECHA:
				{
				setState(28); der();
				}
				break;
			case IZQUIERDA:
				{
				setState(29); izq();
				}
				break;
			case COLOR:
				{
				setState(30); color();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(33); match(PUNTOCOMA);
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

	public static class GoContext extends ParserRuleContext {
		public NumeroContext numero;
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode GOTO() { return getToken(CarParser.GOTO, 0); }
		public GoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_go; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterGo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitGo(this);
		}
	}

	public final GoContext go() throws RecognitionException {
		GoContext _localctx = new GoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_go);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); match(GOTO);
			setState(36); ((GoContext)_localctx).numero = numero();
			car.forward((Float) ((GoContext)_localctx).numero.value);
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

	public static class BackContext extends ParserRuleContext {
		public NumeroContext numero;
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode BACK() { return getToken(CarParser.BACK, 0); }
		public BackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_back; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterBack(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitBack(this);
		}
	}

	public final BackContext back() throws RecognitionException {
		BackContext _localctx = new BackContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_back);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); match(BACK);
			setState(40); ((BackContext)_localctx).numero = numero();
			car.backwards((Float) ((BackContext)_localctx).numero.value);
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

	public static class DerContext extends ParserRuleContext {
		public NumeroContext numero;
		public TerminalNode DERECHA() { return getToken(CarParser.DERECHA, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public DerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_der; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterDer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitDer(this);
		}
	}

	public final DerContext der() throws RecognitionException {
		DerContext _localctx = new DerContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_der);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43); match(DERECHA);
			setState(44); ((DerContext)_localctx).numero = numero();
			car.right((Float) ((DerContext)_localctx).numero.value);
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

	public static class IzqContext extends ParserRuleContext {
		public NumeroContext numero;
		public TerminalNode IZQUIERDA() { return getToken(CarParser.IZQUIERDA, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public IzqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_izq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterIzq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitIzq(this);
		}
	}

	public final IzqContext izq() throws RecognitionException {
		IzqContext _localctx = new IzqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_izq);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(IZQUIERDA);
			setState(48); ((IzqContext)_localctx).numero = numero();
			car.left((Float) ((IzqContext)_localctx).numero.value);
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

	public static class ColorContext extends ParserRuleContext {
		public NumeroContext red;
		public NumeroContext green;
		public NumeroContext blue;
		public NumeroContext alpha;
		public TerminalNode COLOR() { return getToken(CarParser.COLOR, 0); }
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public TerminalNode COMA(int i) {
			return getToken(CarParser.COMA, i);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(CarParser.COMA); }
		public ColorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_color; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterColor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitColor(this);
		}
	}

	public final ColorContext color() throws RecognitionException {
		ColorContext _localctx = new ColorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_color);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51); match(COLOR);
			setState(52); ((ColorContext)_localctx).red = numero();
			setState(53); match(COMA);
			setState(54); ((ColorContext)_localctx).green = numero();
			setState(55); match(COMA);
			setState(56); ((ColorContext)_localctx).blue = numero();
			setState(57); match(COMA);
			setState(58); ((ColorContext)_localctx).alpha = numero();
			car.color((Float) ((ColorContext)_localctx).red.value,(Float) ((ColorContext)_localctx).green.value,(Float) ((ColorContext)_localctx).blue.value,(Float) ((ColorContext)_localctx).alpha.value);
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

	public static class NumeroContext extends ParserRuleContext {
		public Object value;
		public Token NUMBER;
		public TerminalNode NUMBER() { return getToken(CarParser.NUMBER, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CarListener ) ((CarListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_numero);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61); ((NumeroContext)_localctx).NUMBER = match(NUMBER);
			((NumeroContext)_localctx).value =  Float.parseFloat((((NumeroContext)_localctx).NUMBER!=null?((NumeroContext)_localctx).NUMBER.getText():null));
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\36C\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\7\2\26"+
		"\n\2\f\2\16\2\31\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\5\3\"\n\3\3\3\3\3\3"+
		"\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\2\2\n\2\4\6\b\n\f\16"+
		"\20\2\2?\2\22\3\2\2\2\4!\3\2\2\2\6%\3\2\2\2\b)\3\2\2\2\n-\3\2\2\2\f\61"+
		"\3\2\2\2\16\65\3\2\2\2\20?\3\2\2\2\22\23\7\t\2\2\23\27\7\27\2\2\24\26"+
		"\5\4\3\2\25\24\3\2\2\2\26\31\3\2\2\2\27\25\3\2\2\2\27\30\3\2\2\2\30\32"+
		"\3\2\2\2\31\27\3\2\2\2\32\33\7\30\2\2\33\3\3\2\2\2\34\"\5\6\4\2\35\"\5"+
		"\b\5\2\36\"\5\n\6\2\37\"\5\f\7\2 \"\5\16\b\2!\34\3\2\2\2!\35\3\2\2\2!"+
		"\36\3\2\2\2!\37\3\2\2\2! \3\2\2\2\"#\3\2\2\2#$\7\33\2\2$\5\3\2\2\2%&\7"+
		"\4\2\2&\'\5\20\t\2\'(\b\4\1\2(\7\3\2\2\2)*\7\5\2\2*+\5\20\t\2+,\b\5\1"+
		"\2,\t\3\2\2\2-.\7\6\2\2./\5\20\t\2/\60\b\6\1\2\60\13\3\2\2\2\61\62\7\7"+
		"\2\2\62\63\5\20\t\2\63\64\b\7\1\2\64\r\3\2\2\2\65\66\7\b\2\2\66\67\5\20"+
		"\t\2\678\7\3\2\289\5\20\t\29:\7\3\2\2:;\5\20\t\2;<\7\3\2\2<=\5\20\t\2"+
		"=>\b\b\1\2>\17\3\2\2\2?@\7\35\2\2@A\b\t\1\2A\21\3\2\2\2\4\27!";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}