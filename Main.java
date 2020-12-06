package interpreter_design_pattern;

public class Main {
	
	//r�gle : poulet ou boeuf sont bons 
	public static Expression getBon() {
		Expression poulet = new TerminalExpression("Poulet");
		Expression boeuf = new TerminalExpression("boeuf");
		return new OrExpression(poulet,boeuf);
	}
	
	//r�gle : caf� avec grains de qualit� 
		public static Expression getQualite() {
			Expression cafe = new TerminalExpression("caf�");
			Expression bresilien = new TerminalExpression("br�silien");
			return new AndExpression(cafe,bresilien);
		}

	public static void main(String[] args) {
		Expression estBon = getBon();
		Expression deQualite = getQualite();
		
		System.out.println("poisson est bon "+ estBon.interpret("poisson"));
		System.out.println("cafe br�silien est de qualit� "+ deQualite.interpret("caf� br�silien"));

	}

}
