
public class PE_08_04 {

	public static void main(String[] args) {
		int[][] matrix = {
				{2,4,3,4,5,8,8},
				{7,3,4,3,3,4,4},
				{3,3,4,3,3,2,2},
				{9,3,4,7,3,4,1},
				{3,5,4,3,6,3,8},
				{3,4,4,6,3,4,4},
				{3,7,4,8,3,8,4},
				{6,3,5,9,2,7,9}
		
		};
		int[] totalHour = new int [ 8 ];
		for ( int i = 0 ; i < matrix.length ; i ++ ) {
			int total = 0;
			for ( int j = 0; j < matrix[i].length; j++ ) {
				total = total + matrix[i][j];
			}
			totalHour[i] = total;
		}
		
		int [ ] temp = { 0,1,2,3,4,5,6,7};
		for ( int i = 0; i < temp.length ; i++ ) {
			System.out.println("Employee "+ temp[i] +":"+ totalHour[i]);
		}
		// TODO Auto-generated method stub

	}

}
