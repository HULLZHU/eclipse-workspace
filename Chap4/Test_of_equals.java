import java.util.*;

public class Test_of_equals {

	public static void main(String[] args) {
		
		System.out.println("Please input 2 sentences");
		
		Scanner input = new Scanner(System.in);
		
		String s1 = input.nextLine();
		
		String s2 = input.nextLine();
		
		System.out.println(" String1 equals to String2 in content is " + s1.equals(s2));
		
		System.out.println("String1 is contained in String2 is "+ s2.contains(s1));
        
		System.out.println("String 1 ends with a is " +s1.endsWith("a"));
		
		
	}

}
