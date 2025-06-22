package kadai_028;

public class JyankenExec_Chapter28 {
	
	public static void main(String[] args) {
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		
		String mychoice = jyanken.getMyChoice();
		String random = jyanken.getRandom();
		
		jyanken.playGame(mychoice, random);
		
		
	}

}
