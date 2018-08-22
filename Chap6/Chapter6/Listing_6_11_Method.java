package Chapter6;

public class Listing_6_11_Method {

	public static void PrintRandomCharacter( int numberOfCharacter, int numberPerLine){
		int count = 0;
		while ( count < numberOfCharacter) {
			count ++;
			if (count % numberPerLine == 0)
				System.out.printf("%-3s\n", Listing_6_10.getRandomCharacter());
			else 
				System.out.printf("%-3s", Listing_6_10.getRandomCharacter());
		}
		
	}
	
	public static void main(String[]args) {
		PrintRandomCharacter(100,10);
	}

}
