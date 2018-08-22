
public class CheckPoint_08_07 {

	public static void main(String[] args) {
		int [][] array = {{1,2,3,4},{5,6,7,8}};
		System.out.println(m1(array)[0]);
		System.out.println(m1(array)[1]);
	}

	private static int[] m1(int[][] array) {
		int[] result = new int[2];
		result[0] = array.length;
		result[1] = array[0].length;
		// TODO Auto-generated method stub
		return result;
	}

}
