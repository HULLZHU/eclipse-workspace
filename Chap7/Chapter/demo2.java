package Chapter;

public class demo2 {

	public static void main(String[] args) {
		int[] mylist = { 1, 1 ,2 ,-3, 5, 10,-11,10};
		int temp = mylist[0];
		for ( int e: mylist) {
			if ( e< temp)
				temp = e;
		}
		
		System.out.println(temp);
		// TODO Auto-generated method stub

	}

}
