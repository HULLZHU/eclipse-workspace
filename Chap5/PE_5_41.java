import java.util.*;
public class PE_5_41 {

	public static void main(String[] args) {
		System.out.println("Please input integers, 0 is end signal");
		Scanner input = new Scanner(System.in);
		int count = 0;
		int num = input.nextInt();
		int max = 0;
		
		while ( num != 0) {
			if ( num > max )
			{
				max = num;
				count = 1;
			}
			else if ( num == max) 
				count ++;
			System.out.println(num);
			num = input.nextInt();
		}
		System.out.println("The max num is "+ max);
		System.out.println("The occurrence number of max number "+ count );
	}


}
