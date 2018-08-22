package Chapter6;

public class Listing_6_10 {

	public static char getRandomCharacter( char ch1, char ch2) {
		char RandomCharacter = (char)(ch1 + Math.random()*(ch2 - ch1 +1));
		return RandomCharacter;
	}
	
	public static char getRandomLowerCaseLetter() {
		char RandomLowerCaseLetter = (char)('a'+Math.random()*('z'-'a' +1));
		return RandomLowerCaseLetter;
	}
	
	public static char getRandomUpperCaseLetter() {
		char RandomUpperCaseLetter = (char)('A'+ Math.random()*('Z'-'A'+1));
		return RandomUpperCaseLetter;
	}
	
	public static char getRandomDigitCharacter() {
		char RandomDigitCharacter= (char)('1'+Math.random()*('9'-'1'+1));
		return RandomDigitCharacter;
	}
	
	public static char getRandomCharacter() {
		char RandomCharacter = getRandomCharacter( '\u0000','\uffff');
		return RandomCharacter;
	}

}
