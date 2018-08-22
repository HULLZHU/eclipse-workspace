
public class Exercise_of_4_16 {

	public static void main(String[] args) {
		
		System.out.println(" This test is on the paper 137 of the book");
		
		String s1 = "Welcome to Java";
		
		String s2 = "programming is fun";
		
		String s3 = "Welcome to Java";

		
		System.out.println("The length of s1, s2 and s3 is" + s1.length()+ "and " + s2.length() + "a nd " + s3.length() );
		////////////////////////////////
		System.out.println("\"s1 == s3\" is " + s1==s3);
		////////////////////////////////
		System.out.println("\"s2==3\" is "+ s2==s3);
		//////////////////////////////////
		System.out.println("\"s1.equals(s2)\" is " + s1.equals(s2));	
		/////////////////////////////////////    
		System.out.println("\"s1.equals(s3)\" is " + s1.equals(s3));
		///////////////////////////////////
		System.out.println("\"s1.compareTo(s2)\" is " + s1.compareTo(s2));
		///////////////////////////////////
		System.out.println("\"s2.compareTo(s3)\" is " + s2.compareTo(s3));
		//////////////////////////////////
		System.out.println("\"s2.compareTo(s2)\" is " + s2.compareTo(s2));
		//////////////////////////////////
		System.out.println("s1.charAt(0) is"+ s1.charAt(0));
		////////////////////////////////////
		System.out.println("s1.indexOf('j') is " + s1.indexOf('j'));
		////////////////////////////////////
		System.out.println("s1.indexOf('to') is " + s1.indexOf("to"));
		////////////////////////////////////
		System.out.println("s1.lastIndexOf('a') is"+ s1.indexOf("a"));
		////////////////////////////////////
		System.out.println("s1.lastIndexOf('0',15) is "+ s1.lastIndexOf("0",14));
		///////////////////////////////////
		System.out.println("s1.length() is" + s1.length());
		///////////////////////////////////
		System.out.println("s1.substring(5,11) is " + s1.substring(5,11));
		//////////////////////////////////////
		System.out.println("s1.startsWith(\"Well\") is " + s1.startsWith("Well"));
		/////////////////////////////////////////
		System.out.println("s1.endsWith(\"Java\") is " + s1.endsWith("Java"));
		/////////////////////////////////////////
		System.out.println(("The lower case of s1 is" + s1.toLowerCase()));
		//////////////////////////////////////
		System.out.println( "The upper case of s2 is" + s2.toUpperCase());
		//////////////////////////////////////////
		System.out.println( "s1 + s2 = " + s1.concat(s2));
		/////////////////////////////////////////
		System.out.println( " if s2 contains s2 ? " + s1.contains(s2));
		////////////////////////////////////////
		System.out.println( "space elimination of  \t wel \t is " + ("\t wel \t").trim() );
		
		
		
		
	

	}

}
