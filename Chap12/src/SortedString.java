import java.util.*;
import java.io.*;
public class SortedString {
	public static void main(String[] args) {
		if (args.length!=1) {
			System.out.println("The usage: java SortedString fileName");
			System.exit(0);
		}
		
		try {
			File sourceFile = new File (args[0]);
			Scanner input = new Scanner(sourceFile);
			ArrayList<Double> numbers = new ArrayList<>();
			while (input.hasNext()) {
				numbers.add(input.nextDouble());
			}
			input.close();
			Double[] numberList = new Double [numbers.size()];
			numbers.toArray(numberList);
			isSorted(numberList);
			
		}
		catch(FileNotFoundException ex) {
			System.out.println("FileNotFoundException occurs");
		}
		
	}

	private static void isSorted(Double[] numberList) {
		boolean isSorted ;
		
		for ( int i = 0; i<numberList.length-1; i ++ ) {
			if (numberList[i]>numberList[i+1]) {
				System.out.println("The String is not sorted in increasing order.");
				System.out.println("The first two numbers not in sort are : " + numberList[i]+" and "+ numberList[i+1]);
			}
		}
		
	}
}
