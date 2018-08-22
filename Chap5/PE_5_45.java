import java.util.*;
public class PE_5_45 {

	public static void main(String[] args) {
		System.out.println("Please input a series of number");
		Scanner input = new Scanner(System.in);
		
		double sum = 0;
		
		double sum_of_squares = 0;
		
		double num = 0;
		
		int count =0;
		
		while (count < 10) {
			num = input.nextDouble();
			sum = sum + num;
			sum_of_squares = sum_of_squares + num*num;			
			count++;
		}
		System.out.println("The mean of this sequence is "+ (sum / 10));
	    double average_square_of_sum = sum*sum/count;
	    double deviation = Math.sqrt((sum_of_squares-average_square_of_sum)/(count-1));
	    System.out.printf("The deviation is %.4f",deviation);
	    
	    
		
		
		// TODO Auto-generated method stub

	}
	

}
