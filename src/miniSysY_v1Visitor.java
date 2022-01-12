// Generated from C:/Users/Best Selina/Desktop/compile/src\miniSysY_v1.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link miniSysY_v1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface miniSysY_v1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link miniSysY_v1Parser#compUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompUnit(miniSysY_v1Parser.CompUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysY_v1Parser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(miniSysY_v1Parser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysY_v1Parser#funcType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncType(miniSysY_v1Parser.FuncTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysY_v1Parser#ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdent(miniSysY_v1Parser.IdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysY_v1Parser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(miniSysY_v1Parser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysY_v1Parser#stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStmt(miniSysY_v1Parser.StmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link miniSysY_v1Parser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(miniSysY_v1Parser.NumberContext ctx);
}