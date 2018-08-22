import java.util.*;
public class PE_08_25 {

	public static void main(String[] args) {
		System.out.println("What is the size of matrix.");
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		double[][] matrix = new double[size][size];
		System.out.println("Please enter matrix.");
		for ( int i = 0; i < matrix.length; i++ ) {
			for ( int j = 0; j < matrix.length; j++ ) {
				matrix[i][j] = input.nextDouble();
			}
		}
		if ( isMarkovMatrix(matrix))
			System.out.println("It is a markov matrix.");
		else
			System.out.println("It is not a markov matrix.");
	}

	private static boolean isMarkovMatrix(double[][] matrix) {
	    double total = 0;
		for ( int i = 0; i < matrix.length; i++ ) {
			for ( int j = 0; j < matrix.length; j ++ ) {
				total += matrix[i][j];
			}
		}
		if (total==1)
			return true;
		return false;
	}

}
