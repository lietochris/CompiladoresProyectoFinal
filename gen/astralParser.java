// Generated from D:/CHRIS/Escuela/Semestre6/Compiladores/compiladores_proyectofinal/src\astral.g4 by ANTLR 4.7.2


import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.astral.interprete.ast.*;


import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class astralParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PRINT=1, VAR=2, IF=3, ELSE=4, ENDIF=5, WHILE=6, ENDWHILE=7, FOR=8, ENDFOR=9, 
		SUMA=10, RESTA=11, MULTI=12, DIVI=13, PARA=14, PARB=15, IGUAL=16, BOOLEANO=17, 
		MAYOR=18, MENOR=19, MAYORIGUAL=20, MENORIGUAL=21, TOTALIGUAL=22, PYQ=23, 
		DP=24, COMILLAS=25, NUMERO=26, STRING=27, ID=28, COMENTARIO=29, WS=30;
	public static final int
		RULE_inicio = 0, RULE_sentencias = 1, RULE_expresion = 2, RULE_variable_declaracion = 3, 
		RULE_variable_asignacion = 4, RULE_comparacion = 5, RULE_ciclos = 6, RULE_impresion = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "sentencias", "expresion", "variable_declaracion", "variable_asignacion", 
			"comparacion", "ciclos", "impresion"
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

	@Override
	public String getGrammarFileName() { return "astral.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public astralParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class InicioContext extends ParserRuleContext {
		public SentenciasContext sentencias;
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof astralVisitor ) return ((astralVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			        List<NodoAST> cuerpo = new ArrayList<NodoAST>();
			        Map<String, Object> tablaSimbolos = new HashMap<String, Object>();

			    
			setState(22);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PARA) | (1L << BOOLEANO) | (1L << NUMERO) | (1L << STRING) | (1L << ID))) != 0)) {
				{
				{
				setState(17);
				((InicioContext)_localctx).sentencias = sentencias();
				cuerpo.add(((InicioContext)_localctx).sentencias.nodo);
				}
				}
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}

			        for(NodoAST lineas : cuerpo)
			        {
			            lineas.ejecutar(tablaSimbolos);
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

	public static class SentenciasContext extends ParserRuleContext {
		public NodoAST nodo;
		public ExpresionContext expresion;
		public ImpresionContext impresion;
		public ComparacionContext comparacion;
		public CiclosContext ciclos;
		public Variable_asignacionContext variable_asignacion;
		public Variable_declaracionContext variable_declaracion;
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public ImpresionContext impresion() {
			return getRuleContext(ImpresionContext.class,0);
		}
		public ComparacionContext comparacion() {
			return getRuleContext(ComparacionContext.class,0);
		}
		public CiclosContext ciclos() {
			return getRuleContext(CiclosContext.class,0);
		}
		public Variable_asignacionContext variable_asignacion() {
			return getRuleContext(Variable_asignacionContext.class,0);
		}
		public Variable_declaracionContext variable_declaracion() {
			return getRuleContext(Variable_declaracionContext.class,0);
		}
		public SentenciasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).enterSentencias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).exitSentencias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof astralVisitor ) return ((astralVisitor<? extends T>)visitor).visitSentencias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciasContext sentencias() throws RecognitionException {
		SentenciasContext _localctx = new SentenciasContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sentencias);
		try {
			setState(45);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(27);
				((SentenciasContext)_localctx).expresion = expresion(0);
				((SentenciasContext)_localctx).nodo =  ((SentenciasContext)_localctx).expresion.nodo;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(30);
				((SentenciasContext)_localctx).impresion = impresion();
				((SentenciasContext)_localctx).nodo =  ((SentenciasContext)_localctx).impresion.nodo;
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(33);
				((SentenciasContext)_localctx).comparacion = comparacion();
				((SentenciasContext)_localctx).nodo =  ((SentenciasContext)_localctx).comparacion.nodo;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(36);
				((SentenciasContext)_localctx).ciclos = ciclos();
				((SentenciasContext)_localctx).nodo =  ((SentenciasContext)_localctx).ciclos.nodo;
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(39);
				((SentenciasContext)_localctx).variable_asignacion = variable_asignacion();
				((SentenciasContext)_localctx).nodo =  ((SentenciasContext)_localctx).variable_asignacion.nodo;
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(42);
				((SentenciasContext)_localctx).variable_declaracion = variable_declaracion();
				((SentenciasContext)_localctx).nodo =  ((SentenciasContext)_localctx).variable_declaracion.nodo;
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

	public static class ExpresionContext extends ParserRuleContext {
		public NodoAST nodo;
		public ExpresionContext a;
		public Token NUMERO;
		public Token BOOLEANO;
		public Token STRING;
		public Token ID;
		public ExpresionContext expresion;
		public ExpresionContext b;
		public TerminalNode NUMERO() { return getToken(astralParser.NUMERO, 0); }
		public TerminalNode BOOLEANO() { return getToken(astralParser.BOOLEANO, 0); }
		public TerminalNode STRING() { return getToken(astralParser.STRING, 0); }
		public TerminalNode ID() { return getToken(astralParser.ID, 0); }
		public TerminalNode PARA() { return getToken(astralParser.PARA, 0); }
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PARB() { return getToken(astralParser.PARB, 0); }
		public TerminalNode SUMA() { return getToken(astralParser.SUMA, 0); }
		public TerminalNode RESTA() { return getToken(astralParser.RESTA, 0); }
		public TerminalNode MULTI() { return getToken(astralParser.MULTI, 0); }
		public TerminalNode DIVI() { return getToken(astralParser.DIVI, 0); }
		public TerminalNode MAYOR() { return getToken(astralParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(astralParser.MENOR, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(astralParser.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(astralParser.MENORIGUAL, 0); }
		public TerminalNode TOTALIGUAL() { return getToken(astralParser.TOTALIGUAL, 0); }
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).exitExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof astralVisitor ) return ((astralVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
				{
				setState(48);
				((ExpresionContext)_localctx).NUMERO = match(NUMERO);
				((ExpresionContext)_localctx).nodo =  new Constante( Float.parseFloat((((ExpresionContext)_localctx).NUMERO!=null?((ExpresionContext)_localctx).NUMERO.getText():null)) );
				}
				break;
			case BOOLEANO:
				{
				setState(50);
				((ExpresionContext)_localctx).BOOLEANO = match(BOOLEANO);
				((ExpresionContext)_localctx).nodo =  new Constante(Boolean.parseBoolean((((ExpresionContext)_localctx).BOOLEANO!=null?((ExpresionContext)_localctx).BOOLEANO.getText():null)));
				}
				break;
			case STRING:
				{
				setState(52);
				((ExpresionContext)_localctx).STRING = match(STRING);
				((ExpresionContext)_localctx).nodo =  new Constante((((ExpresionContext)_localctx).STRING!=null?((ExpresionContext)_localctx).STRING.getText():null));
				}
				break;
			case ID:
				{
				setState(54);
				((ExpresionContext)_localctx).ID = match(ID);
				((ExpresionContext)_localctx).nodo =  new VariableReferencia((((ExpresionContext)_localctx).ID!=null?((ExpresionContext)_localctx).ID.getText():null));
				}
				break;
			case PARA:
				{
				setState(56);
				match(PARA);
				setState(57);
				((ExpresionContext)_localctx).expresion = expresion(0);
				setState(58);
				match(PARB);
				((ExpresionContext)_localctx).nodo =  ((ExpresionContext)_localctx).expresion.nodo;
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(117);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(115);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(63);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(64);
						match(SUMA);
						setState(65);
						((ExpresionContext)_localctx).b = ((ExpresionContext)_localctx).expresion = expresion(10);
						((ExpresionContext)_localctx).nodo =  new Suma(((ExpresionContext)_localctx).a.nodo, ((ExpresionContext)_localctx).b.nodo);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(68);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(69);
						match(RESTA);
						setState(70);
						((ExpresionContext)_localctx).b = ((ExpresionContext)_localctx).expresion = expresion(9);
						((ExpresionContext)_localctx).nodo =  new Resta(((ExpresionContext)_localctx).a.nodo, ((ExpresionContext)_localctx).b.nodo);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(73);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						{
						setState(74);
						match(MULTI);
						setState(75);
						((ExpresionContext)_localctx).b = ((ExpresionContext)_localctx).expresion = expresion(0);
						}
						((ExpresionContext)_localctx).nodo =  new Multiplicacion(((ExpresionContext)_localctx).a.nodo, ((ExpresionContext)_localctx).b.nodo);
						}
						break;
					case 4:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(79);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						{
						setState(80);
						match(DIVI);
						setState(81);
						((ExpresionContext)_localctx).b = ((ExpresionContext)_localctx).expresion = expresion(0);
						}
						((ExpresionContext)_localctx).nodo =  new Division(((ExpresionContext)_localctx).a.nodo, ((ExpresionContext)_localctx).b.nodo);
						}
						break;
					case 5:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(85);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						{
						setState(86);
						match(MAYOR);
						setState(87);
						((ExpresionContext)_localctx).b = ((ExpresionContext)_localctx).expresion = expresion(0);
						}
						((ExpresionContext)_localctx).nodo =  new Mayor(((ExpresionContext)_localctx).a.nodo, ((ExpresionContext)_localctx).b.nodo);
						}
						break;
					case 6:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(91);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						{
						setState(92);
						match(MENOR);
						setState(93);
						((ExpresionContext)_localctx).b = ((ExpresionContext)_localctx).expresion = expresion(0);
						}
						((ExpresionContext)_localctx).nodo =  new Menor(((ExpresionContext)_localctx).a.nodo, ((ExpresionContext)_localctx).b.nodo);
						}
						break;
					case 7:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(97);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						{
						setState(98);
						match(MAYORIGUAL);
						setState(99);
						((ExpresionContext)_localctx).b = ((ExpresionContext)_localctx).expresion = expresion(0);
						}
						((ExpresionContext)_localctx).nodo =  new MayorIgual(((ExpresionContext)_localctx).a.nodo, ((ExpresionContext)_localctx).b.nodo);
						}
						break;
					case 8:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(103);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						{
						setState(104);
						match(MENORIGUAL);
						setState(105);
						((ExpresionContext)_localctx).b = ((ExpresionContext)_localctx).expresion = expresion(0);
						}
						((ExpresionContext)_localctx).nodo =  new MenorIgual(((ExpresionContext)_localctx).a.nodo, ((ExpresionContext)_localctx).b.nodo);
						}
						break;
					case 9:
						{
						_localctx = new ExpresionContext(_parentctx, _parentState);
						_localctx.a = _prevctx;
						_localctx.a = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(109);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						{
						setState(110);
						match(TOTALIGUAL);
						setState(111);
						((ExpresionContext)_localctx).b = ((ExpresionContext)_localctx).expresion = expresion(0);
						}
						((ExpresionContext)_localctx).nodo =  new TotalIgual(((ExpresionContext)_localctx).a.nodo, ((ExpresionContext)_localctx).b.nodo);
						}
						break;
					}
					} 
				}
				setState(119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Variable_declaracionContext extends ParserRuleContext {
		public NodoAST nodo;
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode VAR() { return getToken(astralParser.VAR, 0); }
		public TerminalNode ID() { return getToken(astralParser.ID, 0); }
		public TerminalNode PYQ() { return getToken(astralParser.PYQ, 0); }
		public TerminalNode IGUAL() { return getToken(astralParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Variable_declaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).enterVariable_declaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).exitVariable_declaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof astralVisitor ) return ((astralVisitor<? extends T>)visitor).visitVariable_declaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_declaracionContext variable_declaracion() throws RecognitionException {
		Variable_declaracionContext _localctx = new Variable_declaracionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_variable_declaracion);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(VAR);
				setState(121);
				((Variable_declaracionContext)_localctx).ID = match(ID);
				setState(122);
				match(PYQ);
				((Variable_declaracionContext)_localctx).nodo =  new VariableDeclaracion((((Variable_declaracionContext)_localctx).ID!=null?((Variable_declaracionContext)_localctx).ID.getText():null));
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				match(VAR);
				setState(125);
				((Variable_declaracionContext)_localctx).ID = match(ID);
				setState(126);
				match(IGUAL);
				setState(127);
				((Variable_declaracionContext)_localctx).expresion = expresion(0);
				setState(128);
				match(PYQ);
				((Variable_declaracionContext)_localctx).nodo =  new VariableAsignacion((((Variable_declaracionContext)_localctx).ID!=null?((Variable_declaracionContext)_localctx).ID.getText():null), ((Variable_declaracionContext)_localctx).expresion.nodo);
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

	public static class Variable_asignacionContext extends ParserRuleContext {
		public NodoAST nodo;
		public Token ID;
		public ExpresionContext expresion;
		public TerminalNode ID() { return getToken(astralParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(astralParser.IGUAL, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PYQ() { return getToken(astralParser.PYQ, 0); }
		public Variable_asignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable_asignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).enterVariable_asignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).exitVariable_asignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof astralVisitor ) return ((astralVisitor<? extends T>)visitor).visitVariable_asignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Variable_asignacionContext variable_asignacion() throws RecognitionException {
		Variable_asignacionContext _localctx = new Variable_asignacionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variable_asignacion);
		try {
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((Variable_asignacionContext)_localctx).ID = match(ID);
				setState(134);
				match(IGUAL);
				setState(135);
				((Variable_asignacionContext)_localctx).expresion = expresion(0);
				setState(136);
				match(PYQ);
				((Variable_asignacionContext)_localctx).nodo =  new VariableAsignacion((((Variable_asignacionContext)_localctx).ID!=null?((Variable_asignacionContext)_localctx).ID.getText():null), ((Variable_asignacionContext)_localctx).expresion.nodo);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				((Variable_asignacionContext)_localctx).ID = match(ID);
				setState(140);
				match(IGUAL);
				setState(141);
				((Variable_asignacionContext)_localctx).expresion = expresion(0);
				((Variable_asignacionContext)_localctx).nodo =  new VariableAsignacion((((Variable_asignacionContext)_localctx).ID!=null?((Variable_asignacionContext)_localctx).ID.getText():null), ((Variable_asignacionContext)_localctx).expresion.nodo);
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

	public static class ComparacionContext extends ParserRuleContext {
		public NodoAST nodo;
		public ExpresionContext expresion;
		public SentenciasContext sentencias;
		public SentenciasContext v;
		public SentenciasContext f;
		public TerminalNode IF() { return getToken(astralParser.IF, 0); }
		public TerminalNode PARA() { return getToken(astralParser.PARA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARB() { return getToken(astralParser.PARB, 0); }
		public List<TerminalNode> DP() { return getTokens(astralParser.DP); }
		public TerminalNode DP(int i) {
			return getToken(astralParser.DP, i);
		}
		public TerminalNode ENDIF() { return getToken(astralParser.ENDIF, 0); }
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(astralParser.ELSE, 0); }
		public ComparacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).enterComparacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).exitComparacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof astralVisitor ) return ((astralVisitor<? extends T>)visitor).visitComparacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparacionContext comparacion() throws RecognitionException {
		ComparacionContext _localctx = new ComparacionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_comparacion);
		int _la;
		try {
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(IF);
				setState(147);
				match(PARA);
				setState(148);
				((ComparacionContext)_localctx).expresion = expresion(0);
				setState(149);
				match(PARB);
				setState(150);
				match(DP);
				List<NodoAST> verdadero = new ArrayList<NodoAST>();
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PARA) | (1L << BOOLEANO) | (1L << NUMERO) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					{
					setState(152);
					((ComparacionContext)_localctx).sentencias = sentencias();
					verdadero.add(((ComparacionContext)_localctx).sentencias.nodo);
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
				match(ENDIF);
				((ComparacionContext)_localctx).nodo =  new If(((ComparacionContext)_localctx).expresion.nodo, verdadero);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(IF);
				setState(164);
				match(PARA);
				setState(165);
				((ComparacionContext)_localctx).expresion = expresion(0);
				setState(166);
				match(PARB);
				setState(167);
				match(DP);
				List<NodoAST> verdadero = new ArrayList<NodoAST>(); List<NodoAST> falso = new ArrayList<NodoAST>();
				setState(174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PARA) | (1L << BOOLEANO) | (1L << NUMERO) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					{
					setState(169);
					((ComparacionContext)_localctx).v = sentencias();
					verdadero.add(((ComparacionContext)_localctx).v.nodo);
					}
					}
					setState(176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(177);
				match(ELSE);
				setState(178);
				match(DP);
				setState(184);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PARA) | (1L << BOOLEANO) | (1L << NUMERO) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					{
					setState(179);
					((ComparacionContext)_localctx).f = sentencias();
					falso.add(((ComparacionContext)_localctx).f.nodo);
					}
					}
					setState(186);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(187);
				match(ENDIF);
				((ComparacionContext)_localctx).nodo =  new IfElse(((ComparacionContext)_localctx).expresion.nodo, verdadero, falso);
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

	public static class CiclosContext extends ParserRuleContext {
		public NodoAST nodo;
		public ExpresionContext expresion;
		public SentenciasContext sentencias;
		public Variable_asignacionContext a;
		public Variable_asignacionContext b;
		public TerminalNode WHILE() { return getToken(astralParser.WHILE, 0); }
		public TerminalNode PARA() { return getToken(astralParser.PARA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARB() { return getToken(astralParser.PARB, 0); }
		public TerminalNode DP() { return getToken(astralParser.DP, 0); }
		public TerminalNode ENDWHILE() { return getToken(astralParser.ENDWHILE, 0); }
		public List<SentenciasContext> sentencias() {
			return getRuleContexts(SentenciasContext.class);
		}
		public SentenciasContext sentencias(int i) {
			return getRuleContext(SentenciasContext.class,i);
		}
		public TerminalNode FOR() { return getToken(astralParser.FOR, 0); }
		public TerminalNode PYQ() { return getToken(astralParser.PYQ, 0); }
		public TerminalNode ENDFOR() { return getToken(astralParser.ENDFOR, 0); }
		public List<Variable_asignacionContext> variable_asignacion() {
			return getRuleContexts(Variable_asignacionContext.class);
		}
		public Variable_asignacionContext variable_asignacion(int i) {
			return getRuleContext(Variable_asignacionContext.class,i);
		}
		public CiclosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).enterCiclos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).exitCiclos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof astralVisitor ) return ((astralVisitor<? extends T>)visitor).visitCiclos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CiclosContext ciclos() throws RecognitionException {
		CiclosContext _localctx = new CiclosContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ciclos);
		int _la;
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(WHILE);
				setState(193);
				match(PARA);
				setState(194);
				((CiclosContext)_localctx).expresion = expresion(0);
				setState(195);
				match(PARB);
				setState(196);
				match(DP);
				List<NodoAST> sublineas = new ArrayList<NodoAST>();
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PARA) | (1L << BOOLEANO) | (1L << NUMERO) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					{
					setState(198);
					((CiclosContext)_localctx).sentencias = sentencias();
					sublineas.add(((CiclosContext)_localctx).sentencias.nodo);
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				match(ENDWHILE);
				((CiclosContext)_localctx).nodo =  new While(((CiclosContext)_localctx).expresion.nodo, sublineas);
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(209);
				match(FOR);
				setState(210);
				match(PARA);
				{
				setState(211);
				((CiclosContext)_localctx).a = variable_asignacion();
				}
				setState(212);
				((CiclosContext)_localctx).expresion = expresion(0);
				setState(213);
				match(PYQ);
				{
				setState(214);
				((CiclosContext)_localctx).b = variable_asignacion();
				}
				setState(215);
				match(PARB);
				setState(216);
				match(DP);
				List<NodoAST> sublineasFor = new ArrayList<NodoAST>();
				setState(223);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << VAR) | (1L << IF) | (1L << WHILE) | (1L << FOR) | (1L << PARA) | (1L << BOOLEANO) | (1L << NUMERO) | (1L << STRING) | (1L << ID))) != 0)) {
					{
					{
					setState(218);
					((CiclosContext)_localctx).sentencias = sentencias();
					sublineasFor.add(((CiclosContext)_localctx).sentencias.nodo);
					}
					}
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(226);
				match(ENDFOR);
				((CiclosContext)_localctx).nodo =  new For(((CiclosContext)_localctx).a.nodo, ((CiclosContext)_localctx).expresion.nodo, ((CiclosContext)_localctx).b.nodo, sublineasFor);
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

	public static class ImpresionContext extends ParserRuleContext {
		public NodoAST nodo;
		public ExpresionContext expresion;
		public TerminalNode PRINT() { return getToken(astralParser.PRINT, 0); }
		public TerminalNode PARA() { return getToken(astralParser.PARA, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PARB() { return getToken(astralParser.PARB, 0); }
		public TerminalNode PYQ() { return getToken(astralParser.PYQ, 0); }
		public ImpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).enterImpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof astralListener ) ((astralListener)listener).exitImpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof astralVisitor ) return ((astralVisitor<? extends T>)visitor).visitImpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImpresionContext impresion() throws RecognitionException {
		ImpresionContext _localctx = new ImpresionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			match(PRINT);
			setState(232);
			match(PARA);
			setState(233);
			((ImpresionContext)_localctx).expresion = expresion(0);
			setState(234);
			match(PARB);
			setState(235);
			match(PYQ);
			((ImpresionContext)_localctx).nodo =  new Print(((ImpresionContext)_localctx).expresion.nodo);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 9);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		case 8:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00f1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\7\2\27\n\2\f\2\16\2\32\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\60\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4@\n\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4v\n\4\f\4\16\4y\13\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\u0086\n\5\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u0093\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\7\7\u009e\n\7\f\7\16\7\u00a1\13\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\7\7\u00af\n\7\f\7\16\7\u00b2\13\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7\u00b9\n\7\f\7\16\7\u00bc\13\7\3\7\3\7\3\7\5\7\u00c1\n\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00cc\n\b\f\b\16\b\u00cf\13\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\7\b\u00e0\n\b"+
		"\f\b\16\b\u00e3\13\b\3\b\3\b\3\b\5\b\u00e8\n\b\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\2\3\6\n\2\4\6\b\n\f\16\20\2\2\2\u0104\2\22\3\2\2\2\4/\3\2\2\2"+
		"\6?\3\2\2\2\b\u0085\3\2\2\2\n\u0092\3\2\2\2\f\u00c0\3\2\2\2\16\u00e7\3"+
		"\2\2\2\20\u00e9\3\2\2\2\22\30\b\2\1\2\23\24\5\4\3\2\24\25\b\2\1\2\25\27"+
		"\3\2\2\2\26\23\3\2\2\2\27\32\3\2\2\2\30\26\3\2\2\2\30\31\3\2\2\2\31\33"+
		"\3\2\2\2\32\30\3\2\2\2\33\34\b\2\1\2\34\3\3\2\2\2\35\36\5\6\4\2\36\37"+
		"\b\3\1\2\37\60\3\2\2\2 !\5\20\t\2!\"\b\3\1\2\"\60\3\2\2\2#$\5\f\7\2$%"+
		"\b\3\1\2%\60\3\2\2\2&\'\5\16\b\2\'(\b\3\1\2(\60\3\2\2\2)*\5\n\6\2*+\b"+
		"\3\1\2+\60\3\2\2\2,-\5\b\5\2-.\b\3\1\2.\60\3\2\2\2/\35\3\2\2\2/ \3\2\2"+
		"\2/#\3\2\2\2/&\3\2\2\2/)\3\2\2\2/,\3\2\2\2\60\5\3\2\2\2\61\62\b\4\1\2"+
		"\62\63\7\34\2\2\63@\b\4\1\2\64\65\7\23\2\2\65@\b\4\1\2\66\67\7\35\2\2"+
		"\67@\b\4\1\289\7\36\2\29@\b\4\1\2:;\7\20\2\2;<\5\6\4\2<=\7\21\2\2=>\b"+
		"\4\1\2>@\3\2\2\2?\61\3\2\2\2?\64\3\2\2\2?\66\3\2\2\2?8\3\2\2\2?:\3\2\2"+
		"\2@w\3\2\2\2AB\f\13\2\2BC\7\f\2\2CD\5\6\4\fDE\b\4\1\2Ev\3\2\2\2FG\f\n"+
		"\2\2GH\7\r\2\2HI\5\6\4\13IJ\b\4\1\2Jv\3\2\2\2KL\f\t\2\2LM\7\16\2\2MN\5"+
		"\6\4\2NO\3\2\2\2OP\b\4\1\2Pv\3\2\2\2QR\f\b\2\2RS\7\17\2\2ST\5\6\4\2TU"+
		"\3\2\2\2UV\b\4\1\2Vv\3\2\2\2WX\f\7\2\2XY\7\24\2\2YZ\5\6\4\2Z[\3\2\2\2"+
		"[\\\b\4\1\2\\v\3\2\2\2]^\f\6\2\2^_\7\25\2\2_`\5\6\4\2`a\3\2\2\2ab\b\4"+
		"\1\2bv\3\2\2\2cd\f\5\2\2de\7\26\2\2ef\5\6\4\2fg\3\2\2\2gh\b\4\1\2hv\3"+
		"\2\2\2ij\f\4\2\2jk\7\27\2\2kl\5\6\4\2lm\3\2\2\2mn\b\4\1\2nv\3\2\2\2op"+
		"\f\3\2\2pq\7\30\2\2qr\5\6\4\2rs\3\2\2\2st\b\4\1\2tv\3\2\2\2uA\3\2\2\2"+
		"uF\3\2\2\2uK\3\2\2\2uQ\3\2\2\2uW\3\2\2\2u]\3\2\2\2uc\3\2\2\2ui\3\2\2\2"+
		"uo\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\7\3\2\2\2yw\3\2\2\2z{\7\4\2"+
		"\2{|\7\36\2\2|}\7\31\2\2}\u0086\b\5\1\2~\177\7\4\2\2\177\u0080\7\36\2"+
		"\2\u0080\u0081\7\22\2\2\u0081\u0082\5\6\4\2\u0082\u0083\7\31\2\2\u0083"+
		"\u0084\b\5\1\2\u0084\u0086\3\2\2\2\u0085z\3\2\2\2\u0085~\3\2\2\2\u0086"+
		"\t\3\2\2\2\u0087\u0088\7\36\2\2\u0088\u0089\7\22\2\2\u0089\u008a\5\6\4"+
		"\2\u008a\u008b\7\31\2\2\u008b\u008c\b\6\1\2\u008c\u0093\3\2\2\2\u008d"+
		"\u008e\7\36\2\2\u008e\u008f\7\22\2\2\u008f\u0090\5\6\4\2\u0090\u0091\b"+
		"\6\1\2\u0091\u0093\3\2\2\2\u0092\u0087\3\2\2\2\u0092\u008d\3\2\2\2\u0093"+
		"\13\3\2\2\2\u0094\u0095\7\5\2\2\u0095\u0096\7\20\2\2\u0096\u0097\5\6\4"+
		"\2\u0097\u0098\7\21\2\2\u0098\u0099\7\32\2\2\u0099\u009f\b\7\1\2\u009a"+
		"\u009b\5\4\3\2\u009b\u009c\b\7\1\2\u009c\u009e\3\2\2\2\u009d\u009a\3\2"+
		"\2\2\u009e\u00a1\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0"+
		"\u00a2\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\7\7\2\2\u00a3\u00a4\b\7"+
		"\1\2\u00a4\u00c1\3\2\2\2\u00a5\u00a6\7\5\2\2\u00a6\u00a7\7\20\2\2\u00a7"+
		"\u00a8\5\6\4\2\u00a8\u00a9\7\21\2\2\u00a9\u00aa\7\32\2\2\u00aa\u00b0\b"+
		"\7\1\2\u00ab\u00ac\5\4\3\2\u00ac\u00ad\b\7\1\2\u00ad\u00af\3\2\2\2\u00ae"+
		"\u00ab\3\2\2\2\u00af\u00b2\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0\u00b1\3\2"+
		"\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b3\u00b4\7\6\2\2\u00b4"+
		"\u00ba\7\32\2\2\u00b5\u00b6\5\4\3\2\u00b6\u00b7\b\7\1\2\u00b7\u00b9\3"+
		"\2\2\2\u00b8\u00b5\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba"+
		"\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\7\7"+
		"\2\2\u00be\u00bf\b\7\1\2\u00bf\u00c1\3\2\2\2\u00c0\u0094\3\2\2\2\u00c0"+
		"\u00a5\3\2\2\2\u00c1\r\3\2\2\2\u00c2\u00c3\7\b\2\2\u00c3\u00c4\7\20\2"+
		"\2\u00c4\u00c5\5\6\4\2\u00c5\u00c6\7\21\2\2\u00c6\u00c7\7\32\2\2\u00c7"+
		"\u00cd\b\b\1\2\u00c8\u00c9\5\4\3\2\u00c9\u00ca\b\b\1\2\u00ca\u00cc\3\2"+
		"\2\2\u00cb\u00c8\3\2\2\2\u00cc\u00cf\3\2\2\2\u00cd\u00cb\3\2\2\2\u00cd"+
		"\u00ce\3\2\2\2\u00ce\u00d0\3\2\2\2\u00cf\u00cd\3\2\2\2\u00d0\u00d1\7\t"+
		"\2\2\u00d1\u00d2\b\b\1\2\u00d2\u00e8\3\2\2\2\u00d3\u00d4\7\n\2\2\u00d4"+
		"\u00d5\7\20\2\2\u00d5\u00d6\5\n\6\2\u00d6\u00d7\5\6\4\2\u00d7\u00d8\7"+
		"\31\2\2\u00d8\u00d9\5\n\6\2\u00d9\u00da\7\21\2\2\u00da\u00db\7\32\2\2"+
		"\u00db\u00e1\b\b\1\2\u00dc\u00dd\5\4\3\2\u00dd\u00de\b\b\1\2\u00de\u00e0"+
		"\3\2\2\2\u00df\u00dc\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1"+
		"\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5\7\13"+
		"\2\2\u00e5\u00e6\b\b\1\2\u00e6\u00e8\3\2\2\2\u00e7\u00c2\3\2\2\2\u00e7"+
		"\u00d3\3\2\2\2\u00e8\17\3\2\2\2\u00e9\u00ea\7\3\2\2\u00ea\u00eb\7\20\2"+
		"\2\u00eb\u00ec\5\6\4\2\u00ec\u00ed\7\21\2\2\u00ed\u00ee\7\31\2\2\u00ee"+
		"\u00ef\b\t\1\2\u00ef\21\3\2\2\2\20\30/?uw\u0085\u0092\u009f\u00b0\u00ba"+
		"\u00c0\u00cd\u00e1\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}