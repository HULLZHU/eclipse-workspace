package Chapter6;

public class PE_06_38 {

	public static void main(String[] args) {
		printUpperCaseCharacters();
		printLowerCaseCharacters();
	}
	
	public static void printUpperCaseCharacters() {
		int count = 0;
		while ( count < 100 ) {
			count++;
			generateUpperCaseCharacter();
			if (count%10 == 0)
				System.out.println("");
		}
		
	}

	private static void generateUpperCaseCharacter() {
		int randomNum = 65 + (int)(26*Math.random());
		char ch =  (char) randomNum;
		System.out.printf("  "+ch);
		
	}

	public static void printLowerCaseCharacters() {
		int count = 0;
		while ( count < 100 ) {
			count ++;
			generateLowerUpperCaseCharacter();
			if ( count % 10 == 0)
				System.out.println("");
		}
		
	}

	private static void generateLowerUpperCaseCharacter() {
		int randomNum = 97 + (int)(26*Math.random());
		char ch =  (char) randomNum;
		System.out.printf("  "+ch);
		
	}
}
