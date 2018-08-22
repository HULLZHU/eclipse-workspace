import java.util.*;
public class PE_5_37 {

	public static void main(String[] args) {
		
		System.out.println("Please input an decimal integer");
		Scanner input = new Scanner(System.in);
		int quotient = input.nextInt();
		int remainder = 0;
		String binary="";
		
		while ( quotient != 0 ) {
			remainder = quotient % 2;
			quotient = quotient/2;
			binary = remainder + binary;	
		}
		System.out.print(binary);
		
		

		
	   
	   

		
	}
}
