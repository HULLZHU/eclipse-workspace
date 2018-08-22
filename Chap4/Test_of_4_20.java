
public class Test_of_4_20 {

	public static void main(String[] args) {
		
		String  s1 = "Welcome  ";
		
		String  s2 = "welcome";
		
		boolean j1 = (s1.equals(s2));
		
		boolean j2 = (s1.equalsIgnoreCase(s2));
		
		int j3 = s1.compareTo(s2);
		
		int j4 = s1.compareToIgnoreCase(s2);
		
		boolean j5 = s2.startsWith("AAA");
		
		boolean j6 = s1.startsWith("BBB");
		
		int length_of_s1 = s1.length();
		
		char first_char_of_s1 = s1.charAt(0);
		
		String s3 = s1.concat(s2);
		
		String s4 = s1.substring(1);
		
		String s5 = s1.substring(0, 4);
		
		String s6 = s1.toLowerCase();
		
		String s7 = s1.toUpperCase();
		
		String s8 = s1.trim();
		
		int first_e = s1.indexOf("e");
		
		int last_abc= s2.lastIndexOf("abc");
          		
		// TODO Auto-generated method stub

	}

}