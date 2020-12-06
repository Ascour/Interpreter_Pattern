package interpreter_design_pattern;

public class AndExpression implements Expression {
	Expression expression1;
	Expression expression2;
	
	public AndExpression(Expression expression1, Expression expression2) {
		this.expression1=expression1;
		this.expression2=expression2;
	}
	
	@Override
	public boolean interpret(String contexte) {
		return (expression1.interpret(contexte))&&(expression2.interpret(contexte));
	}
}
