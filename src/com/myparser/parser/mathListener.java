// Generated from C:/Users/benja/IdeaProjects/antlr_arithmetic/src\math.g4 by ANTLR 4.12.0
package com.myparser.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link mathParser}.
 */
public interface mathListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link mathParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(mathParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(mathParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathParser#prod}.
	 * @param ctx the parse tree
	 */
	void enterProd(mathParser.ProdContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathParser#prod}.
	 * @param ctx the parse tree
	 */
	void exitProd(mathParser.ProdContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(mathParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(mathParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathParser#log}.
	 * @param ctx the parse tree
	 */
	void enterLog(mathParser.LogContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathParser#log}.
	 * @param ctx the parse tree
	 */
	void exitLog(mathParser.LogContext ctx);
	/**
	 * Enter a parse tree produced by {@link mathParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(mathParser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link mathParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(mathParser.ExpContext ctx);
}