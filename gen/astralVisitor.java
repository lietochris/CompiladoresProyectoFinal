// Generated from D:/CHRIS/Escuela/Semestre6/Compiladores/compiladores_proyectofinal/src\astral.g4 by ANTLR 4.7.2


import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.astral.interprete.ast.*;


import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link astralParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface astralVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link astralParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(astralParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link astralParser#sentencias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencias(astralParser.SentenciasContext ctx);
	/**
	 * Visit a parse tree produced by {@link astralParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(astralParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link astralParser#variable_declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_declaracion(astralParser.Variable_declaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link astralParser#variable_asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable_asignacion(astralParser.Variable_asignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link astralParser#comparacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparacion(astralParser.ComparacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link astralParser#ciclos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclos(astralParser.CiclosContext ctx);
	/**
	 * Visit a parse tree produced by {@link astralParser#impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion(astralParser.ImpresionContext ctx);
}