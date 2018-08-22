package Chapter6;

import java.util.Scanner;

public class demo5 {

	public static void main(String[] args) {
		System.out.println("Please input an integer ");
		Scanner input = new Scanner(System.in);
		int i = input.nextInt();
		
	
			int temp = i +1;
			while ( temp % 2 ==0 ) {
				temp = temp /2;
			}
			
			if (temp == 1)
				System.out.println("True");
			else
				System.out.println("False");
		// TODO Auto-generated method stub

	}

}
