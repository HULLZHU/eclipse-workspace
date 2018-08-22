import java.util.*;
public class PE_5_32 {

	public static void main(String[] args) {
		System.out.println("Please now input a two-digit number");
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		int ten_digit_lottery = 1 + (int)(10*Math.random());
		int unit_digit_lottery = (int)(10*Math.random());
		//avoid equality between two lottery digit
		while ( ten_digit_lottery == unit_digit_lottery) {
			ten_digit_lottery = 1 + (int)(10*Math.random());
			unit_digit_lottery = (int)(10*Math.random());
		}
		//prompt error input of guess
		while ( guess > 99|| guess < 10)
		{
			System.out.println("Please input a valid answer");
		    guess = input.nextInt();
		}
		
		int guess_ten_digit = guess/10;
		int guess_unit_digit = guess- 10*guess_ten_digit;
		
		if ( guess_ten_digit == ten_digit_lottery && guess_unit_digit == unit_digit_lottery   ) {
			System.out.println("You win 10000 dollar");
		}
		else if (guess_ten_digit == unit_digit_lottery && guess_unit_digit == ten_digit_lottery) {
			System.out.println("You win 3000 dollar");
		}
		else if ( guess_ten_digit != ten_digit_lottery && guess_ten_digit != ten_digit_lottery && guess_unit_digit!=ten_digit_lottery&&guess_unit_digit!=unit_digit_lottery) {
		    System.out.print("You win nothing");
		}
		else {
			System.out.println("You win 1000 dollar");
		}
		
		System.out.println("Lottery: "+ ten_digit_lottery+unit_digit_lottery);
		
		// TODO Auto-generated method stub

	}

}
