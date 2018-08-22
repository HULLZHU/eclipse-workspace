import java.util.*;
public class PE_5_51 {

	public static void main(String[] args) {
		System.out.println("Please input 2 strings");
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		String s2 = input.nextLine();
		int i = -1;
		
		while ( s1.charAt(i+1) == s2.charAt(i+1)) {
			i++;
		}
		if  (i<0)
			System.out.println("There is no common prefix");
		System.out.println(s1.substring(0, i+1));
		
		// TODO Auto-generated method stub

	}

}
