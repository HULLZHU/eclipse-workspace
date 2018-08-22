import java.util.*;
public class PE_07_34 {

	public static void main(String[] args) {
		System.out.println("Please input a string.");
		Scanner input = new Scanner(System.in);
		String s1 = input.nextLine();
		char[] characters = new char[s1.length()];
		for ( int i = 0; i < characters.length ; i ++ ) {
			characters[i] = s1.charAt(i);
		}
		
		for ( int i = 0 ; i < characters.length-1; i++ ) {
			char currentMax = characters[i];
			int currentMaxIndex = i;
			for ( int j = i + 1; j < characters.length; j ++ ) {
				if ( currentMax < characters[j]) {
					currentMax = characters[j];
					currentMaxIndex = j ;
				}
			}
			
			if ( currentMaxIndex != i ) {
				char temp = characters[i];
				characters[i] = currentMax;
				characters[currentMaxIndex]= temp;
			}
		}
		
		for ( char e : characters) {
			System.out.println(e);
		}
		// TODO Auto-generated method stub

	}

}
