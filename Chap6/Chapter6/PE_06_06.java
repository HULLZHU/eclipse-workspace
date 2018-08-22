package Chapter6;
import java.util.*;
public class PE_06_06 {

	public static void main(String[] args) {
		System.out.println("Please input how many lines do you want to output");
		Scanner input = new Scanner(System.in);
		int numOfLines = input.nextInt();
		int countOfLine = 0;
		while ( countOfLine <= numOfLines) {
			printLine(countOfLine, numOfLines);
			countOfLine++;
		}
	}
	
	public static void printLine ( int countOfLine, int numOfLines ) {
		int i = 1;
		printSpace (countOfLine, numOfLines);
		while ( i<= countOfLine ) {
			System.out.printf(" "+(countOfLine+1- i));
			i++;
		}
		System.out.println();
	}
	
	public static void printSpace ( int countOfLine, int numOfLine) {
		int i = 0;
		while ( i < numOfLine - countOfLine) {
			System.out.print("  ");
			i++;
		}
		
	}

}
