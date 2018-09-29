
public class TestIntegerMatrix {
	public static void main(String[]args) {
		//create Integer array
		Integer[][] m1 = new Integer[][] {{1,2,3},{4,5,6},{1,1,1}};
		Integer[][] m2 = new Integer[][] {{1,1,1},{2,2,2},{0,0,0}};
		
		//create an instance of Integer matrix
		IntegerMatrix integerMatrix = new IntegerMatrix();
		GenericMatrix.printResult(m1, m2, integerMatrix.addMatrix(m1, m2), '+');
	}
}
