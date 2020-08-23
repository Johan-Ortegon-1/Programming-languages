// Generated from co\edu\javeriana\car\Car.g4 by ANTLR 4.5.1
package co.edu.javeriana.car;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CarParser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(CarParser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link CarParser#go}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGo(CarParser.GoContext ctx);
	/**
	 * Visit a parse tree produced by {@link CarParser#back}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBack(CarParser.BackContext ctx);
	/**
	 * Visit a parse tree produced by {@link CarParser#der}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDer(CarParser.DerContext ctx);
	/**
	 * Visit a parse tree produced by {@link CarParser#izq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIzq(CarParser.IzqContext ctx);
	/**
	 * Visit a parse tree produced by {@link CarParser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(CarParser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link CarParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(CarParser.NumeroContext ctx);
}