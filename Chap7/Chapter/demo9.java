package Chapter;

public class demo9 {

	public static void main(String[] args) {
		int [] list = {1,2,3,4,5};
		for(int e: list) {
			System.out.println(e);
		}
		
		
		// TODO Auto-generated method stub

	}

	public static int[] reverse(int[] list) {
		int[] newList = new int[list.length];
		for ( int i = 0; i<list.length;i++) {
			newList[i]=list[list.length-1-i];
		}
        list = newList;
        return newList;
		// TODO Auto-generated method stub
		
	}

}
