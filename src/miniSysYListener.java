// Generated from C:/Users/Best Selina/Desktop/lab5/src\miniSysY.g4 by ANTLR 4.9.2
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
	 * Enter a parse tree produced by {@link miniSysYParser#globalDecl}.
	 * @param ctx the parse tree
	 */
	void enterGlobalDecl(miniSysYParser.GlobalDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#globalDecl}.
	 * @param ctx the parse tree
	 */
	void exitGlobalDecl(miniSysYParser.GlobalDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#globalVarDecl}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVarDecl(miniSysYParser.GlobalVarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#globalVarDecl}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVarDecl(miniSysYParser.GlobalVarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#globalVarDef}.
	 * @param ctx the parse tree
	 */
	void enterGlobalVarDef(miniSysYParser.GlobalVarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#globalVarDef}.
	 * @param ctx the parse tree
	 */
	void exitGlobalVarDef(miniSysYParser.GlobalVarDefContext ctx);
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
	 * Enter a parse tree produced by {@link miniSysYParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void enterBlockItem(miniSysYParser.BlockItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#blockItem}.
	 * @param ctx the parse tree
	 */
	void exitBlockItem(miniSysYParser.BlockItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#decl}.
	 * @param ctx the parse tree
	 */
	void enterDecl(miniSysYParser.DeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#decl}.
	 * @param ctx the parse tree
	 */
	void exitDecl(miniSysYParser.DeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void enterConstDecl(miniSysYParser.ConstDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#constDecl}.
	 * @param ctx the parse tree
	 */
	void exitConstDecl(miniSysYParser.ConstDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#bType}.
	 * @param ctx the parse tree
	 */
	void enterBType(miniSysYParser.BTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#bType}.
	 * @param ctx the parse tree
	 */
	void exitBType(miniSysYParser.BTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#constDef}.
	 * @param ctx the parse tree
	 */
	void enterConstDef(miniSysYParser.ConstDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#constDef}.
	 * @param ctx the parse tree
	 */
	void exitConstDef(miniSysYParser.ConstDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void enterConstInitVal(miniSysYParser.ConstInitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#constInitVal}.
	 * @param ctx the parse tree
	 */
	void exitConstInitVal(miniSysYParser.ConstInitValContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#constExp}.
	 * @param ctx the parse tree
	 */
	void enterConstExp(miniSysYParser.ConstExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#constExp}.
	 * @param ctx the parse tree
	 */
	void exitConstExp(miniSysYParser.ConstExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void enterVarDecl(miniSysYParser.VarDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#varDecl}.
	 * @param ctx the parse tree
	 */
	void exitVarDecl(miniSysYParser.VarDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#varDef}.
	 * @param ctx the parse tree
	 */
	void enterVarDef(miniSysYParser.VarDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#varDef}.
	 * @param ctx the parse tree
	 */
	void exitVarDef(miniSysYParser.VarDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#initVal}.
	 * @param ctx the parse tree
	 */
	void enterInitVal(miniSysYParser.InitValContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#initVal}.
	 * @param ctx the parse tree
	 */
	void exitInitVal(miniSysYParser.InitValContext ctx);
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
	 * Enter a parse tree produced by {@link miniSysYParser#lVal}.
	 * @param ctx the parse tree
	 */
	void enterLVal(miniSysYParser.LValContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#lVal}.
	 * @param ctx the parse tree
	 */
	void exitLVal(miniSysYParser.LValContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#cond}.
	 * @param ctx the parse tree
	 */
	void enterCond(miniSysYParser.CondContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#cond}.
	 * @param ctx the parse tree
	 */
	void exitCond(miniSysYParser.CondContext ctx);
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
	 * Enter a parse tree produced by {@link miniSysYParser#relExp}.
	 * @param ctx the parse tree
	 */
	void enterRelExp(miniSysYParser.RelExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#relExp}.
	 * @param ctx the parse tree
	 */
	void exitRelExp(miniSysYParser.RelExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#relExp0}.
	 * @param ctx the parse tree
	 */
	void enterRelExp0(miniSysYParser.RelExp0Context ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#relExp0}.
	 * @param ctx the parse tree
	 */
	void exitRelExp0(miniSysYParser.RelExp0Context ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#relOp}.
	 * @param ctx the parse tree
	 */
	void enterRelOp(miniSysYParser.RelOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#relOp}.
	 * @param ctx the parse tree
	 */
	void exitRelOp(miniSysYParser.RelOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void enterEqExp(miniSysYParser.EqExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#eqExp}.
	 * @param ctx the parse tree
	 */
	void exitEqExp(miniSysYParser.EqExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#eqExp0}.
	 * @param ctx the parse tree
	 */
	void enterEqExp0(miniSysYParser.EqExp0Context ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#eqExp0}.
	 * @param ctx the parse tree
	 */
	void exitEqExp0(miniSysYParser.EqExp0Context ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#eqOp}.
	 * @param ctx the parse tree
	 */
	void enterEqOp(miniSysYParser.EqOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#eqOp}.
	 * @param ctx the parse tree
	 */
	void exitEqOp(miniSysYParser.EqOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void enterLAndExp(miniSysYParser.LAndExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#lAndExp}.
	 * @param ctx the parse tree
	 */
	void exitLAndExp(miniSysYParser.LAndExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#lAndExp0}.
	 * @param ctx the parse tree
	 */
	void enterLAndExp0(miniSysYParser.LAndExp0Context ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#lAndExp0}.
	 * @param ctx the parse tree
	 */
	void exitLAndExp0(miniSysYParser.LAndExp0Context ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#lAndOp}.
	 * @param ctx the parse tree
	 */
	void enterLAndOp(miniSysYParser.LAndOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#lAndOp}.
	 * @param ctx the parse tree
	 */
	void exitLAndOp(miniSysYParser.LAndOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void enterLOrExp(miniSysYParser.LOrExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#lOrExp}.
	 * @param ctx the parse tree
	 */
	void exitLOrExp(miniSysYParser.LOrExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#lOrExp0}.
	 * @param ctx the parse tree
	 */
	void enterLOrExp0(miniSysYParser.LOrExp0Context ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#lOrExp0}.
	 * @param ctx the parse tree
	 */
	void exitLOrExp0(miniSysYParser.LOrExp0Context ctx);
	/**
	 * Enter a parse tree produced by {@link miniSysYParser#lOrOp}.
	 * @param ctx the parse tree
	 */
	void enterLOrOp(miniSysYParser.LOrOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#lOrOp}.
	 * @param ctx the parse tree
	 */
	void exitLOrOp(miniSysYParser.LOrOpContext ctx);
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
	 * Enter a parse tree produced by {@link miniSysYParser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void enterFuncRParams(miniSysYParser.FuncRParamsContext ctx);
	/**
	 * Exit a parse tree produced by {@link miniSysYParser#funcRParams}.
	 * @param ctx the parse tree
	 */
	void exitFuncRParams(miniSysYParser.FuncRParamsContext ctx);
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