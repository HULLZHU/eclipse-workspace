import java.util.Scanner;

public class Test_of_String_Method {

	public static void main(String[] args) {
		
		String message = "Hello, ChiChi jun";
		
		System.out.print(" The length of message is " + message.length());
		
		System.out.println("The length of message is" + "Hello, Chichi Jun".length());
		
		System.out.println(" The third character of the message is " + message.charAt(2));
		
		System.out.println("Input the family members");
		
		Scanner input = new Scanner(System.in);
		
		String s1 = input.next();
		
		String s2 = input.next();
		
		String s3 = input.next();
		
		System.out.println(" The members in your family are" + s1+" " + s2 +" and "+s3);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
