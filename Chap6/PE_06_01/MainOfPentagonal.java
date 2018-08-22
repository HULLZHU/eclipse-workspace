package PE_06_01;
import java.util.*;
public class MainOfPentagonal {

	public static void main(String[] args) {
		System.out.println("Please input the total number of pentagonal number and"
				+ " number perline" );
		Scanner input = new Scanner(System.in);
		
		int i = input.nextInt();
		int j = input.nextInt();
		printPentagonalNumber.printPentagonalNumber( i,j );
		
		// TODO Auto-generated method stub

	}

}
