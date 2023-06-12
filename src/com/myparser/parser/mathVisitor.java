// Generated from C:/Users/benja/IdeaProjects/antlr_arithmetic/src\math.g4 by ANTLR 4.12.0
package com.myparser.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link mathParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface mathVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link mathParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(mathParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathParser#prod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProd(mathParser.ProdContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathParser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(mathParser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathParser#log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog(mathParser.LogContext ctx);
	/**
	 * Visit a parse tree produced by {@link mathParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(mathParser.ExpContext ctx);
}