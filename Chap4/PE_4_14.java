import java.util.Scanner;

public class PE_4_14 {

	public static void main(String[] args) {
		
		System.out.println("Please input the letter grade.");
		
		Scanner input = new Scanner(System.in);
		
		String s1 = input.nextLine();
		
		int grade = (int)(s1.charAt(0));
		
		if ( grade<65 || grade > 69)
		{
			System.out.println("Please input a valid grade");
			
		}
		
		else
		{
			switch (grade)
			{
			case 65 : System.out.println("Your numeric grade is 4");
			break;
			
			case 66 :System.out.println("Your numeric grade is 3");
			break;
			
			case 67 : System.out.println("Your numeric grade is 2");
			break;
			
			case 68 : System.out.println("Your numeric grade is 1");
			break;
			
			case 69 : System.out.println("Your numeric grade is 0");
			break;
			
			}
		}
		// TODO Auto-generated method stub

	}

}
