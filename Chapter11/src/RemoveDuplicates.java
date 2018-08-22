import java.util.*;
public class RemoveDuplicates {

	public static void main(String[] args) {
		System.out.println("Please enter 10 numbers");
		Scanner input = new Scanner(System.in);
		ArrayList<Object> list = new ArrayList<>();
		for ( int i = 0; i < 10; i ++ ) {
			list.add(input.nextInt());
		}
		list = removeDulicates(list);
		System.out.println(list.toString());
	}

	private static ArrayList removeDulicates(ArrayList<Object> list) {
		ArrayList<Integer> tempStorage = new ArrayList<>(); 
		for ( int i = 0; i < list.size() ; i ++ ) {
			for ( int j = i + 1; j < list.size(); j ++  ) {
				if ( list.get(j)==list.get(i))
					list.set(j, "REMOVE");
			}
		}
		
		for ( int i = 0; i < list.size(); i++) {
			if ( list.get(i)!="REMOVE")
				tempStorage.add((Integer) list.get(i));
		}
		return tempStorage;
	}

}
