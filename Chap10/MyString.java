public class MyString {
	//data field
	private char [] myString;
	//constructor
	public MyString(char [] chars) {
		//MyString 类型 其实就是 chars类型
		myString = chars;
	}	
	public char charAt(int index) {
		return myString[index];
	}	
	public int length() {
		return myString.length;
	}	
	public MyString  subString(int begin, int end) {
		char[] temp = new char[end-begin+1];
		for ( int i = 0; i < temp.length ; i ++ ) {
			temp[i] = this.charAt(begin + i );
		}
		
		MyString tempObject = new MyString(temp);
		return tempObject;
	}	
	public void toLowerCase() {
		for ( int i = 0;  i< myString.length ; i++ ) {
			if (myString[i]>='a'&&myString[i]<='z') {
				myString[i] = (char) (myString[i]-32);
			}
		}
	}
	
	public boolean equals(MyString s1) {
		if ( s1.length() == this.length()) {
			for ( int i = 0; i < this.length(); i ++) {
				if ( s1.charAt(i)!= this.charAt(i)){
						return false;
			}			
		}
			return true;
	}
		return false;

}
	
	
}