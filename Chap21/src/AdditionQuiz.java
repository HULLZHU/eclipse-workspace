import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AdditionQuiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = (int)(10*Math.random());
		int num2 = (int)(10*Math.random());
		System.out.println("What is "+num1 + " + "+num2);
		
		Set<Integer> guesses = new HashSet<>();
		int guess = input.nextInt();
		while ( guess != num1 + num2 ) {
			
			if (guesses.contains(guess)){
				System.out.println("You already answered " + guess);
			}
			else
				System.out.println("Wrong answer. Try again.");
			guesses.add(guess);
			guess = input.nextInt();
			
		}
		
		System.out.println("You got it.");

	}
}
