
public class WildCardNeedDemo {
	public static void main(String[]args) {
		GenericStack<Integer> intStack = new GenericStack<>();
		intStack.push(1);
		intStack.push(2);
		intStack.push(-2);
		
		System.out.println("The max number is "+ max(intStack));
	}

	private static double max(GenericStack<Integer> intStack) {
		double max = intStack.pop().doubleValue();
		
		while (!intStack.isEmpty()) {
			double value = intStack.pop().doubleValue();
			if ( value > max)
				max = value;
		}
		return max;
	}

}
