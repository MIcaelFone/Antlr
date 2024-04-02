// Generated from Expr.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(ExprParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(ExprParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#operador}.
	 * @param ctx the parse tree
	 */
	void enterOperador(ExprParser.OperadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#operador}.
	 * @param ctx the parse tree
	 */
	void exitOperador(ExprParser.OperadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#numero_real}.
	 * @param ctx the parse tree
	 */
	void enterNumero_real(ExprParser.Numero_realContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#numero_real}.
	 * @param ctx the parse tree
	 */
	void exitNumero_real(ExprParser.Numero_realContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#numero_inteiro_semzero}.
	 * @param ctx the parse tree
	 */
	void enterNumero_inteiro_semzero(ExprParser.Numero_inteiro_semzeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#numero_inteiro_semzero}.
	 * @param ctx the parse tree
	 */
	void exitNumero_inteiro_semzero(ExprParser.Numero_inteiro_semzeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#numero_inteiro}.
	 * @param ctx the parse tree
	 */
	void enterNumero_inteiro(ExprParser.Numero_inteiroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#numero_inteiro}.
	 * @param ctx the parse tree
	 */
	void exitNumero_inteiro(ExprParser.Numero_inteiroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#numero_zero}.
	 * @param ctx the parse tree
	 */
	void enterNumero_zero(ExprParser.Numero_zeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#numero_zero}.
	 * @param ctx the parse tree
	 */
	void exitNumero_zero(ExprParser.Numero_zeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#numero_float_semzero}.
	 * @param ctx the parse tree
	 */
	void enterNumero_float_semzero(ExprParser.Numero_float_semzeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#numero_float_semzero}.
	 * @param ctx the parse tree
	 */
	void exitNumero_float_semzero(ExprParser.Numero_float_semzeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#numero_float}.
	 * @param ctx the parse tree
	 */
	void enterNumero_float(ExprParser.Numero_floatContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#numero_float}.
	 * @param ctx the parse tree
	 */
	void exitNumero_float(ExprParser.Numero_floatContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#numero_inteiro_positivo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_inteiro_positivo(ExprParser.Numero_inteiro_positivoContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#numero_inteiro_positivo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_inteiro_positivo(ExprParser.Numero_inteiro_positivoContext ctx);
}