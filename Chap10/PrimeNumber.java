import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		//PE_10_05
		//create a stack
		StackOfIntergers myStack = new StackOfIntergers(); 
        //push prime numbers into stack
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number.");
		int number = input.nextInt();
		for ( int divisor = 2; divisor <= number;   ) {
			while( number % divisor == 0) {
				number = number / divisor;
				myStack.push(divisor);
				}
			divisor ++ ;
		}
		
		for ( int i = 0 ; i <= myStack.getElements().length; i ++ ) {
			int temp = myStack.pop();
			if ( temp!=-1)
			System.out.print("  " + temp);
			else
				break;
	}
	
	

}
	}
