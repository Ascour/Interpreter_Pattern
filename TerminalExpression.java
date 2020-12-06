package interpreter_design_pattern;

public class TerminalExpression implements Expression {
	
	String data;
	
	public TerminalExpression(String data) {
		this.data=data;
	}
	
	@Override
	public boolean interpret(String contexte) {
		   
	      if(contexte.contains(data)){
	         return true;
	      }
	      return false;
	}

}
