import java.util.*;
import java.io.*;
public class ReadNumbers {

	public static void main(String[] args) {
		Scanner input =  new Scanner("deadead.txt");
		while (input.hasNext()) {
			System.out.println(input.nextDouble());
			System.out.println(input.nextDouble());
		}
		
		input.close();
		
		// TODO Auto-generated method stub

	}

}
