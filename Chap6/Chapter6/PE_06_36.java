package Chapter6;
import java.util.*;
public class PE_06_36 {

	public static void main(String[] args) {
		System.out.println("Please input the number of sides and the length of each side.");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int s = input.nextInt();
		System.out.println("The area is : " + computeArea(n,s));
		// TODO Auto-generated method stub

	}

	private static double computeArea(int n, int s) {
		 double area = 0;
		 area = n*s*s/(4*Math.tan(Math.PI/n));
		 return area;
		
	}

}
