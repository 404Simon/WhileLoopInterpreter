// Generated from grammar/Loop.g4 by ANTLR 4.13.1
package parser.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LoopParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, VAR=8, INT=9, 
		NEWLINE=10, LEER=11, LINE_COMMENT=12;
	public static final int
		RULE_start = 0, RULE_expr = 1, RULE_asrt = 2, RULE_prog = 3;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "expr", "asrt", "prog"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'='", "';'", "'LOOP'", "'DO'", "'END'", null, null, 
			null, "' '"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "VAR", "INT", "NEWLINE", 
			"LEER", "LINE_COMMENT"
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
	public String getGrammarFileName() { return "Loop.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LoopParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public TerminalNode EOF() { return getToken(LoopParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoopVisitor ) return ((LoopVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			prog(0);
			setState(9);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PlusContext extends ExprContext {
		public Token var;
		public Token num;
		public TerminalNode VAR() { return getToken(LoopParser.VAR, 0); }
		public TerminalNode INT() { return getToken(LoopParser.INT, 0); }
		public PlusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoopVisitor ) return ((LoopVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MinusContext extends ExprContext {
		public Token var;
		public Token num;
		public TerminalNode VAR() { return getToken(LoopParser.VAR, 0); }
		public TerminalNode INT() { return getToken(LoopParser.INT, 0); }
		public MinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoopVisitor ) return ((LoopVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_expr);
		try {
			setState(17);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new PlusContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(11);
				((PlusContext)_localctx).var = match(VAR);
				setState(12);
				match(T__0);
				setState(13);
				((PlusContext)_localctx).num = match(INT);
				}
				break;
			case 2:
				_localctx = new MinusContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(14);
				((MinusContext)_localctx).var = match(VAR);
				setState(15);
				match(T__1);
				setState(16);
				((MinusContext)_localctx).num = match(INT);
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
	public static class AsrtContext extends ParserRuleContext {
		public AsrtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asrt; }
	 
		public AsrtContext() { }
		public void copyFrom(AsrtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExContext extends AsrtContext {
		public Token var;
		public ExprContext ex;
		public TerminalNode VAR() { return getToken(LoopParser.VAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExContext(AsrtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoopVisitor ) return ((LoopVisitor<? extends T>)visitor).visitEx(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NumContext extends AsrtContext {
		public Token var;
		public Token num;
		public TerminalNode VAR() { return getToken(LoopParser.VAR, 0); }
		public TerminalNode INT() { return getToken(LoopParser.INT, 0); }
		public NumContext(AsrtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoopVisitor ) return ((LoopVisitor<? extends T>)visitor).visitNum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class VaContext extends AsrtContext {
		public Token varTo;
		public Token varFrom;
		public List<TerminalNode> VAR() { return getTokens(LoopParser.VAR); }
		public TerminalNode VAR(int i) {
			return getToken(LoopParser.VAR, i);
		}
		public VaContext(AsrtContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoopVisitor ) return ((LoopVisitor<? extends T>)visitor).visitVa(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsrtContext asrt() throws RecognitionException {
		AsrtContext _localctx = new AsrtContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asrt);
		try {
			setState(32);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new ExContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(19);
				((ExContext)_localctx).var = match(VAR);
				setState(20);
				match(T__2);
				setState(21);
				((ExContext)_localctx).ex = expr();
				setState(22);
				match(T__3);
				}
				break;
			case 2:
				_localctx = new VaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(24);
				((VaContext)_localctx).varTo = match(VAR);
				setState(25);
				match(T__2);
				setState(26);
				((VaContext)_localctx).varFrom = match(VAR);
				setState(27);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new NumContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(28);
				((NumContext)_localctx).var = match(VAR);
				setState(29);
				match(T__2);
				setState(30);
				((NumContext)_localctx).num = match(INT);
				setState(31);
				match(T__3);
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
	public static class ProgContext extends ParserRuleContext {
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
	 
		public ProgContext() { }
		public void copyFrom(ProgContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopContext extends ProgContext {
		public Token var;
		public ProgContext p;
		public TerminalNode VAR() { return getToken(LoopParser.VAR, 0); }
		public ProgContext prog() {
			return getRuleContext(ProgContext.class,0);
		}
		public LoopContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoopVisitor ) return ((LoopVisitor<? extends T>)visitor).visitLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ProgProgContext extends ProgContext {
		public List<ProgContext> prog() {
			return getRuleContexts(ProgContext.class);
		}
		public ProgContext prog(int i) {
			return getRuleContext(ProgContext.class,i);
		}
		public ProgProgContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoopVisitor ) return ((LoopVisitor<? extends T>)visitor).visitProgProg(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsertContext extends ProgContext {
		public AsrtContext asrt() {
			return getRuleContext(AsrtContext.class,0);
		}
		public AsertContext(ProgContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LoopVisitor ) return ((LoopVisitor<? extends T>)visitor).visitAsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		return prog(0);
	}

	private ProgContext prog(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProgContext _localctx = new ProgContext(_ctx, _parentState);
		ProgContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_prog, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				{
				_localctx = new AsertContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(35);
				asrt();
				}
				break;
			case T__4:
				{
				_localctx = new LoopContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(T__4);
				setState(37);
				((LoopContext)_localctx).var = match(VAR);
				setState(38);
				match(T__5);
				setState(39);
				((LoopContext)_localctx).p = prog(0);
				setState(40);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(48);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ProgProgContext(new ProgContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_prog);
					setState(44);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(45);
					prog(2);
					}
					} 
				}
				setState(50);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return prog_sempred((ProgContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean prog_sempred(ProgContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\f4\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0003\u0001\u0012\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002!\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003+\b\u0003\u0001\u0003\u0001\u0003\u0005"+
		"\u0003/\b\u0003\n\u0003\f\u00032\t\u0003\u0001\u0003\u0000\u0001\u0006"+
		"\u0004\u0000\u0002\u0004\u0006\u0000\u00004\u0000\b\u0001\u0000\u0000"+
		"\u0000\u0002\u0011\u0001\u0000\u0000\u0000\u0004 \u0001\u0000\u0000\u0000"+
		"\u0006*\u0001\u0000\u0000\u0000\b\t\u0003\u0006\u0003\u0000\t\n\u0005"+
		"\u0000\u0000\u0001\n\u0001\u0001\u0000\u0000\u0000\u000b\f\u0005\b\u0000"+
		"\u0000\f\r\u0005\u0001\u0000\u0000\r\u0012\u0005\t\u0000\u0000\u000e\u000f"+
		"\u0005\b\u0000\u0000\u000f\u0010\u0005\u0002\u0000\u0000\u0010\u0012\u0005"+
		"\t\u0000\u0000\u0011\u000b\u0001\u0000\u0000\u0000\u0011\u000e\u0001\u0000"+
		"\u0000\u0000\u0012\u0003\u0001\u0000\u0000\u0000\u0013\u0014\u0005\b\u0000"+
		"\u0000\u0014\u0015\u0005\u0003\u0000\u0000\u0015\u0016\u0003\u0002\u0001"+
		"\u0000\u0016\u0017\u0005\u0004\u0000\u0000\u0017!\u0001\u0000\u0000\u0000"+
		"\u0018\u0019\u0005\b\u0000\u0000\u0019\u001a\u0005\u0003\u0000\u0000\u001a"+
		"\u001b\u0005\b\u0000\u0000\u001b!\u0005\u0004\u0000\u0000\u001c\u001d"+
		"\u0005\b\u0000\u0000\u001d\u001e\u0005\u0003\u0000\u0000\u001e\u001f\u0005"+
		"\t\u0000\u0000\u001f!\u0005\u0004\u0000\u0000 \u0013\u0001\u0000\u0000"+
		"\u0000 \u0018\u0001\u0000\u0000\u0000 \u001c\u0001\u0000\u0000\u0000!"+
		"\u0005\u0001\u0000\u0000\u0000\"#\u0006\u0003\uffff\uffff\u0000#+\u0003"+
		"\u0004\u0002\u0000$%\u0005\u0005\u0000\u0000%&\u0005\b\u0000\u0000&\'"+
		"\u0005\u0006\u0000\u0000\'(\u0003\u0006\u0003\u0000()\u0005\u0007\u0000"+
		"\u0000)+\u0001\u0000\u0000\u0000*\"\u0001\u0000\u0000\u0000*$\u0001\u0000"+
		"\u0000\u0000+0\u0001\u0000\u0000\u0000,-\n\u0001\u0000\u0000-/\u0003\u0006"+
		"\u0003\u0002.,\u0001\u0000\u0000\u0000/2\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000001\u0001\u0000\u0000\u00001\u0007\u0001\u0000\u0000"+
		"\u000020\u0001\u0000\u0000\u0000\u0004\u0011 *0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}