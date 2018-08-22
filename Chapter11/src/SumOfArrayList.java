import java.util.*;
public class SumOfArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Double> list = new ArrayList<>();
		System.out.println("Please enter double numbers. ");
		for ( int i = 0;i < 5 ; i ++ ) {
			list.add(input.nextDouble());
		}
		
		System.out.println(sum(list));
		

	}

	private static double sum(ArrayList<Double> list) {
		double sum = 0;
		for ( int i = 0; i < list.size() ; i ++ ) {
			sum = sum + list.get(i);
		}
		return sum;
	}

}
