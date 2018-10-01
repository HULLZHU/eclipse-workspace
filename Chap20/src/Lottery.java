import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Lottery {
	public static void main(String[]args) {
		int answer = 123;
		Scanner input = new Scanner(System.in);
		int guess = input.nextInt();
		
		int answer1 = answer % 10;
		int answer2 =( answer / 10)%10;
		int answer3 = answer / 100;
		
		int guess1 = guess%10;
		int guess2 = (guess/10)%10;
		int guess3 = guess / 100;
		
		ArrayList<Integer> answers = new ArrayList<Integer>();
		ArrayList<Integer> guesses = new ArrayList<Integer>();
		
		answers.add(answer1);
		answers.add(answer2);
		answers.add(answer3);
		
		guesses.add(guess1);
		guesses.add(guess2);
		guesses.add(guess3);
		
		Collections.sort(answers);
		Collections.sort(guesses);
		
		if ( answer == guess) {
			System.out.println("You won 10000");
		}
		 
		else if (answers.equals(guesses)){
			System.out.println("You won 8000");
		}
		
		else if ( answers.containsAll(answers.subList(0, 2))||answers.containsAll(answers.subList(1, 3))) {
			System.out.println("Won 6000");
		}
		 
		else if ( answers.contains(guess1)||answers.contains(guess2)||answers.contains(guess3)) {
			System.out.println("Won 4000");
		}
		
		else { 
			System.out.println("No Won");
		}
	}

	}


