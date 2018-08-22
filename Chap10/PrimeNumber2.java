

public class PrimeNumber2 {
	public static void main(String[] args) {
		for ( int number = 2; number <=120; number ++ ) {
		System.out.print(number+ " 's factors:" );
		StackOfIntergers myStack = new StackOfIntergers(); 
        //push prime numbers into stack
		for ( int divisor = 2,temp = number; divisor <= number;   ) {
			while( temp % divisor == 0) {
				temp = temp / divisor;
				myStack.push(divisor);
				}
			divisor ++ ;
		}
		
		for ( int i = 0 ; i <= myStack.getElements().length; i ++ ) {
			int temp = myStack.pop();
			if ( temp!=-1)
			System.out.print("  " + temp+ " ");
			else
				break;
		}
		System.out.println("");
		}
	
	

}
}
