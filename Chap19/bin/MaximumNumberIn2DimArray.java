
public class MaximumNumberIn2DimArray {
	public static void main(String[]args) {
		Integer[][] intMatrix = {{1,2,3,4,5,6},{7,6,4,5,3,2}};
		System.out.println(max(intMatrix));
	}

	private static <E extends Comparable<E>> E max(E[][] matrix) {
		E max= matrix[0][0];
		for ( int i = 0; i < matrix.length ; i ++ ) {
			for ( int j = 0 ; j < matrix[i].length ; j ++ ) {
				if (max.compareTo(matrix[i][j])<0) {
					max = matrix[i][j];
				}
			}
		}
		return max;
	}

}
