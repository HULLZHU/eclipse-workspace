
public class ClassForLinearSearchMethod {
	public static void main(String[]args) {
		Integer[] intList = {1,2,3,4,5,6,7,8,9,10};
		Integer key = new Integer(8);
		System.out.println(linearSearch(intList,key));
	}
	/**<E extends Comparable<E>> is used to bound the type of object; Here we can only choose objects which implementing Comparable Interface*/
	public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {
		for ( int i = 0 ; i < list.length ; i ++) {
			if ( list[i].equals(key))
				return i;
		}
		return -1;
	}
	
}
