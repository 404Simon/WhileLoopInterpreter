// Generated from grammar/Loop.g4 by ANTLR 4.13.1
package parser.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LoopParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LoopVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LoopParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(LoopParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Plus}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlus(LoopParser.PlusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Minus}
	 * labeled alternative in {@link LoopParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinus(LoopParser.MinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Ex}
	 * labeled alternative in {@link LoopParser#asrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEx(LoopParser.ExContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Va}
	 * labeled alternative in {@link LoopParser#asrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVa(LoopParser.VaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link LoopParser#asrt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNum(LoopParser.NumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Loop}
	 * labeled alternative in {@link LoopParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(LoopParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ProgProg}
	 * labeled alternative in {@link LoopParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgProg(LoopParser.ProgProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Asert}
	 * labeled alternative in {@link LoopParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsert(LoopParser.AsertContext ctx);
}