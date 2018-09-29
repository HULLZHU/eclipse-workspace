
public class GenericMaximumNumber {

	public GenericMaximumNumber() {
		Integer[] intArray ={1,2,3,4,5,6,7,6,5,4,3,2,1,0};
		System.out.println(max(intArray));
	}
	
	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0];
		for (int i = 0; i < list.length ; i ++ ) {
			if (max.compareTo(list[i])<0) {
				max = list[i];
			}
		}
		return max;
	}

}
