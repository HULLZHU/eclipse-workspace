
public class TestMyString {

	public static void main(String[] args) {
		char[] chars = {'a','b','c'};
		MyString s1 = new MyString(chars);
		MyString s2 = new MyString(new char[] {'a','b','c'});
		System.out.println(s1.equals(s2));
		System.out.println(s1.charAt(0));
		

	}

}
