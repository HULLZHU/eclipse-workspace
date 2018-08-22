import java.util.*;
public class PE_07_08 {

	public static void main(String[] args) {
		System.out.println("Please input 10 numbers");
		Scanner input = new Scanner(System.in);
		double num = 0;
		int[] array1 = new int[10];
		double[] array2 = new double[10];
		for ( int i = 0; i<10;i++) {
			num = input.nextInt();
			array1[i] = (int)(num);
			array2[i]=num;
		}
		System.out.println("¢Ù£º"+average(array1));
		System.out.println("¢Ú£º"+average(array2));
		// TODO Auto-generated method stub

	}

	private static int average(int[] array1) {
		int sum = 0;
		for ( int i = 0; i<10;i++)
			sum = sum +array1[i];
		return sum/10;
			
		// TODO Auto-generated method stub
		
	}

	private static double average(double[] array2) {
		double sum = 0;
		for ( int i =0;i<10;i++)
			sum = sum +array2[i];
		return sum/10;
		// TODO Auto-generated method stub
		
	}

}
