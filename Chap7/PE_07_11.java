import java.util.*;
public class PE_07_11 {

	public static void main(String[] args) {
		System.out.println("Please input 10 numbers");
		Scanner input = new Scanner(System.in);
		double [] array = new double [ 10 ];
		for ( int i = 0; i<10;i++) {
			array[i]= input.nextDouble();
		}
		
		double deviation = deviation(array);
		System.out.println("The deviation is ");
		System.out.printf("%.3f",deviation);
		// TODO Auto-generated method stub

	}

	private static double deviation(double[] array) {
		double mean = mean(array);
		double deviation = 0;
		double sum = 0;
		for (int i = 0 ; i< 10 ; i ++) {
			sum = sum + (array[i]-mean)*(array[i]-mean);
		}
		deviation = Math.sqrt(sum/9);
		
		// TODO Auto-generated method stub
		return deviation;
	}

	private static double mean(double[] array) {
		double sum = 0;
		for ( int i = 0; i < 10; i++) {
			sum = sum +array[i];
		}
		
		double mean = sum / 10;
		// TODO Auto-generated method stub
		return mean;
		
	}

}
