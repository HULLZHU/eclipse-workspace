import java.util.ArrayList;

public class GenericShuffle {
	public static void main(String[]args) {
		ArrayList<String> array = new ArrayList<>();
		for ( int i = 0 ; i < 10; i ++) {
			array.add((int)(10 *Math.random())+"");
		}
		printArray(array);
		
		shuffle(array);
		printArray(array);
	}
	
	public static <E extends ArrayList> void printArray(E array) {
		for ( int i = 0 ; i < array.size() ; i ++ ) {
			System.out.print(array.get(i).toString()+" ");
		}
		
		System.out.println();
	}
	
	public static <E extends String> void shuffle(ArrayList<E> array) {
		for ( int i = 0 ; i < array.size() ; i ++  ) {
			 int j = (int)(array.size() * Math.random());
			 int k = (int)(array.size() * Math.random());
			 E temp = array.get(j);
			 array.set(j, array.get(k));
			 array.set(k, temp);
		}
	}
  

}
