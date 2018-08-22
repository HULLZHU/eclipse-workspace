package Chapter;

public class demo7 {

	public static void main(String[] args) {
		int[] list = {1,2,3,5,4};
		for (int i =0, j = list.length-1;i <list.length;i++,j--) {
		    int temp = list[i];
			list [ i ]= list[j];
			list[j] = temp;
		}
		
		for ( int i = 0; i < list.length;i++) {
			System.out.println(list[i]);
		}
		
		// TODO Auto-generated method stub
	}

}
