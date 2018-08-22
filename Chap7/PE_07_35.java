import java.util.*;
public class PE_07_35 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[] words = { "banana", "program","elephant","currency"};
		String word_ = getWord(words);
		char[] word = new char[word_.length()];
		
		//convert the string into an array to facilitate the programming
		for ( int i = 0; i < word.length ; i ++ ) {
			word[i] = word_.charAt(i);
		}
		//create an auxiliary boolean array to help print * and letters
		boolean[] tempStatus = new boolean[word.length];
		printCurrentStatus(tempStatus,word);
		System.out.println("");
		char playAgain = 'Y';
		while ( playAgain=='Y'||playAgain == 'y') {
			int wrongCount = 0;
			initialize( tempStatus);
		while ( !isComplete(tempStatus)) {
			boolean alreadyEnter = false;
			System.out.println("Please enter the letter in word.");
			char letter = (input.nextLine()).charAt(0);
			
			
			/////
			for ( int i = 0; i < word.length; i++ ) {
				if ( letter == word[i]) {
					if ( tempStatus[i]) {
						alreadyEnter = true;
					}
					else 
						tempStatus[i] = true;
			}
			}
			/////
			
			if ( inWord(word,letter)){
				if ( !alreadyEnter)
				printCurrentStatus(tempStatus,word);
				else if (alreadyEnter )
					System.out.println("Already Enter.");
			}
			if (!inWord(word,letter)) {
				System.out.println(letter+ " is not in the word.");
				wrongCount++;
			}
		}
		System.out.println("You missed " + wrongCount+" times");
		System.out.println("IF You want to play again, enter 'Y' , else, enter'N'");
		playAgain = (input.nextLine()).charAt(0);
		}
	}
	
	private static void initialize(boolean[] tempStatus) {
		for ( int i = 0; i < tempStatus.length; i ++ ) {
			tempStatus [i] = false;
		}	
	}
	private static boolean inWord(char[] word, char letter) {
		for ( int i = 0; i< word.length ; i ++ ) {
			if ( letter ==word[i])
				return true;
		}
		return false;
	}
	private static void printCurrentStatus(boolean[] tempStatus, char[] word) {
		for ( int i = 0; i < word.length; i ++ ) {
			if ( tempStatus[i]) {
				System.out.print(word[i]);
			}
			else
				System.out.print("*");
		}
		// TODO Auto-generated method stub
		
	}
	private static boolean isComplete(boolean[] tempStatus) {
		for ( int i = 0; i < tempStatus.length ; i ++) {
			if (! tempStatus[i] )
				return false;
			}
		return true;
	}
	private static String getWord(String[] words) {
		return words[(int)(5*Math.random())];
	}
}
