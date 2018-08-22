import java.util.*;

public class PE_4_12 {

	public static void main(String[] args) {
		
		System.out.println("Please input a hex number");
		
		Scanner input = new Scanner(System.in);
		
		String s1 = input.nextLine();
		
		char t_character = s1.charAt(0);
		
		int t_num = (int)t_character;
		
		int t_num2 = 0;
		if (t_num<=57 && t_num>=48)
		{
			t_num2 = t_num - 48;
		}
		
		if (t_num>=65 && t_num<=70)
		{
			t_num2 = t_num - 55;
		}
		
		switch (t_num2)
		{
		case 0 : System.out.println("The number in binary is 0000");
		break;
		
		case 1:  System.out.println("The number in bianry is 0001" );
		break;
		
		case 2: System.out.println("The number in binary is 0010");
		break;
		
		case 3: System.out.println("The number in binary is 0011");
		break;
		
		case 4 : System.out.println("The number in binary is 0100");
		break;
		
		case 5 :System.out.println("The number in binary is 0101");
		break;
		
		case 6: System.out.println("The number in binary is 0110");
		break;
		
		case 7 :System.out.println("The number in binary is 0111");
		break;
		
		case 8 :System.out.println("The number in binary is 1000");
		break;
		
		case 9 : System.out.println("The number in binary is 1001");
		break;
		
		case 10 : System.out.println("The number in binary is 1010");
		break;
		
		case 11: System.out.println("The number in binary is 1011");
		break;
		
		case 12 : System.out.println("The number in binary is 1100");
		break;
		
		case 13 : System.out.println("The number in binary is 1101");
		break;
		
		case 14: System.out.println("The number in binary is 1110");
		break;
		
		case 15 : System.out.println("The number in binary is 1111");
		
		}
		
		
		
		
		
		
		// TODO Auto-generated method stub

	}

}
