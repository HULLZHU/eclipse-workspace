package Chapter6;
import java.util.*;
public class PE_06_35 {

	public static void main(String[] args) {
		System.out.println("Please input the length of pentagon.");
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		System.out.println("The area is :" + computeAreaOfPentagon(length));
		// 
	}

	private static double computeAreaOfPentagon(int length) {
		double area = 0;
		area = 5*length*length/(4*Math.tan(Math.PI/5));
		return area;
	}

}
