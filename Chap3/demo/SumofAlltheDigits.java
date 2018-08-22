package demo;

import java.util.Scanner;

public class SumofAlltheDigits {

	public static void main(String[] args) {
		
		System.out.println("Input a integer between 0 and 9999 ");
		
		Scanner input = new Scanner(System.in);
		
		int integer = input.nextInt();
		
		int thousandDigit = integer / 1000 ;
		
		int hundredDigit = ( integer/100 ) - thousandDigit*10 ; 
		
		int tenDigit = ( integer /10 )- thousandDigit*100 - hundredDigit*10 ;
		
		int unitDigit = integer - thousandDigit * 1000 -hundredDigit * 100 - tenDigit*10;
		
		int sumofDigit = thousandDigit + hundredDigit + tenDigit + unitDigit;
		
		System.out.println("The sum of digit is"+sumofDigit);
		
	}

}
