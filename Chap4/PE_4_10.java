import java.util.Scanner;

public class PE_4_10 {

	public static void main(String[] args) {
		
		int day = 0;
		System.out.println("Now here are five matrix");
		
		String m1 = "1 3 5 7\n"+"9 11 13 15\n"+"17 19 21 23\n"+"25 27 29 31\n";
		
		String m2 = "2 3 6 7\n"+"10 11 14 15\n"+"18 19 22 23\n"+"26 27 30 31\n";
		
		String m3 = "4 5 6 7\n"+"12 13 14 15\n"+"20 21 22 23\n"+"28 29 30 31\n";
		
		String m4 = "8 9 10 11\n"+"12 13 14 15\n"+"24 25 26 27\n"+"28 29 30 31\n";
		
		String m5 = " 16 17 18 19\n"+"20 21 22 23\n"+"24 25 26 27\n"+"28 29 30 31\n";
		
		
		//////////////////////////////////////////////////////
		System.out.println("Are your birthday in m1?");
		
		System.out.println(m1);
		
		System.out.println("Enter Y for Yes, Enter N for No");
		
		Scanner input = new Scanner(System.in);
		
		String answer1 = input.nextLine();
		
		if (answer1.charAt(0)==(int)'Y');
		{
			day += 1;
		}
		//////////////////////////////////////////////////////
		System.out.println("Are your birthday in m2?");
		
		System.out.println(m2);
		
		System.out.println("Enter Y for Yes, Enter N for No");
		
		String answer2 = input.nextLine();
		
		if(answer2.charAt(0)=='Y')
		{
			day +=2;
		}
		/////////////////////////////////////////////////////////
		System.out.println("Are your birthday in m3?");
		
		System.out.println(m3);
		
		System.out.println("Enter Y for yes, N for no");
		
		String answer3 = input.nextLine();
		
		if(answer3.charAt(0)=='Y')
		{
			day +=4;
		}
		
		//////////////////////////////////////////////////////////
		
		System.out.println("Are your birthday in m4?");
		
		System.out.println(m4);
		
		System.out.println("Enter Y for yes, N for no");
		
		String answer4 = input.nextLine();
		
		if(answer4.charAt(0)=='Y')
		{
			day+=8;
		}
		
		///////////////////////////////////////////////////////
		
		System.out.println("Are your birthday in m5?");
		
		System.out.println(m5);
		
		System.out.println("Y for yes, N for No");
		
		String answer5 = input.nextLine();
		
		if (answer5.charAt(0)=='Y')
		{
			day +=16;
		}
		
		System.out.println("Your birthday should be "+day);
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
