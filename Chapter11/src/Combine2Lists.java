import java.util.*;
public class Combine2Lists {

	public static void main(String[] args) {
		System.out.println("Please enter the first five number.");
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list1  = new ArrayList<>();
		for ( int i = 0 ; i < 5 ; i ++ ) {
			list1.add(input.nextInt());
		}
		
		System.out.println("Please enter the second five number.");
		ArrayList<Integer> list2  = new ArrayList<>();
		for ( int i = 0 ; i < 5 ; i ++ ) {
			list2.add(input.nextInt());
		}
		
		ArrayList<Integer> result = combine2Lists(list1,list2);
		System.out.println(result.toString());


	}

	private static ArrayList combine2Lists(ArrayList<Integer> list1, ArrayList<Integer> list2) {
		for ( int i = 0; i<list2.size(); i ++ ) {
			list1.add(list2.get(i));
		}
		return list1;
		
	}

}
