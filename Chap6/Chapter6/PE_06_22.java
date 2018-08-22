package Chapter6;
import java.util.*;
public class PE_06_22 {

	public static void main(String[] args) {
		System.out.println("Please input a number");
		Scanner input = new Scanner(System.in);
		double n = input.nextLong();
		System.out.println(sqrt(n));
	}
	
	public static double sqrt( double n ) {
		double lastGuess = 1;
		double nextGuess = (lastGuess + n/lastGuess)/2;
		while ( Math.abs(lastGuess - nextGuess)>0.0001) {
			lastGuess = nextGuess;
			nextGuess = (lastGuess + n/lastGuess)/2;
		}
		return nextGuess;
	}

}
