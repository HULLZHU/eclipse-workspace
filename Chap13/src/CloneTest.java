import java.awt.List;

public class CloneTest {

	public static void main(String[] args) {
		int[] list1 = {1,2,3,4,5,6};
		int[] list2 = list1.clone();
		list1[0] = 7;
		list1[2] = 1;
		for ( int i = 0; i < list1.length ; i ++ ) {
			System.out.print(list1[i]);
		}
		
		for (int i = 0; i < list2.length ; i ++ ) {
			System.out.println(list2[i]);
		}

	}

}
