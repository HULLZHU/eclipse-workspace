
public class Palindromes {
private String originalStr;
private StringBuffer tempStr;

public Palindromes() {
	System.out.println("Please enter a valid string.");
}

public Palindromes(String newString) {
	originalStr = newString;
}

public boolean isPalindromes() {
	tempStr = new StringBuffer(originalStr);
	String s1 = filter(tempStr);
	String s2 = reverse(s1);
	if ( s1.equals(s2))
		return true;
	return false;
	
}

private String reverse(String s1) {
	StringBuffer temp = new StringBuffer(s1);
	temp.reverse();
	return temp.toString();
}

private  static String filter(StringBuffer tempStr) {
	StringBuffer newTempStr= new StringBuffer();
	for(int i = 0; i < tempStr.length(); i ++ ) {
		if (Character.isLetterOrDigit(tempStr.charAt(i)))
			newTempStr.append(tempStr.charAt(i));
	}
	return newTempStr.toString();
}

}
