package Chapter6;
import java.util.Scanner;
public class PE_06_17 {

	public static void main(String[] args) {
		System.out.println("Please enter an integer");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		printMatrix(n);
	}
	
	public static void printMatrix(int n) {
		int countOfRow = 1;
		while ( countOfRow <=n ) {
			int countOfColumn = 1; 
		      while (countOfColumn <= n) {
		    	  System.out.printf("%d",(int)randomNum());
		    	  System.out.print("  ");
		    	  if (countOfColumn==n)
		    		  System.out.println();
		    	  countOfColumn ++;
			}
		      countOfRow ++;
		}
	}
	
	public static double randomNum() {
		return Math.round(Math.random());
	}

}
