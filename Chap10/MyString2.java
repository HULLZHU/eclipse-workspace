
public class MyString2 {
	//data field
	private String s;
	//constructor
	public MyString2( String s1) {
		s= s1;
	}
	public int compare(String s1) {
		return s.length()-s1.length();
	}
	public  MyString2 subString(int begin) {
		int length = s.length() - begin + 1;
		String tempS = "";
		for ( int i = 0; i <length ; i ++ ) {
			tempS += tempS + s.charAt(begin + i);
		}
		return new MyString2(tempS);
	}
	
	public MyString2 toUpperCase() {
		String tempS = "";
		for ( int i = 0; i <s.length(); i ++ ) {
			if ( s.charAt(i)<='z'&&s.charAt(i)>='a') {
				tempS = tempS + (char)(s.charAt(i)+'A'-'a');
			}
		}
		return new MyString2(tempS);
	}
	
	public char[] toChars() {
		char[] chars = new char[s.length()];
		for ( int i = 0; i < s.length() ; i ++ ) {
			chars[i] = s.charAt(i);
		}
		return chars;
	}
	
	public String getString() {
		return s;
	}
}
