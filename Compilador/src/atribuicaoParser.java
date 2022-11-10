// Generated from java-escape by ANTLR 4.11.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class atribuicaoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, NUMINT=27, NUMFLOAT=28, BOOLEANOtrue=29, BOOLEANOfalse=30, 
		ID=31, TEXTO=32, Ws=33;
	public static final int
		RULE_init = 0, RULE_cmd = 1, RULE_cmdAtribui = 2, RULE_cmdLeia = 3, RULE_complementoLeia = 4, 
		RULE_cmdImprime = 5, RULE_cmdExpressao = 6, RULE_cmdSe = 7, RULE_cmdSenao = 8, 
		RULE_cmdPara = 9, RULE_cmdEnquanto = 10, RULE_tipo = 11, RULE_operadorAtri = 12, 
		RULE_fim = 13, RULE_compIgual = 14, RULE_compMaior = 15, RULE_compMenor = 16, 
		RULE_compMeIgual = 17, RULE_compMaIgual = 18, RULE_compDifer = 19, RULE_numero = 20, 
		RULE_booleano = 21, RULE_id = 22, RULE_texto = 23, RULE_leftParen = 24, 
		RULE_rightParen = 25, RULE_leftChave = 26, RULE_rightChave = 27, RULE_plus = 28, 
		RULE_menus = 29, RULE_div = 30, RULE_mult = 31, RULE_expr = 32, RULE_expressao = 33, 
		RULE_termo = 34, RULE_expreLinha = 35, RULE_fator = 36, RULE_termoLinha = 37;
	private static String[] makeRuleNames() {
		return new String[] {
			"init", "cmd", "cmdAtribui", "cmdLeia", "complementoLeia", "cmdImprime", 
			"cmdExpressao", "cmdSe", "cmdSenao", "cmdPara", "cmdEnquanto", "tipo", 
			"operadorAtri", "fim", "compIgual", "compMaior", "compMenor", "compMeIgual", 
			"compMaIgual", "compDifer", "numero", "booleano", "id", "texto", "leftParen", 
			"rightParen", "leftChave", "rightChave", "plus", "menus", "div", "mult", 
			"expr", "expressao", "termo", "expreLinha", "fator", "termoLinha"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'leia('", "')'", "'imprime'", "'se'", "'senao'", "'para'", "'enquanto'", 
			"'booleano'", "'inteiro'", "'flutuante'", "'palavra'", "'='", "';'", 
			"'=='", "'>'", "'<'", "'<='", "'>='", "'!='", "'('", "'{'", "'}'", "'+'", 
			"'-'", "'/'", "'*'", null, null, "'True'", "'False'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "NUMINT", "NUMFLOAT", "BOOLEANOtrue", "BOOLEANOfalse", 
			"ID", "TEXTO", "Ws"
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
	public String getGrammarFileName() { return "java-escape"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public atribuicaoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InitContext extends ParserRuleContext {
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public InitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitInit(this);
		}
	}

	public final InitContext init() throws RecognitionException {
		InitContext _localctx = new InitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_init);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(76);
				cmd();
				}
				}
				setState(79); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2147487738L) != 0 );
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
	public static class CmdContext extends ParserRuleContext {
		public CmdAtribuiContext cmdAtribui() {
			return getRuleContext(CmdAtribuiContext.class,0);
		}
		public CmdLeiaContext cmdLeia() {
			return getRuleContext(CmdLeiaContext.class,0);
		}
		public CmdImprimeContext cmdImprime() {
			return getRuleContext(CmdImprimeContext.class,0);
		}
		public CmdExpressaoContext cmdExpressao() {
			return getRuleContext(CmdExpressaoContext.class,0);
		}
		public CmdSeContext cmdSe() {
			return getRuleContext(CmdSeContext.class,0);
		}
		public CmdParaContext cmdPara() {
			return getRuleContext(CmdParaContext.class,0);
		}
		public CmdEnquantoContext cmdEnquanto() {
			return getRuleContext(CmdEnquantoContext.class,0);
		}
		public CmdSenaoContext cmdSenao() {
			return getRuleContext(CmdSenaoContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmd(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_cmd);
		try {
			setState(89);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__7:
			case T__8:
			case T__9:
			case T__10:
				enterOuterAlt(_localctx, 1);
				{
				setState(81);
				cmdAtribui();
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(82);
				cmdLeia();
				}
				break;
			case T__2:
				enterOuterAlt(_localctx, 3);
				{
				setState(83);
				cmdImprime();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 4);
				{
				setState(84);
				cmdExpressao();
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				cmdSe();
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 6);
				{
				setState(86);
				cmdPara();
				}
				break;
			case T__6:
				enterOuterAlt(_localctx, 7);
				{
				setState(87);
				cmdEnquanto();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 8);
				{
				setState(88);
				cmdSenao();
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdAtribuiContext extends ParserRuleContext {
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public OperadorAtriContext operadorAtri() {
			return getRuleContext(OperadorAtriContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public CmdAtribuiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdAtribui; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdAtribui(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdAtribui(this);
		}
	}

	public final CmdAtribuiContext cmdAtribui() throws RecognitionException {
		CmdAtribuiContext _localctx = new CmdAtribuiContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_cmdAtribui);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			tipo();
			setState(92);
			id();
			setState(93);
			operadorAtri();
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				setState(94);
				id();
				}
				break;
			case NUMINT:
			case NUMFLOAT:
				{
				setState(95);
				numero();
				}
				break;
			case TEXTO:
				{
				setState(96);
				texto();
				}
				break;
			case BOOLEANOtrue:
			case BOOLEANOfalse:
				{
				setState(97);
				booleano();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(100);
			fim();
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
	public static class CmdLeiaContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public ComplementoLeiaContext complementoLeia() {
			return getRuleContext(ComplementoLeiaContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public CmdLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdLeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdLeia(this);
		}
	}

	public final CmdLeiaContext cmdLeia() throws RecognitionException {
		CmdLeiaContext _localctx = new CmdLeiaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_cmdLeia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__0);
			setState(103);
			id();
			setState(104);
			match(T__1);
			setState(105);
			complementoLeia();
			setState(106);
			fim();
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
	public static class ComplementoLeiaContext extends ParserRuleContext {
		public ComplementoLeiaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complementoLeia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterComplementoLeia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitComplementoLeia(this);
		}
	}

	public final ComplementoLeiaContext complementoLeia() throws RecognitionException {
		ComplementoLeiaContext _localctx = new ComplementoLeiaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_complementoLeia);
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdImprimeContext extends ParserRuleContext {
		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class,0);
		}
		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public TextoContext texto() {
			return getRuleContext(TextoContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public CmdImprimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdImprime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdImprime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdImprime(this);
		}
	}

	public final CmdImprimeContext cmdImprime() throws RecognitionException {
		CmdImprimeContext _localctx = new CmdImprimeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cmdImprime);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(T__2);
			setState(114);
			leftParen();
			setState(117);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TEXTO:
				{
				setState(115);
				texto();
				}
				break;
			case ID:
				{
				setState(116);
				id();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(119);
			rightParen();
			setState(120);
			fim();
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
	public static class CmdExpressaoContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FimContext fim() {
			return getRuleContext(FimContext.class,0);
		}
		public CmdExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdExpressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdExpressao(this);
		}
	}

	public final CmdExpressaoContext cmdExpressao() throws RecognitionException {
		CmdExpressaoContext _localctx = new CmdExpressaoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_cmdExpressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			expr();
			setState(123);
			fim();
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
	public static class CmdSeContext extends ParserRuleContext {
		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class,0);
		}
		public List<ExpressaoContext> expressao() {
			return getRuleContexts(ExpressaoContext.class);
		}
		public ExpressaoContext expressao(int i) {
			return getRuleContext(ExpressaoContext.class,i);
		}
		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class,0);
		}
		public LeftChaveContext leftChave() {
			return getRuleContext(LeftChaveContext.class,0);
		}
		public RightChaveContext rightChave() {
			return getRuleContext(RightChaveContext.class,0);
		}
		public CompIgualContext compIgual() {
			return getRuleContext(CompIgualContext.class,0);
		}
		public CompMaiorContext compMaior() {
			return getRuleContext(CompMaiorContext.class,0);
		}
		public CompMenorContext compMenor() {
			return getRuleContext(CompMenorContext.class,0);
		}
		public CompMeIgualContext compMeIgual() {
			return getRuleContext(CompMeIgualContext.class,0);
		}
		public CompMaIgualContext compMaIgual() {
			return getRuleContext(CompMaIgualContext.class,0);
		}
		public CompDiferContext compDifer() {
			return getRuleContext(CompDiferContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdSenaoContext cmdSenao() {
			return getRuleContext(CmdSenaoContext.class,0);
		}
		public CmdSeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdSe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdSe(this);
		}
	}

	public final CmdSeContext cmdSe() throws RecognitionException {
		CmdSeContext _localctx = new CmdSeContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_cmdSe);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(T__3);
			setState(126);
			leftParen();
			setState(127);
			expressao();
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(128);
				compIgual();
				}
				break;
			case T__14:
				{
				setState(129);
				compMaior();
				}
				break;
			case T__15:
				{
				setState(130);
				compMenor();
				}
				break;
			case T__16:
				{
				setState(131);
				compMeIgual();
				}
				break;
			case T__17:
				{
				setState(132);
				compMaIgual();
				}
				break;
			case T__18:
				{
				setState(133);
				compDifer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(136);
			expressao();
			setState(137);
			rightParen();
			setState(138);
			leftChave();
			setState(140); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(139);
				cmd();
				}
				}
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2147487738L) != 0 );
			setState(144);
			rightChave();
			setState(146);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(145);
				cmdSenao();
				}
				break;
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

	@SuppressWarnings("CheckReturnValue")
	public static class CmdSenaoContext extends ParserRuleContext {
		public LeftChaveContext leftChave() {
			return getRuleContext(LeftChaveContext.class,0);
		}
		public RightChaveContext rightChave() {
			return getRuleContext(RightChaveContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdSenaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdSenao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdSenao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdSenao(this);
		}
	}

	public final CmdSenaoContext cmdSenao() throws RecognitionException {
		CmdSenaoContext _localctx = new CmdSenaoContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_cmdSenao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
			match(T__4);
			setState(149);
			leftChave();
			setState(151); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(150);
				cmd();
				}
				}
				setState(153); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2147487738L) != 0 );
			setState(155);
			rightChave();
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
	public static class CmdParaContext extends ParserRuleContext {
		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<IdContext> id() {
			return getRuleContexts(IdContext.class);
		}
		public IdContext id(int i) {
			return getRuleContext(IdContext.class,i);
		}
		public OperadorAtriContext operadorAtri() {
			return getRuleContext(OperadorAtriContext.class,0);
		}
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<FimContext> fim() {
			return getRuleContexts(FimContext.class);
		}
		public FimContext fim(int i) {
			return getRuleContext(FimContext.class,i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class,0);
		}
		public LeftChaveContext leftChave() {
			return getRuleContext(LeftChaveContext.class,0);
		}
		public RightChaveContext rightChave() {
			return getRuleContext(RightChaveContext.class,0);
		}
		public CompIgualContext compIgual() {
			return getRuleContext(CompIgualContext.class,0);
		}
		public CompMaiorContext compMaior() {
			return getRuleContext(CompMaiorContext.class,0);
		}
		public CompMenorContext compMenor() {
			return getRuleContext(CompMenorContext.class,0);
		}
		public CompMeIgualContext compMeIgual() {
			return getRuleContext(CompMeIgualContext.class,0);
		}
		public CompMaIgualContext compMaIgual() {
			return getRuleContext(CompMaIgualContext.class,0);
		}
		public CompDiferContext compDifer() {
			return getRuleContext(CompDiferContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public CmdParaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdPara; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdPara(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdPara(this);
		}
	}

	public final CmdParaContext cmdPara() throws RecognitionException {
		CmdParaContext _localctx = new CmdParaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_cmdPara);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(T__5);
			setState(158);
			leftParen();
			setState(159);
			tipo();
			setState(160);
			id();
			setState(161);
			operadorAtri();
			setState(162);
			numero();
			setState(163);
			fim();
			setState(164);
			id();
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__13:
				{
				setState(165);
				compIgual();
				}
				break;
			case T__14:
				{
				setState(166);
				compMaior();
				}
				break;
			case T__15:
				{
				setState(167);
				compMenor();
				}
				break;
			case T__16:
				{
				setState(168);
				compMeIgual();
				}
				break;
			case T__17:
				{
				setState(169);
				compMaIgual();
				}
				break;
			case T__18:
				{
				setState(170);
				compDifer();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(173);
			numero();
			setState(174);
			fim();
			setState(175);
			expr();
			setState(176);
			rightParen();
			setState(177);
			leftChave();
			setState(179); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(178);
				cmd();
				}
				}
				setState(181); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2147487738L) != 0 );
			setState(183);
			rightChave();
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
	public static class CmdEnquantoContext extends ParserRuleContext {
		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class,0);
		}
		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class,0);
		}
		public LeftChaveContext leftChave() {
			return getRuleContext(LeftChaveContext.class,0);
		}
		public RightChaveContext rightChave() {
			return getRuleContext(RightChaveContext.class,0);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public CompIgualContext compIgual() {
			return getRuleContext(CompIgualContext.class,0);
		}
		public CompMaiorContext compMaior() {
			return getRuleContext(CompMaiorContext.class,0);
		}
		public CompMenorContext compMenor() {
			return getRuleContext(CompMenorContext.class,0);
		}
		public CompMeIgualContext compMeIgual() {
			return getRuleContext(CompMeIgualContext.class,0);
		}
		public CompMaIgualContext compMaIgual() {
			return getRuleContext(CompMaIgualContext.class,0);
		}
		public CompDiferContext compDifer() {
			return getRuleContext(CompDiferContext.class,0);
		}
		public CmdEnquantoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmdEnquanto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCmdEnquanto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCmdEnquanto(this);
		}
	}

	public final CmdEnquantoContext cmdEnquanto() throws RecognitionException {
		CmdEnquantoContext _localctx = new CmdEnquantoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cmdEnquanto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(T__6);
			setState(186);
			leftParen();
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				{
				{
				setState(187);
				expr();
				setState(194);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__13:
					{
					setState(188);
					compIgual();
					}
					break;
				case T__14:
					{
					setState(189);
					compMaior();
					}
					break;
				case T__15:
					{
					setState(190);
					compMenor();
					}
					break;
				case T__16:
					{
					setState(191);
					compMeIgual();
					}
					break;
				case T__17:
					{
					setState(192);
					compMaIgual();
					}
					break;
				case T__18:
					{
					setState(193);
					compDifer();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(196);
				expr();
				}
				}
				break;
			case BOOLEANOtrue:
			case BOOLEANOfalse:
				{
				setState(198);
				booleano();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(201);
			rightParen();
			setState(202);
			leftChave();
			setState(204); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(203);
				cmd();
				}
				}
				setState(206); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( ((_la) & ~0x3f) == 0 && ((1L << _la) & 2147487738L) != 0 );
			setState(208);
			rightChave();
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
	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_la = _input.LA(1);
			if ( !(((_la) & ~0x3f) == 0 && ((1L << _la) & 3840L) != 0) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorAtriContext extends ParserRuleContext {
		public OperadorAtriContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorAtri; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterOperadorAtri(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitOperadorAtri(this);
		}
	}

	public final OperadorAtriContext operadorAtri() throws RecognitionException {
		OperadorAtriContext _localctx = new OperadorAtriContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_operadorAtri);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(T__11);
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
	public static class FimContext extends ParserRuleContext {
		public FimContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fim; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterFim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitFim(this);
		}
	}

	public final FimContext fim() throws RecognitionException {
		FimContext _localctx = new FimContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fim);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			match(T__12);
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
	public static class CompIgualContext extends ParserRuleContext {
		public CompIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compIgual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCompIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCompIgual(this);
		}
	}

	public final CompIgualContext compIgual() throws RecognitionException {
		CompIgualContext _localctx = new CompIgualContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_compIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(T__13);
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
	public static class CompMaiorContext extends ParserRuleContext {
		public CompMaiorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compMaior; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCompMaior(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCompMaior(this);
		}
	}

	public final CompMaiorContext compMaior() throws RecognitionException {
		CompMaiorContext _localctx = new CompMaiorContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_compMaior);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(T__14);
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
	public static class CompMenorContext extends ParserRuleContext {
		public CompMenorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compMenor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCompMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCompMenor(this);
		}
	}

	public final CompMenorContext compMenor() throws RecognitionException {
		CompMenorContext _localctx = new CompMenorContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_compMenor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			match(T__15);
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
	public static class CompMeIgualContext extends ParserRuleContext {
		public CompMeIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compMeIgual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCompMeIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCompMeIgual(this);
		}
	}

	public final CompMeIgualContext compMeIgual() throws RecognitionException {
		CompMeIgualContext _localctx = new CompMeIgualContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_compMeIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			match(T__16);
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
	public static class CompMaIgualContext extends ParserRuleContext {
		public CompMaIgualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compMaIgual; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCompMaIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCompMaIgual(this);
		}
	}

	public final CompMaIgualContext compMaIgual() throws RecognitionException {
		CompMaIgualContext _localctx = new CompMaIgualContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_compMaIgual);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			match(T__17);
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
	public static class CompDiferContext extends ParserRuleContext {
		public CompDiferContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compDifer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterCompDifer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitCompDifer(this);
		}
	}

	public final CompDiferContext compDifer() throws RecognitionException {
		CompDiferContext _localctx = new CompDiferContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compDifer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			match(T__18);
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
	public static class NumeroContext extends ParserRuleContext {
		public TerminalNode NUMINT() { return getToken(atribuicaoParser.NUMINT, 0); }
		public TerminalNode NUMFLOAT() { return getToken(atribuicaoParser.NUMFLOAT, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_numero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			_la = _input.LA(1);
			if ( !(_la==NUMINT || _la==NUMFLOAT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode BOOLEANOtrue() { return getToken(atribuicaoParser.BOOLEANOtrue, 0); }
		public TerminalNode BOOLEANOfalse() { return getToken(atribuicaoParser.BOOLEANOfalse, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitBooleano(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_la = _input.LA(1);
			if ( !(_la==BOOLEANOtrue || _la==BOOLEANOfalse) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
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

	@SuppressWarnings("CheckReturnValue")
	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(atribuicaoParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitId(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TextoContext extends ParserRuleContext {
		public TerminalNode TEXTO() { return getToken(atribuicaoParser.TEXTO, 0); }
		public TextoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_texto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterTexto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitTexto(this);
		}
	}

	public final TextoContext texto() throws RecognitionException {
		TextoContext _localctx = new TextoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_texto);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			match(TEXTO);
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
	public static class LeftParenContext extends ParserRuleContext {
		public LeftParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterLeftParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitLeftParen(this);
		}
	}

	public final LeftParenContext leftParen() throws RecognitionException {
		LeftParenContext _localctx = new LeftParenContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_leftParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(T__19);
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
	public static class RightParenContext extends ParserRuleContext {
		public RightParenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightParen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterRightParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitRightParen(this);
		}
	}

	public final RightParenContext rightParen() throws RecognitionException {
		RightParenContext _localctx = new RightParenContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_rightParen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(T__1);
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
	public static class LeftChaveContext extends ParserRuleContext {
		public LeftChaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leftChave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterLeftChave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitLeftChave(this);
		}
	}

	public final LeftChaveContext leftChave() throws RecognitionException {
		LeftChaveContext _localctx = new LeftChaveContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_leftChave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__20);
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
	public static class RightChaveContext extends ParserRuleContext {
		public RightChaveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rightChave; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterRightChave(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitRightChave(this);
		}
	}

	public final RightChaveContext rightChave() throws RecognitionException {
		RightChaveContext _localctx = new RightChaveContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_rightChave);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(T__21);
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
	public static class PlusContext extends ParserRuleContext {
		public PlusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_plus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterPlus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitPlus(this);
		}
	}

	public final PlusContext plus() throws RecognitionException {
		PlusContext _localctx = new PlusContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_plus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(244);
			match(T__22);
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
	public static class MenusContext extends ParserRuleContext {
		public MenusContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_menus; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterMenus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitMenus(this);
		}
	}

	public final MenusContext menus() throws RecognitionException {
		MenusContext _localctx = new MenusContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_menus);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__23);
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
	public static class DivContext extends ParserRuleContext {
		public DivContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_div; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitDiv(this);
		}
	}

	public final DivContext div() throws RecognitionException {
		DivContext _localctx = new DivContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_div);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(T__24);
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
	public static class MultContext extends ParserRuleContext {
		public MultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mult; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterMult(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitMult(this);
		}
	}

	public final MultContext mult() throws RecognitionException {
		MultContext _localctx = new MultContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_mult);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(T__25);
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
	public static class ExprContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public OperadorAtriContext operadorAtri() {
			return getRuleContext(OperadorAtriContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_expr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			id();
			setState(253);
			operadorAtri();
			setState(254);
			expressao();
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
	public static class ExpressaoContext extends ParserRuleContext {
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExpreLinhaContext expreLinha() {
			return getRuleContext(ExpreLinhaContext.class,0);
		}
		public ExpressaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterExpressao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitExpressao(this);
		}
	}

	public final ExpressaoContext expressao() throws RecognitionException {
		ExpressaoContext _localctx = new ExpressaoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_expressao);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			termo();
			setState(257);
			expreLinha();
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
	public static class TermoContext extends ParserRuleContext {
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TermoLinhaContext termoLinha() {
			return getRuleContext(TermoLinhaContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterTermo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitTermo(this);
		}
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_termo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			fator();
			setState(260);
			termoLinha();
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
	public static class ExpreLinhaContext extends ParserRuleContext {
		public PlusContext plus() {
			return getRuleContext(PlusContext.class,0);
		}
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public ExpreLinhaContext expreLinha() {
			return getRuleContext(ExpreLinhaContext.class,0);
		}
		public MenusContext menus() {
			return getRuleContext(MenusContext.class,0);
		}
		public ExpreLinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expreLinha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterExpreLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitExpreLinha(this);
		}
	}

	public final ExpreLinhaContext expreLinha() throws RecognitionException {
		ExpreLinhaContext _localctx = new ExpreLinhaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_expreLinha);
		try {
			setState(272);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(262);
				plus();
				setState(263);
				termo();
				setState(264);
				expreLinha();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(266);
				menus();
				setState(267);
				termo();
				setState(268);
				expreLinha();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	@SuppressWarnings("CheckReturnValue")
	public static class FatorContext extends ParserRuleContext {
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public LeftParenContext leftParen() {
			return getRuleContext(LeftParenContext.class,0);
		}
		public ExpressaoContext expressao() {
			return getRuleContext(ExpressaoContext.class,0);
		}
		public RightParenContext rightParen() {
			return getRuleContext(RightParenContext.class,0);
		}
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterFator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitFator(this);
		}
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_fator);
		try {
			setState(280);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMINT:
			case NUMFLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(274);
				numero();
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				id();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 3);
				{
				setState(276);
				leftParen();
				setState(277);
				expressao();
				setState(278);
				rightParen();
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

	@SuppressWarnings("CheckReturnValue")
	public static class TermoLinhaContext extends ParserRuleContext {
		public MultContext mult() {
			return getRuleContext(MultContext.class,0);
		}
		public FatorContext fator() {
			return getRuleContext(FatorContext.class,0);
		}
		public TermoLinhaContext termoLinha() {
			return getRuleContext(TermoLinhaContext.class,0);
		}
		public DivContext div() {
			return getRuleContext(DivContext.class,0);
		}
		public TermoLinhaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termoLinha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).enterTermoLinha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof atribuicaoListener ) ((atribuicaoListener)listener).exitTermoLinha(this);
		}
	}

	public final TermoLinhaContext termoLinha() throws RecognitionException {
		TermoLinhaContext _localctx = new TermoLinhaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_termoLinha);
		try {
			setState(292);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(282);
				mult();
				setState(283);
				fator();
				setState(284);
				termoLinha();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				div();
				setState(287);
				fator();
				setState(288);
				termoLinha();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
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

	public static final String _serializedATN =
		"\u0004\u0001!\u0127\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0001\u0000\u0004\u0000N\b\u0000"+
		"\u000b\u0000\f\u0000O\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001Z\b\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002c\b\u0002\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0003\u0004p\b\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005v\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u0087\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0004\u0007\u008d\b\u0007\u000b\u0007\f\u0007\u008e\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u0093\b\u0007\u0001\b\u0001\b\u0001\b\u0004"+
		"\b\u0098\b\b\u000b\b\f\b\u0099\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0003\t\u00ac\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0004\t\u00b4\b\t\u000b\t\f\t\u00b5\u0001\t\u0001\t\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00c3\b\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c8\b\n\u0001\n\u0001\n"+
		"\u0001\n\u0004\n\u00cd\b\n\u000b\n\f\n\u00ce\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001"+
		"\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001"+
		"\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0003#\u0111\b#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0001$\u0003$\u0119\b$\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0001%\u0001%\u0001%\u0001%\u0001%\u0003%\u0125\b%\u0001%\u0000"+
		"\u0000&\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJ\u0000\u0003\u0001\u0000\b\u000b"+
		"\u0001\u0000\u001b\u001c\u0001\u0000\u001d\u001e\u012b\u0000M\u0001\u0000"+
		"\u0000\u0000\u0002Y\u0001\u0000\u0000\u0000\u0004[\u0001\u0000\u0000\u0000"+
		"\u0006f\u0001\u0000\u0000\u0000\bo\u0001\u0000\u0000\u0000\nq\u0001\u0000"+
		"\u0000\u0000\fz\u0001\u0000\u0000\u0000\u000e}\u0001\u0000\u0000\u0000"+
		"\u0010\u0094\u0001\u0000\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000"+
		"\u0014\u00b9\u0001\u0000\u0000\u0000\u0016\u00d2\u0001\u0000\u0000\u0000"+
		"\u0018\u00d4\u0001\u0000\u0000\u0000\u001a\u00d6\u0001\u0000\u0000\u0000"+
		"\u001c\u00d8\u0001\u0000\u0000\u0000\u001e\u00da\u0001\u0000\u0000\u0000"+
		" \u00dc\u0001\u0000\u0000\u0000\"\u00de\u0001\u0000\u0000\u0000$\u00e0"+
		"\u0001\u0000\u0000\u0000&\u00e2\u0001\u0000\u0000\u0000(\u00e4\u0001\u0000"+
		"\u0000\u0000*\u00e6\u0001\u0000\u0000\u0000,\u00e8\u0001\u0000\u0000\u0000"+
		".\u00ea\u0001\u0000\u0000\u00000\u00ec\u0001\u0000\u0000\u00002\u00ee"+
		"\u0001\u0000\u0000\u00004\u00f0\u0001\u0000\u0000\u00006\u00f2\u0001\u0000"+
		"\u0000\u00008\u00f4\u0001\u0000\u0000\u0000:\u00f6\u0001\u0000\u0000\u0000"+
		"<\u00f8\u0001\u0000\u0000\u0000>\u00fa\u0001\u0000\u0000\u0000@\u00fc"+
		"\u0001\u0000\u0000\u0000B\u0100\u0001\u0000\u0000\u0000D\u0103\u0001\u0000"+
		"\u0000\u0000F\u0110\u0001\u0000\u0000\u0000H\u0118\u0001\u0000\u0000\u0000"+
		"J\u0124\u0001\u0000\u0000\u0000LN\u0003\u0002\u0001\u0000ML\u0001\u0000"+
		"\u0000\u0000NO\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000OP\u0001"+
		"\u0000\u0000\u0000P\u0001\u0001\u0000\u0000\u0000QZ\u0003\u0004\u0002"+
		"\u0000RZ\u0003\u0006\u0003\u0000SZ\u0003\n\u0005\u0000TZ\u0003\f\u0006"+
		"\u0000UZ\u0003\u000e\u0007\u0000VZ\u0003\u0012\t\u0000WZ\u0003\u0014\n"+
		"\u0000XZ\u0003\u0010\b\u0000YQ\u0001\u0000\u0000\u0000YR\u0001\u0000\u0000"+
		"\u0000YS\u0001\u0000\u0000\u0000YT\u0001\u0000\u0000\u0000YU\u0001\u0000"+
		"\u0000\u0000YV\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YX\u0001"+
		"\u0000\u0000\u0000Z\u0003\u0001\u0000\u0000\u0000[\\\u0003\u0016\u000b"+
		"\u0000\\]\u0003,\u0016\u0000]b\u0003\u0018\f\u0000^c\u0003,\u0016\u0000"+
		"_c\u0003(\u0014\u0000`c\u0003.\u0017\u0000ac\u0003*\u0015\u0000b^\u0001"+
		"\u0000\u0000\u0000b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000"+
		"ba\u0001\u0000\u0000\u0000cd\u0001\u0000\u0000\u0000de\u0003\u001a\r\u0000"+
		"e\u0005\u0001\u0000\u0000\u0000fg\u0005\u0001\u0000\u0000gh\u0003,\u0016"+
		"\u0000hi\u0005\u0002\u0000\u0000ij\u0003\b\u0004\u0000jk\u0003\u001a\r"+
		"\u0000k\u0007\u0001\u0000\u0000\u0000lp\u0001\u0000\u0000\u0000mp\u0001"+
		"\u0000\u0000\u0000np\u0001\u0000\u0000\u0000ol\u0001\u0000\u0000\u0000"+
		"om\u0001\u0000\u0000\u0000on\u0001\u0000\u0000\u0000p\t\u0001\u0000\u0000"+
		"\u0000qr\u0005\u0003\u0000\u0000ru\u00030\u0018\u0000sv\u0003.\u0017\u0000"+
		"tv\u0003,\u0016\u0000us\u0001\u0000\u0000\u0000ut\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wx\u00032\u0019\u0000xy\u0003\u001a\r\u0000"+
		"y\u000b\u0001\u0000\u0000\u0000z{\u0003@ \u0000{|\u0003\u001a\r\u0000"+
		"|\r\u0001\u0000\u0000\u0000}~\u0005\u0004\u0000\u0000~\u007f\u00030\u0018"+
		"\u0000\u007f\u0086\u0003B!\u0000\u0080\u0087\u0003\u001c\u000e\u0000\u0081"+
		"\u0087\u0003\u001e\u000f\u0000\u0082\u0087\u0003 \u0010\u0000\u0083\u0087"+
		"\u0003\"\u0011\u0000\u0084\u0087\u0003$\u0012\u0000\u0085\u0087\u0003"+
		"&\u0013\u0000\u0086\u0080\u0001\u0000\u0000\u0000\u0086\u0081\u0001\u0000"+
		"\u0000\u0000\u0086\u0082\u0001\u0000\u0000\u0000\u0086\u0083\u0001\u0000"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0086\u0085\u0001\u0000"+
		"\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0089\u0003B!\u0000"+
		"\u0089\u008a\u00032\u0019\u0000\u008a\u008c\u00034\u001a\u0000\u008b\u008d"+
		"\u0003\u0002\u0001\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e\u008f"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0092"+
		"\u00036\u001b\u0000\u0091\u0093\u0003\u0010\b\u0000\u0092\u0091\u0001"+
		"\u0000\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u000f\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0005\u0005\u0000\u0000\u0095\u0097\u0003"+
		"4\u001a\u0000\u0096\u0098\u0003\u0002\u0001\u0000\u0097\u0096\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009b\u0001\u0000"+
		"\u0000\u0000\u009b\u009c\u00036\u001b\u0000\u009c\u0011\u0001\u0000\u0000"+
		"\u0000\u009d\u009e\u0005\u0006\u0000\u0000\u009e\u009f\u00030\u0018\u0000"+
		"\u009f\u00a0\u0003\u0016\u000b\u0000\u00a0\u00a1\u0003,\u0016\u0000\u00a1"+
		"\u00a2\u0003\u0018\f\u0000\u00a2\u00a3\u0003(\u0014\u0000\u00a3\u00a4"+
		"\u0003\u001a\r\u0000\u00a4\u00ab\u0003,\u0016\u0000\u00a5\u00ac\u0003"+
		"\u001c\u000e\u0000\u00a6\u00ac\u0003\u001e\u000f\u0000\u00a7\u00ac\u0003"+
		" \u0010\u0000\u00a8\u00ac\u0003\"\u0011\u0000\u00a9\u00ac\u0003$\u0012"+
		"\u0000\u00aa\u00ac\u0003&\u0013\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a6\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000"+
		"\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000"+
		"\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000"+
		"\u00ad\u00ae\u0003(\u0014\u0000\u00ae\u00af\u0003\u001a\r\u0000\u00af"+
		"\u00b0\u0003@ \u0000\u00b0\u00b1\u00032\u0019\u0000\u00b1\u00b3\u0003"+
		"4\u001a\u0000\u00b2\u00b4\u0003\u0002\u0001\u0000\u00b3\u00b2\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00b7\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b8\u00036\u001b\u0000\u00b8\u0013\u0001\u0000\u0000"+
		"\u0000\u00b9\u00ba\u0005\u0007\u0000\u0000\u00ba\u00c7\u00030\u0018\u0000"+
		"\u00bb\u00c2\u0003@ \u0000\u00bc\u00c3\u0003\u001c\u000e\u0000\u00bd\u00c3"+
		"\u0003\u001e\u000f\u0000\u00be\u00c3\u0003 \u0010\u0000\u00bf\u00c3\u0003"+
		"\"\u0011\u0000\u00c0\u00c3\u0003$\u0012\u0000\u00c1\u00c3\u0003&\u0013"+
		"\u0000\u00c2\u00bc\u0001\u0000\u0000\u0000\u00c2\u00bd\u0001\u0000\u0000"+
		"\u0000\u00c2\u00be\u0001\u0000\u0000\u0000\u00c2\u00bf\u0001\u0000\u0000"+
		"\u0000\u00c2\u00c0\u0001\u0000\u0000\u0000\u00c2\u00c1\u0001\u0000\u0000"+
		"\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0003@ \u0000\u00c5"+
		"\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c8\u0003*\u0015\u0000\u00c7\u00bb"+
		"\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c9\u00ca\u00032\u0019\u0000\u00ca\u00cc\u0003"+
		"4\u001a\u0000\u00cb\u00cd\u0003\u0002\u0001\u0000\u00cc\u00cb\u0001\u0000"+
		"\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000"+
		"\u0000\u0000\u00ce\u00cf\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d1\u00036\u001b\u0000\u00d1\u0015\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0007\u0000\u0000\u0000\u00d3\u0017\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d5\u0005\f\u0000\u0000\u00d5\u0019\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d7\u0005\r\u0000\u0000\u00d7\u001b\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d9\u0005\u000e\u0000\u0000\u00d9\u001d\u0001\u0000\u0000\u0000\u00da"+
		"\u00db\u0005\u000f\u0000\u0000\u00db\u001f\u0001\u0000\u0000\u0000\u00dc"+
		"\u00dd\u0005\u0010\u0000\u0000\u00dd!\u0001\u0000\u0000\u0000\u00de\u00df"+
		"\u0005\u0011\u0000\u0000\u00df#\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005"+
		"\u0012\u0000\u0000\u00e1%\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u0013"+
		"\u0000\u0000\u00e3\'\u0001\u0000\u0000\u0000\u00e4\u00e5\u0007\u0001\u0000"+
		"\u0000\u00e5)\u0001\u0000\u0000\u0000\u00e6\u00e7\u0007\u0002\u0000\u0000"+
		"\u00e7+\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u001f\u0000\u0000\u00e9"+
		"-\u0001\u0000\u0000\u0000\u00ea\u00eb\u0005 \u0000\u0000\u00eb/\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0005\u0014\u0000\u0000\u00ed1\u0001\u0000"+
		"\u0000\u0000\u00ee\u00ef\u0005\u0002\u0000\u0000\u00ef3\u0001\u0000\u0000"+
		"\u0000\u00f0\u00f1\u0005\u0015\u0000\u0000\u00f15\u0001\u0000\u0000\u0000"+
		"\u00f2\u00f3\u0005\u0016\u0000\u0000\u00f37\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0005\u0017\u0000\u0000\u00f59\u0001\u0000\u0000\u0000\u00f6\u00f7"+
		"\u0005\u0018\u0000\u0000\u00f7;\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005"+
		"\u0019\u0000\u0000\u00f9=\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u001a"+
		"\u0000\u0000\u00fb?\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003,\u0016\u0000"+
		"\u00fd\u00fe\u0003\u0018\f\u0000\u00fe\u00ff\u0003B!\u0000\u00ffA\u0001"+
		"\u0000\u0000\u0000\u0100\u0101\u0003D\"\u0000\u0101\u0102\u0003F#\u0000"+
		"\u0102C\u0001\u0000\u0000\u0000\u0103\u0104\u0003H$\u0000\u0104\u0105"+
		"\u0003J%\u0000\u0105E\u0001\u0000\u0000\u0000\u0106\u0107\u00038\u001c"+
		"\u0000\u0107\u0108\u0003D\"\u0000\u0108\u0109\u0003F#\u0000\u0109\u0111"+
		"\u0001\u0000\u0000\u0000\u010a\u010b\u0003:\u001d\u0000\u010b\u010c\u0003"+
		"D\"\u0000\u010c\u010d\u0003F#\u0000\u010d\u0111\u0001\u0000\u0000\u0000"+
		"\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u0111\u0001\u0000\u0000\u0000"+
		"\u0110\u0106\u0001\u0000\u0000\u0000\u0110\u010a\u0001\u0000\u0000\u0000"+
		"\u0110\u010e\u0001\u0000\u0000\u0000\u0110\u010f\u0001\u0000\u0000\u0000"+
		"\u0111G\u0001\u0000\u0000\u0000\u0112\u0119\u0003(\u0014\u0000\u0113\u0119"+
		"\u0003,\u0016\u0000\u0114\u0115\u00030\u0018\u0000\u0115\u0116\u0003B"+
		"!\u0000\u0116\u0117\u00032\u0019\u0000\u0117\u0119\u0001\u0000\u0000\u0000"+
		"\u0118\u0112\u0001\u0000\u0000\u0000\u0118\u0113\u0001\u0000\u0000\u0000"+
		"\u0118\u0114\u0001\u0000\u0000\u0000\u0119I\u0001\u0000\u0000\u0000\u011a"+
		"\u011b\u0003>\u001f\u0000\u011b\u011c\u0003H$\u0000\u011c\u011d\u0003"+
		"J%\u0000\u011d\u0125\u0001\u0000\u0000\u0000\u011e\u011f\u0003<\u001e"+
		"\u0000\u011f\u0120\u0003H$\u0000\u0120\u0121\u0003J%\u0000\u0121\u0125"+
		"\u0001\u0000\u0000\u0000\u0122\u0125\u0001\u0000\u0000\u0000\u0123\u0125"+
		"\u0001\u0000\u0000\u0000\u0124\u011a\u0001\u0000\u0000\u0000\u0124\u011e"+
		"\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0123"+
		"\u0001\u0000\u0000\u0000\u0125K\u0001\u0000\u0000\u0000\u0011OYbou\u0086"+
		"\u008e\u0092\u0099\u00ab\u00b5\u00c2\u00c7\u00ce\u0110\u0118\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}