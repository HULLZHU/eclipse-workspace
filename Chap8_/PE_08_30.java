import java.util.*;
public class PE_08_30 {

	public static void main(String[] args) {
		double[][] a = new double[2][2];
		double [] b = new double[2];
		readMatrix(a,b);
		if ( hasSolution(a)) {
			double x1 = (b[0]*a[1][1]-b[1]*a[0][1])/(a[0][0]*a[1][1]-a[0][1]*a[1][0]);
			double x2 =  (b[1]*a[0][0]-b[0]*a[1][0])/(a[0][0]*a[1][1]-a[0][1]*a[1][0]);
			System.out.println("The first solution is :" +x1);
			System.out.println("The second solution is :" + x2);
		}
		else
			System.out.println("This equation has no solution.");

	}

	private static boolean hasSolution(double[][] a) {
		if ( a[0][0]*a[1][1]-a[0][1]*a[1][0]!=0)
			return true;
		return false;
	}

	private static void readMatrix(double[][] a,double[]b) {
		Scanner input = new Scanner(System.in);
		for ( int i = 0; i < a.length; i++ ) {
			for ( int j = 0; j < a[i].length ; j ++ ) {
				System.out.println("Please enter a" + i + ":"+j);
				a[i][j] = input.nextInt();
			}
			System.out.println("Please enter the number for b"+i);
			b[i] = input.nextDouble();
		}
	}

}
