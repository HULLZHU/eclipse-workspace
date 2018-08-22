import java.util.*;
public class AdditionQuiz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = (int)(10*Math.random());
		int num2 = (int)(10*Math.random());
		System.out.println("What is "+num1 + " + "+num2);
		
		ArrayList<Integer> guesses = new ArrayList<>();
		int guess = input.nextInt();
		while ( guess != num1 + num2 ) {
			
			if ( hasGiven(guess,guesses)){
				System.out.println("You already answered " + guess);
			}
			else
				System.out.println("Wrong answer. Try again.");
			guesses.add(guess);
			guess = input.nextInt();
			
		}
		
		System.out.println("You got it.");

	}

	private static boolean hasGiven(int guess, ArrayList<Integer> guesses) {
		for( int i = 0; i < guesses.size(); i ++ ) {
			if ( guess == guesses.get(i))
				return true;
		}
		return false;
	}

}
