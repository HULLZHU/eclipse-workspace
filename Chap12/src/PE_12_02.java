import java.util.*;
public class PE_12_02 {
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		for ( int i = 0; i < 2 ; i ++ ) {
			double rand = Math.random();
			int temp = (int) (10 * Math.random());
			if ( rand>=0.5)
				numbers.add(temp);
			else
				numbers.add(-temp);
		}
		Scanner input = new Scanner(System.in);
		boolean done = false;
		while(!done) {
			System.out.println("What is the sum of "+ numbers.get(0)+" and "+numbers.get(1));
			try{
				int guess = input.nextInt();
				if (guess == numbers.get(0)+numbers.get(1)) {
					done = true;
				}
			}
			catch(Exception ex) {
				ex.printStackTrace();
				break;
			}
			}
			
		}
		
	}

