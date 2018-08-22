package Chapter;

public class Listing_07_04 {

	public static void main(String[] args) {
		char[] chars =createArray();
		System.out.println("The lowercase letters are ");
		System.out.println();
		displayArray(chars);
		System.out.println("");
		char []charsOrdered = new char[26];
		for ( int i = 0; i < charsOrdered.length;i++) {
			charsOrdered[i] = (char)('a'+i);
		}
		
		for ( int i = 0; i< charsOrdered.length;i++) {
			System.out.printf(" %2c" ,charsOrdered[i]);
		}
		System.out.println("");
		int[] count = counts(chars);
		for ( int i = 0; i <count.length;i++ ) {
			System.out.printf("%3d",count[i] );
		}
		// TODO Auto-generated method stub

	}

	private static int[] counts(char[] chars) {
		int[] countArray = new int[26];
		initializeArray(countArray);
		for ( int i = 0; i <chars.length; i++) {
			int additionTemp = chars[i]-'a';
			countArray[additionTemp]++;
		}
		return countArray;
		
	}

	private static int[] initializeArray(int[] countArray) {
		for ( int i= 0; i < countArray.length;i++) {
			countArray[i] =0;
		}
		return countArray;
		// TODO Auto-generated method stub
		
	}

	private static void displayArray(char[] chars) {
		for (int i = 0; i< chars.length;i++) {
			System.out.print(" " + chars[i]);
			if ( (i+1) % 10 ==0 ) {
				System.out.println("");
			}
		}
		
	}

	private static char[] createArray() {
		char chars[] = new char [ 100 ];
		for (int i = 0; i<chars.length;i++) {
			chars[i]=getRandomLetter();
		}
		// TODO Auto-generated method stub
		return chars;
	}

	private static char getRandomLetter() {
		return (char)('a'+ Math.random()*('z'-'a'+1));
	}

}
