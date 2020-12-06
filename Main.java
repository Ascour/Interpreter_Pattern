package interpreter_design_pattern;

public class Main {
	
	//règle : poulet ou boeuf sont bons 
	public static Expression getBon() {
		Expression poulet = new TerminalExpression("Poulet");
		Expression boeuf = new TerminalExpression("boeuf");
		return new OrExpression(poulet,boeuf);
	}
	
	//règle : café avec grains de qualité 
		public static Expression getQualite() {
			Expression cafe = new TerminalExpression("café");
			Expression bresilien = new TerminalExpression("brésilien");
			return new AndExpression(cafe,bresilien);
		}

	public static void main(String[] args) {
		Expression estBon = getBon();
		Expression deQualite = getQualite();
		
		System.out.println("poisson est bon "+ estBon.interpret("poisson"));
		System.out.println("cafe brésilien est de qualité "+ deQualite.interpret("café brésilien"));

	}

}
