// Generated from C:/Users/Best Selina/Desktop/compile/src\miniSysY_v1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link miniSysY_v1Parser}.
 */
public interface miniSysY_v1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link miniSysY_v1Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompUnit(miniSysY_v1Parser.CompUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysY_v1Parser#compUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompUnit(miniSysY_v1Parser.CompUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysY_v1Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(miniSysY_v1Parser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysY_v1Parser#funcDef}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(miniSysY_v1Parser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysY_v1Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void enterFuncType(miniSysY_v1Parser.FuncTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysY_v1Parser#funcType}.
	 * @param ctx the parse tree
	 */
	void exitFuncType(miniSysY_v1Parser.FuncTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysY_v1Parser#ident}.
	 * @param ctx the parse tree
	 */
	void enterIdent(miniSysY_v1Parser.IdentContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysY_v1Parser#ident}.
	 * @param ctx the parse tree
	 */
	void exitIdent(miniSysY_v1Parser.IdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysY_v1Parser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(miniSysY_v1Parser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysY_v1Parser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(miniSysY_v1Parser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysY_v1Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(miniSysY_v1Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysY_v1Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(miniSysY_v1Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysY_v1Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(miniSysY_v1Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysY_v1Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(miniSysY_v1Parser.NumberContext ctx);
}