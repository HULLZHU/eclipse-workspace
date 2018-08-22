import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class ReadData {

	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("dadada.txt");
		Scanner input = new Scanner(file);
		
		ArrayList<Double> numbers = new ArrayList<>();
		while (input.hasNext()) {
			numbers.add(input.nextDouble());	
			}
		input.close();
		System.out.println(numbers);
		
		Double[] numberArray = new Double [numbers.size()];
		numbers.toArray(numberArray);
		Arrays.sort(numberArray);
		for ( int i = 0; i < numberArray.length ; i ++ ) {
			System.out.println(numberArray[i]);
		}
		
		
		
	}

}
