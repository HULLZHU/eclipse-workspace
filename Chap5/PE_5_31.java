import java.util.*;
public class PE_5_31 {

	public static void main(String[] args) {
		System.out.println("Please input an amount, the annual percentage yield and the number of months");
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		double yield = input.nextDouble();
		double numberOfMonth = input.nextDouble();
		
		int count = 0;
		while ( count < numberOfMonth) {
		amount = amount + amount * yield/1200;	
		count ++;
		System.out.print("After "+ numberOfMonth+" months, the CD is worth ");
		System.out.printf("%.2f ", amount);
		System.out.println("");
		}
		
		// TODO Auto-generated method stub

	}

}
