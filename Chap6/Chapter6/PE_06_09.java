package Chapter6;
import java.util.*;
public class PE_06_09 {

	public static void main(String[] args) {
		System.out.println("Please input the starting feet and the starting meters");
		Scanner input = new Scanner(System.in);
		double feet = input.nextDouble();
		double meter = input.nextDouble();
		System.out.println("Please input how many lines do you want to have");
		int numOfLine = input.nextInt();
		printTitle();
		printBody(feet, meter, numOfLine);
	}
	
	public static void printTitle() {
		System.out.println("Feet       Meter    |    Meters       Feet");
	}
	
	public static void printBody(double startingFeet, double startingMeter, int numOfLines) {
		int count = 1;
		while ( count<= numOfLines) {
		System.out.printf("%.1f",startingFeet);
		System.out.printf("%13.3f",startingFeet*0.305);
		System.out.print("    |    ");
		System.out.printf("%.1f",startingMeter);
		System.out.print("    ");
		System.out.printf("%.3f\n", startingMeter*3.279);
		startingFeet ++;
		startingMeter+=5;
		count ++;
		}
		
		
	}

}
