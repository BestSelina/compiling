// Generated from C:/Users/Best Selina/Desktop/lab2/src\miniSysY.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniSysYParser}.
 */
public interface miniSysYListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(miniSysYParser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(miniSysYParser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(miniSysYParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(miniSysYParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(miniSysYParser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(miniSysYParser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(miniSysYParser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(miniSysYParser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(miniSysYParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(miniSysYParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(miniSysYParser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(miniSysYParser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(miniSysYParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(miniSysYParser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#addExp}.
	 * @param ctx the parse tree
	 */
	void enterAddExp(miniSysYParser.AddExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#addExp}.
	 * @param ctx the parse tree
	 */
	void exitAddExp(miniSysYParser.AddExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#addExp0}.
	 * @param ctx the parse tree
	 */
	void enterAddExp0(miniSysYParser.AddExp0Context ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#addExp0}.
	 * @param ctx the parse tree
	 */
	void exitAddExp0(miniSysYParser.AddExp0Context ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#addOp}.
	 * @param ctx the parse tree
	 */
	void enterAddOp(miniSysYParser.AddOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#addOp}.
	 * @param ctx the parse tree
	 */
	void exitAddOp(miniSysYParser.AddOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#mulExp}.
	 * @param ctx the parse tree
	 */
	void enterMulExp(miniSysYParser.MulExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#mulExp}.
	 * @param ctx the parse tree
	 */
	void exitMulExp(miniSysYParser.MulExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#mulExp0}.
	 * @param ctx the parse tree
	 */
	void enterMulExp0(miniSysYParser.MulExp0Context ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#mulExp0}.
	 * @param ctx the parse tree
	 */
	void exitMulExp0(miniSysYParser.MulExp0Context ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void enterMulOp(miniSysYParser.MulOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#mulOp}.
	 * @param ctx the parse tree
	 */
	void exitMulOp(miniSysYParser.MulOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExp(miniSysYParser.UnaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#unaryExp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExp(miniSysYParser.UnaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(miniSysYParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(miniSysYParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryExp(miniSysYParser.PrimaryExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#primaryExp}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryExp(miniSysYParser.PrimaryExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(miniSysYParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(miniSysYParser.NumberContext ctx);
}