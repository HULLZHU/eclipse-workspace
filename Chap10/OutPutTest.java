
public class OutPutTest {

	public static void main(String[] args) {
		System.out.println("Hi, ABC, good.".matches("ABC"));
		System.out.println("Hi, ABC, good.".matches(".*ABC.*"));
		System.out.println("A,B;C".replaceAll(".;", "#"));
		System.out.println("A,B;c".replaceAll("[,;]", "#"));
		String []tokens = "A,B;C".split("[,;]");
		for ( int i = 0; i < tokens.length ; i ++ )
			System.out.print(tokens[i]+" ");
		String s = "Hi, Good Morning";
		System.out.println(m(s));
		
		StringBuffer x = new StringBuffer("Hello");
		x.append("Hello.");
		

	}
	
	public static int m (String s) {
		int count = 0; 
		for ( int i = 0; i < s.length() ; i ++ ) {
			if ( Character.isUpperCase(s.charAt(i)))
				count ++ ;
		}
		return count;
	}

}
