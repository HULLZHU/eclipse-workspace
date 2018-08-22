
public class DynamicBindingDemo2 {

	public static void main(String[] args) {
		Integer [] list1 = {12,24,35,87};
		Double [] list2 = {12.0,34.3,32.2,12.9};
		int[] list3 = {1,2,3,4};
		printArray(list1);
		printArray(list2);
		//printArray(list3);
		//The method printArray(Object[]) in the type DynamicBindingDemo2 is not applicable for the arguments (int[])

		
	}

	private static void printArray(Object[] list) {
		for (Object o : list) {
			System.out.print(o+" ");
		}
		System.out.println();
		
	}

}
