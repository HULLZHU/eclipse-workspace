
public class MyStringBuilder {
	private String s1;
	
	public MyStringBuilder(String newS) {
		s1 = newS;
	}
	
	public MyStringBuilder ( char[] chars) {
		String s1 = "";
		for ( int i = 0; i<chars.length ; i ++ )
			s1 += chars[i];
	}
	
	private String getOriginalString() {
		return this.s1;
	}
	
	
	public MyStringBuilder append( MyStringBuilder newS) {
		String temp = s1 + newS.getOriginalString();
		MyStringBuilder returnedString = new MyStringBuilder(temp);
		return returnedString;
	}
	
	public MyStringBuilder append( int i ) {
		String temp = this.getOriginalString();
		temp += (i+"");
		MyStringBuilder returnedString = new MyStringBuilder(temp);
		return returnedString;
	}
	
	public int length() {
		return this.length();
	}
	
	public char charAt(int index) {
		return this.s1.charAt(index);
	}
	
	public MyStringBuilder toLowerCase() {
		this.toLowerCase();
		MyStringBuilder returnedString = new MyStringBuilder(this.s1);
		return returnedString;
	}
	
	public MyStringBuilder subString(int begin, int end) {
		int length = end - begin + 1;
		String tempS = "";
		for ( int i = 0; i < length ; i ++ ) {
			tempS += this.charAt(i+begin);
		}
		
		return new MyStringBuilder(tempS);
	}
	
	public String toString() {
		return s1;
	}
	
	public MyStringBuilder insert(MyStringBuilder newS, int offset) {
		String tail = s1.substring(offset, newS.length()-offset);
		String head = s1.substring(0,offset-1);
		String tempS = head + newS.getOriginalString()+tail;
		return new MyStringBuilder(tempS);
	}
	
	public MyStringBuilder reverse() {
		int length = s1.length();
		String newS = "";
		for ( int i = length-1; i >=0 ; i -- ) {
			newS = newS+s1.charAt(i);
		}
		return new MyStringBuilder(newS);
	}

}
