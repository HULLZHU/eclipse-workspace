
public class GenericPrint {
	public static void main(String[]args) {
		Integer[] integers = {1,2,3,4,5};
		String[] strings = {"London","Paris","NewYork","Austin","Beijing"};
		GenericPrint.print(integers);
		GenericPrint.<String>print(strings);
	}
	
	public static <E> void print(E[] list) {
		for ( int i = 0 ; i < list.length ; i ++ ) {
			System.out.println(list[i]+ " ");
		}
		System.out.println();
	}

}
