// Generated from Car.g4 by ANTLR 4.4
package co.edu.javeriana.car;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CarParser}.
 */
public interface CarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CarParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(@NotNull CarParser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(@NotNull CarParser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link CarParser#der}.
	 * @param ctx the parse tree
	 */
	void enterDer(@NotNull CarParser.DerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#der}.
	 * @param ctx the parse tree
	 */
	void exitDer(@NotNull CarParser.DerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CarParser#izq}.
	 * @param ctx the parse tree
	 */
	void enterIzq(@NotNull CarParser.IzqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#izq}.
	 * @param ctx the parse tree
	 */
	void exitIzq(@NotNull CarParser.IzqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CarParser#color}.
	 * @param ctx the parse tree
	 */
	void enterColor(@NotNull CarParser.ColorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#color}.
	 * @param ctx the parse tree
	 */
	void exitColor(@NotNull CarParser.ColorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CarParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(@NotNull CarParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(@NotNull CarParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link CarParser#go}.
	 * @param ctx the parse tree
	 */
	void enterGo(@NotNull CarParser.GoContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#go}.
	 * @param ctx the parse tree
	 */
	void exitGo(@NotNull CarParser.GoContext ctx);
	/**
	 * Enter a parse tree produced by {@link CarParser#back}.
	 * @param ctx the parse tree
	 */
	void enterBack(@NotNull CarParser.BackContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#back}.
	 * @param ctx the parse tree
	 */
	void exitBack(@NotNull CarParser.BackContext ctx);
	/**
	 * Enter a parse tree produced by {@link CarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull CarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull CarParser.ProgramContext ctx);
}