import java.util.*;
public class Case_Study_08_05 {

	public static void main(String[] args) {
		System.out.println("How many quizs do you have?");
		Scanner input = new Scanner(System.in);
		int columns;
		columns = input.nextInt();
		System.out.println("Please input keys.");
		String key[]  = new String[columns];
		for ( int i = 0; i < columns; i ++ )
			key[i] = input.nextLine();
		for (int i = 0 ; i <columns; i ++) {
			System.out.println(key[i]);
		}
	}
}
