// Generated from C:/Users/Best Selina/Desktop/lab3/src\miniSysY.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class miniSysYParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		Int=1, Main=2, Return=3, Const=4, LPar=5, RPar=6, LBrace=7, RBrace=8, 
		Comma=9, Semicolon=10, Add=11, Sub=12, Mul=13, Div=14, Mod=15, Assign=16, 
		DecimalNumber=17, OctalNumber=18, HexadecimalNumber=19, Ident=20, WHITE_SPACE=21, 
		COMMENT=22, COMMENT_LINE=23;
	public static final int
		RULE_compUnit = 0, RULE_funcDef = 1, RULE_funcType = 2, RULE_ident = 3, 
		RULE_block = 4, RULE_blockItem = 5, RULE_decl = 6, RULE_constDecl = 7, 
		RULE_bType = 8, RULE_constDef = 9, RULE_constInitVal = 10, RULE_constExp = 11, 
		RULE_varDecl = 12, RULE_varDef = 13, RULE_initVal = 14, RULE_stmt = 15, 
		RULE_lVal = 16, RULE_exp = 17, RULE_addExp = 18, RULE_addExp0 = 19, RULE_addOp = 20, 
		RULE_mulExp = 21, RULE_mulExp0 = 22, RULE_mulOp = 23, RULE_unaryExp = 24, 
		RULE_funcRParams = 25, RULE_unaryOp = 26, RULE_primaryExp = 27, RULE_number = 28;
	private static String[] makeRuleNames() {
		return new String[] {
			"compUnit", "funcDef", "funcType", "ident", "block", "blockItem", "decl", 
			"constDecl", "bType", "constDef", "constInitVal", "constExp", "varDecl", 
			"varDef", "initVal", "stmt", "lVal", "exp", "addExp", "addExp0", "addOp", 
			"mulExp", "mulExp0", "mulOp", "unaryExp", "funcRParams", "unaryOp", "primaryExp", 
			"number"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'int'", "'main'", "'return'", "'const'", "'('", "')'", "'{'", 
			"'}'", "','", "';'", "'+'", "'-'", "'*'", "'/'", "'%'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "Int", "Main", "Return", "Const", "LPar", "RPar", "LBrace", "RBrace", 
			"Comma", "Semicolon", "Add", "Sub", "Mul", "Div", "Mod", "Assign", "DecimalNumber", 
			"OctalNumber", "HexadecimalNumber", "Ident", "WHITE_SPACE", "COMMENT", 
			"COMMENT_LINE"
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
	public String getGrammarFileName() { return "miniSysY.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public miniSysYParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompUnitContext extends ParserRuleContext {
		public FuncDefContext funcDef() {
			return getRuleContext(FuncDefContext.class,0);
		}
		public CompUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterCompUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitCompUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitCompUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompUnitContext compUnit() throws RecognitionException {
		CompUnitContext _localctx = new CompUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			funcDef();
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

	public static class FuncDefContext extends ParserRuleContext {
		public FuncTypeContext funcType() {
			return getRuleContext(FuncTypeContext.class,0);
		}
		public IdentContext ident() {
			return getRuleContext(IdentContext.class,0);
		}
		public TerminalNode LPar() { return getToken(miniSysYParser.LPar, 0); }
		public TerminalNode RPar() { return getToken(miniSysYParser.RPar, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public FuncDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefContext funcDef() throws RecognitionException {
		FuncDefContext _localctx = new FuncDefContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funcDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			funcType();
			setState(61);
			ident();
			setState(62);
			match(LPar);
			setState(63);
			match(RPar);
			setState(64);
			block();
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

	public static class FuncTypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(miniSysYParser.Int, 0); }
		public FuncTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterFuncType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitFuncType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitFuncType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncTypeContext funcType() throws RecognitionException {
		FuncTypeContext _localctx = new FuncTypeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(Int);
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

	public static class IdentContext extends ParserRuleContext {
		public TerminalNode Main() { return getToken(miniSysYParser.Main, 0); }
		public IdentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ident; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentContext ident() throws RecognitionException {
		IdentContext _localctx = new IdentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_ident);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(Main);
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

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode LBrace() { return getToken(miniSysYParser.LBrace, 0); }
		public TerminalNode RBrace() { return getToken(miniSysYParser.RBrace, 0); }
		public List<BlockItemContext> blockItem() {
			return getRuleContexts(BlockItemContext.class);
		}
		public BlockItemContext blockItem(int i) {
			return getRuleContext(BlockItemContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(LBrace);
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Int) | (1L << Return) | (1L << Const) | (1L << LPar) | (1L << Semicolon) | (1L << Add) | (1L << Sub) | (1L << DecimalNumber) | (1L << OctalNumber) | (1L << HexadecimalNumber) | (1L << Ident))) != 0)) {
				{
				{
				setState(71);
				blockItem();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(RBrace);
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

	public static class BlockItemContext extends ParserRuleContext {
		public DeclContext decl() {
			return getRuleContext(DeclContext.class,0);
		}
		public StmtContext stmt() {
			return getRuleContext(StmtContext.class,0);
		}
		public BlockItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterBlockItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitBlockItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitBlockItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockItemContext blockItem() throws RecognitionException {
		BlockItemContext _localctx = new BlockItemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_blockItem);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Int:
			case Const:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				decl();
				}
				break;
			case Return:
			case LPar:
			case Semicolon:
			case Add:
			case Sub:
			case DecimalNumber:
			case OctalNumber:
			case HexadecimalNumber:
			case Ident:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				stmt();
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

	public static class DeclContext extends ParserRuleContext {
		public ConstDeclContext constDecl() {
			return getRuleContext(ConstDeclContext.class,0);
		}
		public VarDeclContext varDecl() {
			return getRuleContext(VarDeclContext.class,0);
		}
		public DeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclContext decl() throws RecognitionException {
		DeclContext _localctx = new DeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_decl);
		try {
			setState(85);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Const:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				constDecl();
				}
				break;
			case Int:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				varDecl();
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

	public static class ConstDeclContext extends ParserRuleContext {
		public TerminalNode Const() { return getToken(miniSysYParser.Const, 0); }
		public BTypeContext bType() {
			return getRuleContext(BTypeContext.class,0);
		}
		public List<ConstDefContext> constDef() {
			return getRuleContexts(ConstDefContext.class);
		}
		public ConstDefContext constDef(int i) {
			return getRuleContext(ConstDefContext.class,i);
		}
		public TerminalNode Semicolon() { return getToken(miniSysYParser.Semicolon, 0); }
		public List<TerminalNode> Comma() { return getTokens(miniSysYParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(miniSysYParser.Comma, i);
		}
		public ConstDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterConstDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitConstDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitConstDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDeclContext constDecl() throws RecognitionException {
		ConstDeclContext _localctx = new ConstDeclContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_constDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(Const);
			setState(88);
			bType();
			setState(89);
			constDef();
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(90);
				match(Comma);
				setState(91);
				constDef();
				}
				}
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			match(Semicolon);
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

	public static class BTypeContext extends ParserRuleContext {
		public TerminalNode Int() { return getToken(miniSysYParser.Int, 0); }
		public BTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterBType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitBType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitBType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BTypeContext bType() throws RecognitionException {
		BTypeContext _localctx = new BTypeContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(Int);
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

	public static class ConstDefContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(miniSysYParser.Ident, 0); }
		public TerminalNode Assign() { return getToken(miniSysYParser.Assign, 0); }
		public ConstInitValContext constInitVal() {
			return getRuleContext(ConstInitValContext.class,0);
		}
		public ConstDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterConstDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitConstDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitConstDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstDefContext constDef() throws RecognitionException {
		ConstDefContext _localctx = new ConstDefContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_constDef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(Ident);
			setState(102);
			match(Assign);
			setState(103);
			constInitVal();
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

	public static class ConstInitValContext extends ParserRuleContext {
		public ConstExpContext constExp() {
			return getRuleContext(ConstExpContext.class,0);
		}
		public ConstInitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constInitVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterConstInitVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitConstInitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitConstInitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstInitValContext constInitVal() throws RecognitionException {
		ConstInitValContext _localctx = new ConstInitValContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_constInitVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			constExp();
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

	public static class ConstExpContext extends ParserRuleContext {
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public ConstExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterConstExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitConstExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitConstExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstExpContext constExp() throws RecognitionException {
		ConstExpContext _localctx = new ConstExpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_constExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			addExp();
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

	public static class VarDeclContext extends ParserRuleContext {
		public BTypeContext bType() {
			return getRuleContext(BTypeContext.class,0);
		}
		public List<VarDefContext> varDef() {
			return getRuleContexts(VarDefContext.class);
		}
		public VarDefContext varDef(int i) {
			return getRuleContext(VarDefContext.class,i);
		}
		public TerminalNode Semicolon() { return getToken(miniSysYParser.Semicolon, 0); }
		public List<TerminalNode> Comma() { return getTokens(miniSysYParser.Comma); }
		public TerminalNode Comma(int i) {
			return getToken(miniSysYParser.Comma, i);
		}
		public VarDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclContext varDecl() throws RecognitionException {
		VarDeclContext _localctx = new VarDeclContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_varDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			bType();
			setState(110);
			varDef();
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==Comma) {
				{
				{
				setState(111);
				match(Comma);
				setState(112);
				varDef();
				}
				}
				setState(117);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(118);
			match(Semicolon);
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

	public static class VarDefContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(miniSysYParser.Ident, 0); }
		public TerminalNode Assign() { return getToken(miniSysYParser.Assign, 0); }
		public InitValContext initVal() {
			return getRuleContext(InitValContext.class,0);
		}
		public VarDefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitVarDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDefContext varDef() throws RecognitionException {
		VarDefContext _localctx = new VarDefContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varDef);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(Ident);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(Ident);
				setState(122);
				match(Assign);
				setState(123);
				initVal();
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

	public static class InitValContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public InitValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_initVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterInitVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitInitVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitInitVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InitValContext initVal() throws RecognitionException {
		InitValContext _localctx = new InitValContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_initVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			exp();
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

	public static class StmtContext extends ParserRuleContext {
		public LValContext lVal() {
			return getRuleContext(LValContext.class,0);
		}
		public TerminalNode Assign() { return getToken(miniSysYParser.Assign, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode Semicolon() { return getToken(miniSysYParser.Semicolon, 0); }
		public TerminalNode Return() { return getToken(miniSysYParser.Return, 0); }
		public StmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmtContext stmt() throws RecognitionException {
		StmtContext _localctx = new StmtContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stmt);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				lVal();
				setState(129);
				match(Assign);
				setState(130);
				exp();
				setState(131);
				match(Semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(133);
				match(Return);
				setState(134);
				exp();
				setState(135);
				match(Semicolon);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(137);
				exp();
				setState(138);
				match(Semicolon);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(Semicolon);
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

	public static class LValContext extends ParserRuleContext {
		public TerminalNode Ident() { return getToken(miniSysYParser.Ident, 0); }
		public LValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterLVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitLVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitLVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LValContext lVal() throws RecognitionException {
		LValContext _localctx = new LValContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_lVal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(Ident);
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

	public static class ExpContext extends ParserRuleContext {
		public AddExpContext addExp() {
			return getRuleContext(AddExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(145);
			addExp();
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

	public static class AddExpContext extends ParserRuleContext {
		public MulExpContext mulExp() {
			return getRuleContext(MulExpContext.class,0);
		}
		public AddExp0Context addExp0() {
			return getRuleContext(AddExp0Context.class,0);
		}
		public AddExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterAddExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitAddExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitAddExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExpContext addExp() throws RecognitionException {
		AddExpContext _localctx = new AddExpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_addExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			mulExp();
			setState(148);
			addExp0();
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

	public static class AddExp0Context extends ParserRuleContext {
		public AddOpContext addOp() {
			return getRuleContext(AddOpContext.class,0);
		}
		public MulExpContext mulExp() {
			return getRuleContext(MulExpContext.class,0);
		}
		public AddExp0Context addExp0() {
			return getRuleContext(AddExp0Context.class,0);
		}
		public AddExp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addExp0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterAddExp0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitAddExp0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitAddExp0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddExp0Context addExp0() throws RecognitionException {
		AddExp0Context _localctx = new AddExp0Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_addExp0);
		try {
			setState(155);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Add:
			case Sub:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				addOp();
				setState(151);
				mulExp();
				setState(152);
				addExp0();
				}
				break;
			case RPar:
			case Comma:
			case Semicolon:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class AddOpContext extends ParserRuleContext {
		public TerminalNode Add() { return getToken(miniSysYParser.Add, 0); }
		public TerminalNode Sub() { return getToken(miniSysYParser.Sub, 0); }
		public AddOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterAddOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitAddOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitAddOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddOpContext addOp() throws RecognitionException {
		AddOpContext _localctx = new AddOpContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_addOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !(_la==Add || _la==Sub) ) {
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

	public static class MulExpContext extends ParserRuleContext {
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public MulExp0Context mulExp0() {
			return getRuleContext(MulExp0Context.class,0);
		}
		public MulExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterMulExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitMulExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitMulExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExpContext mulExp() throws RecognitionException {
		MulExpContext _localctx = new MulExpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mulExp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			unaryExp();
			setState(160);
			mulExp0();
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

	public static class MulExp0Context extends ParserRuleContext {
		public MulOpContext mulOp() {
			return getRuleContext(MulOpContext.class,0);
		}
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public MulExp0Context mulExp0() {
			return getRuleContext(MulExp0Context.class,0);
		}
		public MulExp0Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExp0; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterMulExp0(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitMulExp0(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitMulExp0(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExp0Context mulExp0() throws RecognitionException {
		MulExp0Context _localctx = new MulExp0Context(_ctx, getState());
		enterRule(_localctx, 44, RULE_mulExp0);
		try {
			setState(167);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case Mul:
			case Div:
			case Mod:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				mulOp();
				setState(163);
				unaryExp();
				setState(164);
				mulExp0();
				}
				break;
			case RPar:
			case Comma:
			case Semicolon:
			case Add:
			case Sub:
				enterOuterAlt(_localctx, 2);
				{
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

	public static class MulOpContext extends ParserRuleContext {
		public TerminalNode Mul() { return getToken(miniSysYParser.Mul, 0); }
		public TerminalNode Div() { return getToken(miniSysYParser.Div, 0); }
		public TerminalNode Mod() { return getToken(miniSysYParser.Mod, 0); }
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterMulOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitMulOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Mul) | (1L << Div) | (1L << Mod))) != 0)) ) {
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

	public static class UnaryExpContext extends ParserRuleContext {
		public PrimaryExpContext primaryExp() {
			return getRuleContext(PrimaryExpContext.class,0);
		}
		public UnaryOpContext unaryOp() {
			return getRuleContext(UnaryOpContext.class,0);
		}
		public UnaryExpContext unaryExp() {
			return getRuleContext(UnaryExpContext.class,0);
		}
		public TerminalNode Ident() { return getToken(miniSysYParser.Ident, 0); }
		public TerminalNode LPar() { return getToken(miniSysYParser.LPar, 0); }
		public FuncRParamsContext funcRParams() {
			return getRuleContext(FuncRParamsContext.class,0);
		}
		public TerminalNode RPar() { return getToken(miniSysYParser.RPar, 0); }
		public UnaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterUnaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitUnaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitUnaryExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryExpContext unaryExp() throws RecognitionException {
		UnaryExpContext _localctx = new UnaryExpContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_unaryExp);
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				primaryExp();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(172);
				unaryOp();
				setState(173);
				unaryExp();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(175);
				match(Ident);
				setState(176);
				match(LPar);
				setState(177);
				funcRParams();
				setState(178);
				match(RPar);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(180);
				match(Ident);
				setState(181);
				match(LPar);
				setState(182);
				match(RPar);
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

	public static class FuncRParamsContext extends ParserRuleContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public FuncRParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcRParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterFuncRParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitFuncRParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitFuncRParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncRParamsContext funcRParams() throws RecognitionException {
		FuncRParamsContext _localctx = new FuncRParamsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_funcRParams);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			exp();
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

	public static class UnaryOpContext extends ParserRuleContext {
		public TerminalNode Add() { return getToken(miniSysYParser.Add, 0); }
		public TerminalNode Sub() { return getToken(miniSysYParser.Sub, 0); }
		public UnaryOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterUnaryOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitUnaryOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitUnaryOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnaryOpContext unaryOp() throws RecognitionException {
		UnaryOpContext _localctx = new UnaryOpContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_unaryOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_la = _input.LA(1);
			if ( !(_la==Add || _la==Sub) ) {
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

	public static class PrimaryExpContext extends ParserRuleContext {
		public TerminalNode LPar() { return getToken(miniSysYParser.LPar, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public TerminalNode RPar() { return getToken(miniSysYParser.RPar, 0); }
		public LValContext lVal() {
			return getRuleContext(LValContext.class,0);
		}
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public PrimaryExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterPrimaryExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitPrimaryExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitPrimaryExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpContext primaryExp() throws RecognitionException {
		PrimaryExpContext _localctx = new PrimaryExpContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_primaryExp);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPar:
				enterOuterAlt(_localctx, 1);
				{
				setState(189);
				match(LPar);
				setState(190);
				exp();
				setState(191);
				match(RPar);
				}
				break;
			case Ident:
				enterOuterAlt(_localctx, 2);
				{
				setState(193);
				lVal();
				}
				break;
			case DecimalNumber:
			case OctalNumber:
			case HexadecimalNumber:
				enterOuterAlt(_localctx, 3);
				{
				setState(194);
				number();
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

	public static class NumberContext extends ParserRuleContext {
		public TerminalNode DecimalNumber() { return getToken(miniSysYParser.DecimalNumber, 0); }
		public TerminalNode OctalNumber() { return getToken(miniSysYParser.OctalNumber, 0); }
		public TerminalNode HexadecimalNumber() { return getToken(miniSysYParser.HexadecimalNumber, 0); }
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).enterNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof miniSysYListener ) ((miniSysYListener)listener).exitNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof miniSysYVisitor ) return ((miniSysYVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_number);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << DecimalNumber) | (1L << OctalNumber) | (1L << HexadecimalNumber))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31\u00ca\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\7\6K\n\6\f\6\16\6N\13\6\3\6\3\6\3"+
		"\7\3\7\5\7T\n\7\3\b\3\b\5\bX\n\b\3\t\3\t\3\t\3\t\3\t\7\t_\n\t\f\t\16\t"+
		"b\13\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3"+
		"\16\3\16\7\16t\n\16\f\16\16\16w\13\16\3\16\3\16\3\17\3\17\3\17\3\17\5"+
		"\17\177\n\17\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\5\21\u0090\n\21\3\22\3\22\3\23\3\23\3\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\5\25\u009e\n\25\3\26\3\26\3\27\3\27\3\27\3\30"+
		"\3\30\3\30\3\30\3\30\5\30\u00aa\n\30\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u00ba\n\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00c6\n\35\3\36\3\36\3\36\2\2\37\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\5\3\2\r"+
		"\16\3\2\17\21\3\2\23\25\2\u00bc\2<\3\2\2\2\4>\3\2\2\2\6D\3\2\2\2\bF\3"+
		"\2\2\2\nH\3\2\2\2\fS\3\2\2\2\16W\3\2\2\2\20Y\3\2\2\2\22e\3\2\2\2\24g\3"+
		"\2\2\2\26k\3\2\2\2\30m\3\2\2\2\32o\3\2\2\2\34~\3\2\2\2\36\u0080\3\2\2"+
		"\2 \u008f\3\2\2\2\"\u0091\3\2\2\2$\u0093\3\2\2\2&\u0095\3\2\2\2(\u009d"+
		"\3\2\2\2*\u009f\3\2\2\2,\u00a1\3\2\2\2.\u00a9\3\2\2\2\60\u00ab\3\2\2\2"+
		"\62\u00b9\3\2\2\2\64\u00bb\3\2\2\2\66\u00bd\3\2\2\28\u00c5\3\2\2\2:\u00c7"+
		"\3\2\2\2<=\5\4\3\2=\3\3\2\2\2>?\5\6\4\2?@\5\b\5\2@A\7\7\2\2AB\7\b\2\2"+
		"BC\5\n\6\2C\5\3\2\2\2DE\7\3\2\2E\7\3\2\2\2FG\7\4\2\2G\t\3\2\2\2HL\7\t"+
		"\2\2IK\5\f\7\2JI\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2"+
		"\2\2OP\7\n\2\2P\13\3\2\2\2QT\5\16\b\2RT\5 \21\2SQ\3\2\2\2SR\3\2\2\2T\r"+
		"\3\2\2\2UX\5\20\t\2VX\5\32\16\2WU\3\2\2\2WV\3\2\2\2X\17\3\2\2\2YZ\7\6"+
		"\2\2Z[\5\22\n\2[`\5\24\13\2\\]\7\13\2\2]_\5\24\13\2^\\\3\2\2\2_b\3\2\2"+
		"\2`^\3\2\2\2`a\3\2\2\2ac\3\2\2\2b`\3\2\2\2cd\7\f\2\2d\21\3\2\2\2ef\7\3"+
		"\2\2f\23\3\2\2\2gh\7\26\2\2hi\7\22\2\2ij\5\26\f\2j\25\3\2\2\2kl\5\30\r"+
		"\2l\27\3\2\2\2mn\5&\24\2n\31\3\2\2\2op\5\22\n\2pu\5\34\17\2qr\7\13\2\2"+
		"rt\5\34\17\2sq\3\2\2\2tw\3\2\2\2us\3\2\2\2uv\3\2\2\2vx\3\2\2\2wu\3\2\2"+
		"\2xy\7\f\2\2y\33\3\2\2\2z\177\7\26\2\2{|\7\26\2\2|}\7\22\2\2}\177\5\36"+
		"\20\2~z\3\2\2\2~{\3\2\2\2\177\35\3\2\2\2\u0080\u0081\5$\23\2\u0081\37"+
		"\3\2\2\2\u0082\u0083\5\"\22\2\u0083\u0084\7\22\2\2\u0084\u0085\5$\23\2"+
		"\u0085\u0086\7\f\2\2\u0086\u0090\3\2\2\2\u0087\u0088\7\5\2\2\u0088\u0089"+
		"\5$\23\2\u0089\u008a\7\f\2\2\u008a\u0090\3\2\2\2\u008b\u008c\5$\23\2\u008c"+
		"\u008d\7\f\2\2\u008d\u0090\3\2\2\2\u008e\u0090\7\f\2\2\u008f\u0082\3\2"+
		"\2\2\u008f\u0087\3\2\2\2\u008f\u008b\3\2\2\2\u008f\u008e\3\2\2\2\u0090"+
		"!\3\2\2\2\u0091\u0092\7\26\2\2\u0092#\3\2\2\2\u0093\u0094\5&\24\2\u0094"+
		"%\3\2\2\2\u0095\u0096\5,\27\2\u0096\u0097\5(\25\2\u0097\'\3\2\2\2\u0098"+
		"\u0099\5*\26\2\u0099\u009a\5,\27\2\u009a\u009b\5(\25\2\u009b\u009e\3\2"+
		"\2\2\u009c\u009e\3\2\2\2\u009d\u0098\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		")\3\2\2\2\u009f\u00a0\t\2\2\2\u00a0+\3\2\2\2\u00a1\u00a2\5\62\32\2\u00a2"+
		"\u00a3\5.\30\2\u00a3-\3\2\2\2\u00a4\u00a5\5\60\31\2\u00a5\u00a6\5\62\32"+
		"\2\u00a6\u00a7\5.\30\2\u00a7\u00aa\3\2\2\2\u00a8\u00aa\3\2\2\2\u00a9\u00a4"+
		"\3\2\2\2\u00a9\u00a8\3\2\2\2\u00aa/\3\2\2\2\u00ab\u00ac\t\3\2\2\u00ac"+
		"\61\3\2\2\2\u00ad\u00ba\58\35\2\u00ae\u00af\5\66\34\2\u00af\u00b0\5\62"+
		"\32\2\u00b0\u00ba\3\2\2\2\u00b1\u00b2\7\26\2\2\u00b2\u00b3\7\7\2\2\u00b3"+
		"\u00b4\5\64\33\2\u00b4\u00b5\7\b\2\2\u00b5\u00ba\3\2\2\2\u00b6\u00b7\7"+
		"\26\2\2\u00b7\u00b8\7\7\2\2\u00b8\u00ba\7\b\2\2\u00b9\u00ad\3\2\2\2\u00b9"+
		"\u00ae\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b6\3\2\2\2\u00ba\63\3\2\2"+
		"\2\u00bb\u00bc\5$\23\2\u00bc\65\3\2\2\2\u00bd\u00be\t\2\2\2\u00be\67\3"+
		"\2\2\2\u00bf\u00c0\7\7\2\2\u00c0\u00c1\5$\23\2\u00c1\u00c2\7\b\2\2\u00c2"+
		"\u00c6\3\2\2\2\u00c3\u00c6\5\"\22\2\u00c4\u00c6\5:\36\2\u00c5\u00bf\3"+
		"\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c69\3\2\2\2\u00c7\u00c8"+
		"\t\4\2\2\u00c8;\3\2\2\2\rLSW`u~\u008f\u009d\u00a9\u00b9\u00c5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}