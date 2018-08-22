package Chapter6;
import java.util.*;
public class Listing_6_11 {

	public static void main(String[] args) {
		System.out.println("Please input number of characters and how many per line");
		Scanner input = new Scanner(System.in);
		int numberOfCharacters = input.nextInt();
		int numberPerLine = input.nextInt();	
		int count = 0;
		while ( count < numberOfCharacters ) {
			count ++ ;
			if ( count % numberPerLine == 0) {
				System.out.printf("%-3c\n",Listing_6_10.getRandomCharacter());
			}
			else 
				System.out.printf("%-3s",Listing_6_10.getRandomCharacter());
		}
	}
}
