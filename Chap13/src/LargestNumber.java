import java.util.*;
import java.math.*;
public class LargestNumber {

	public static void main(String[] args) {
		ArrayList<Number> myList = new ArrayList<>();
		//autoboxing here
		myList.add(45);
		//autoboxing here
		myList.add(4335.5);
		myList.add(new BigInteger("123456789876"));
		myList.add(new BigDecimal("2.019202910212"));
		System.out.println("The largest number is " + getLargestNumber(myList));
		

	}

	private static Number getLargestNumber(ArrayList<Number> myList) {
		if (myList == null || myList.size()==0)
			return null;
		else {
		Number largestNumber = myList.get(0);
		for ( int i = 0; i < myList.size(); i ++ ) {
			if (largestNumber.doubleValue() < myList.get(i).doubleValue())
				largestNumber = myList.get(i);
		}
		return largestNumber;
		}
	}

}
