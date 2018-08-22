import java.util.*;
public class PE_07_17 {

	public static void main(String[] args) {
		
		// generate the original list of students' name and their scores respectly
		System.out.println("Please input the number of students.");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt()+1;
		System.out.println("Please input students' name and grades one by one");
		String [] list = new String[num];
		for (int i = 0 ; i < num ; i ++ ) {
			list[i] = input.nextLine();
		}
		
		// get the score array
		int[] score = getScoreArray( list );
		
		//sort the array
		String temp = "";
		for ( int i = 0; i < score.length - 1; i ++ ) {
			int currentMax = score[i];
			int currentMaxIndex = i;
			
			for ( int j = i + 1; j < score.length; j ++ ) {
				if ( currentMax < score[j]) {
					currentMax = score[j];
					currentMaxIndex = j;
				}
		}
			
			if ( currentMaxIndex != i) {
				score[currentMaxIndex] = score[i];
				score[ i ] = currentMax;
				temp = list[ currentMaxIndex];
				list [ currentMaxIndex ] = list[i];
				list [ i ] = temp;
			}
	}
		
		for ( String e : list ) {
			System.out.println(e + "    ");
		}

}

	private static int[] getScoreArray(String[] list) {
		int[] score = new int[list.length];
		for ( int i = 0; i < list.length ; i ++ ) {
			for ( int j = 0; j < list[i].length() ; j ++ ) {
				if ( list[i].charAt(j)>='0'&&list[i].charAt(j)<='9')
					score [i] = score[i]*10 + list[i].charAt(j)-'0'; 
			}
		}
		return score;
	}
}