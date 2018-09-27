import java.util.*;
public class FindUpperCaseCharactersInArray {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter 10 characters");
		char[] array = new char[10];
		for ( int i = 0 ; i < 10 ; i ++ ) {
			array[i] = input.next().charAt(0);
		}
		
		System.out.println("The count of Uppercase is " + count(array));
	}

	private static int count(char[] array) {
		int high = array.length -1;
		return count(array,high);
	}

	private static int count(char[] array, int high) {
		 if (high >= 0) {
		      return  (Character.isUpperCase(array[high]) ? 1 : 0)+count(array, high - 1) 
		       ;
		    }
		    else
		      return 0;
	}

}
