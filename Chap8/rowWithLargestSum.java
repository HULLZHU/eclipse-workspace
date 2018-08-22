
public class rowWithLargestSum {

	public static void main(String[] args) {
		int [][]array = {{1,2,3},{1,2,4},{1,2,1}};
		int maxIndex = 0;
		int max = 0; 
		for ( int row = 0 ; row< array.length; row ++ ) {
			int total = 0;
			for (int column =0; column < array[row].length ; column ++ ) {
				total = total + array[row][column];
			}
			if ( total > max) {
				max = total;
				maxIndex = row;
			}
		}
		System.out.println("The max row's index is: "+ maxIndex);
		// TODO Auto-generated method stub

	}

}
