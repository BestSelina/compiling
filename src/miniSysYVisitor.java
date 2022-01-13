// Generated from C:/Users/Best Selina/Desktop/lab2/src\miniSysY.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miniSysYParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miniSysYVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(miniSysYParser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(miniSysYParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(miniSysYParser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(miniSysYParser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(miniSysYParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(miniSysYParser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(miniSysYParser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#addExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp(miniSysYParser.AddExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#addExp0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExp0(miniSysYParser.AddExp0Context ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#addOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddOp(miniSysYParser.AddOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#mulExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp(miniSysYParser.MulExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#mulExp0}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExp0(miniSysYParser.MulExp0Context ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#mulOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulOp(miniSysYParser.MulOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#unaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExp(miniSysYParser.UnaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(miniSysYParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#primaryExp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryExp(miniSysYParser.PrimaryExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysYParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(miniSysYParser.NumberContext ctx);
}