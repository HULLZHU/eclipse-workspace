package demo;

import java.util.*;

public class GameLotteryThreeDigits {

	public static void main(String[] args) {
		
		System.out.println("Please input a three-digits number");
		
		Scanner input = new Scanner(System.in);
		
		int input_num = input.nextInt();
		
		int hundred_digit = (int)(input_num / 100.0);
		
		int unit_digit = input_num%10;
		
		int ten_digit = input_num - 100* hundred_digit - unit_digit;
		
		int lottery_num = (int)(1000 * Math.random());
		
        int hundred_digit_L = (int)(lottery_num / 100.0);
		
		int unit_digit_L = (int)(lottery_num % 10);
		
		int ten_digit_L = lottery_num - 100 * hundred_digit_L - unit_digit_L;
		
		if (lottery_num<100)
		{
			lottery_num = lottery_num*10;
		}
		
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		if ( unit_digit == unit_digit_L && ten_digit == ten_digit_L && hundred_digit == hundred_digit_L)
			
		{
			System.out.println("You win the biggest reward, you will get $10000");
			
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		if ((unit_digit == unit_digit_L) && (ten_digit_L == hundred_digit) && (hundred_digit_L == ten_digit))
		{
			System.out.println("You win the second reward, you will get $3000");
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		if((ten_digit_L == ten_digit) && (hundred_digit_L == unit_digit)&&(unit_digit_L == hundred_digit))
		{
			System.out.println("You win the second reward, you will get $3000");
		}
		/////////////////////////////////////////////////////////////////////////////////////////////////////
		
		if((hundred_digit_L  == hundred_digit)&&( ten_digit_L == unit_digit)&&( unit_digit_L == ten_digit))
				{
			System.out.println("You win the second reward, you will get $3000");
				}
		////////////////////////////////////////////////////////////////////////////////////////////////////
		
		else if (!((unit_digit_L != unit_digit && unit_digit_L != ten_digit && unit_digit_L != hundred_digit) && (ten_digit_L != ten_digit&&ten_digit_L != hundred_digit) && hundred_digit_L !=hundred_digit ))
		
		{
			System.out.println("You win the third reward, you will get $ 1000");
		}
		else
		{
			System.out.println(" You lost");
		}
		System.out.println("The lottery number should be"+lottery_num);
	}

}
