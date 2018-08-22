import java.util.*;
public class PE_5_47 {

	public static void main(String[] args) {
		System.out.println("Please input a series of IBSN-13");
		Scanner input = new Scanner(System.in);
		String S1 = input.nextLine();
		int i = 1;
		int digit = 0;
		int check_temp=0;
		if (S1.length()!=12)
			System.out.println("Wrong input");
		while ( i<=12 ) {
			char num_ = S1.charAt(i-1);
			digit = num_-'0';
			if ( i%2 ==0) {
				check_temp =check_temp+3*digit; 
			}
			else {
				check_temp = check_temp+ digit;
			}
			i++;
		}
		int check_sum = 10 - (check_temp%10);
		System.out.println("The check sum is "+ check_sum);
		
		if ( check_sum == 10)
			check_sum= 0;
		System.out.println("The number is "+S1+check_sum);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
