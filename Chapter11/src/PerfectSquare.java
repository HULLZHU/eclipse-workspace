import java.util.*;
public class PerfectSquare {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer.");
		int m = input.nextInt();
		//ArrayList<Object> factors = new ArrayList<>();
		int number = 1;
		for ( int factor = 2; factor <= m/2 ; factor ++ ) {
			//如果数m和factor无法整出，直接跳过该次循环
			if ( m % factor != 0)
				continue;
			int count = 0;
			while ( m % factor == 0) {
				m = m / factor;
				count ++;
			}
			System.out.println("For factor "+ factor +" , the count is "+ count);
		
			
			
		}

		
		/*if ( m != 1)
			factors.add(m);
		System.out.println(factors.toString());
		//删除重复出现的数值
		ArrayList<Objects>uniqueFactors= removeDulicates(factors);
		System.out.println(factors.toString());

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
		return tempStorage;*/
	}

}
