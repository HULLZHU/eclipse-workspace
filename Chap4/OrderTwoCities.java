import java.util.*;

public class OrderTwoCities {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Please input the name of first city");
		
		String city1 = input.nextLine();
		
		String city2 = input.nextLine();
		
		if ( city1.compareTo(city2) >=  0)
			System.out.println(" These two cities are " +city1+city2+" in alphabetical order");
		else 
			System.out.println(" These two cities are " + city2 +" " +city1 + " in alphabetical order");
		
		
		
		
		// TODO Auto-generated method stub

	}

}
