import java.util.Scanner;

public class PE_4_22 {

	public static void main(String[] args) {
		
		System.out.println("Now input 2 strings");
		
		Scanner input = new Scanner(System.in);
		
		String s1 = input.nextLine();
		
		String s2 = input.nextLine();
		
		int occurrence = s1.indexOf(s2);
		
		if (occurrence == -1)
		{
			System.out.println("s2 is not substring of s1");
		}
		
		else 
		{
			System.out.println("s2 is the substring of s1");
		}
		// TODO Auto-generated method stub

	}

}
