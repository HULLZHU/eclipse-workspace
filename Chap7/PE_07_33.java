import java.util.*;
public class PE_07_33 {

	public static void main(String[] args) {
		String [] animals = { "monkey", "rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake","horse","sheep"};
		System.out.println("Please input the year.");
		Scanner input = new Scanner(System.in);
		System.out.println("The year is : " + animals[input.nextInt()%12]);
		
		// TODO Auto-generated method stub

	}

}
