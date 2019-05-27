// Generated from D:/CHRIS/Escuela/Semestre6/Compiladores/compiladores_proyectofinal/src\astral.g4 by ANTLR 4.7.2


import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.astral.interprete.ast.*;


import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link astralParser}.
 */
public interface astralListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link astralParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(astralParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link astralParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(astralParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link astralParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void enterSentencias(astralParser.SentenciasContext ctx);
	/**
	 * Exit a parse tree produced by {@link astralParser#sentencias}.
	 * @param ctx the parse tree
	 */
	void exitSentencias(astralParser.SentenciasContext ctx);
	/**
	 * Enter a parse tree produced by {@link astralParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(astralParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link astralParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(astralParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link astralParser#variable_declaracion}.
	 * @param ctx the parse tree
	 */
	void enterVariable_declaracion(astralParser.Variable_declaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link astralParser#variable_declaracion}.
	 * @param ctx the parse tree
	 */
	void exitVariable_declaracion(astralParser.Variable_declaracionContext ctx);
	/**
	 * Enter a parse tree produced by {@link astralParser#variable_asignacion}.
	 * @param ctx the parse tree
	 */
	void enterVariable_asignacion(astralParser.Variable_asignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link astralParser#variable_asignacion}.
	 * @param ctx the parse tree
	 */
	void exitVariable_asignacion(astralParser.Variable_asignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link astralParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void enterComparacion(astralParser.ComparacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link astralParser#comparacion}.
	 * @param ctx the parse tree
	 */
	void exitComparacion(astralParser.ComparacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link astralParser#ciclos}.
	 * @param ctx the parse tree
	 */
	void enterCiclos(astralParser.CiclosContext ctx);
	/**
	 * Exit a parse tree produced by {@link astralParser#ciclos}.
	 * @param ctx the parse tree
	 */
	void exitCiclos(astralParser.CiclosContext ctx);
	/**
	 * Enter a parse tree produced by {@link astralParser#impresion}.
	 * @param ctx the parse tree
	 */
	void enterImpresion(astralParser.ImpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link astralParser#impresion}.
	 * @param ctx the parse tree
	 */
	void exitImpresion(astralParser.ImpresionContext ctx);
}