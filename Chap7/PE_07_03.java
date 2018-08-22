import java.util.*;
public class PE_07_03 {

	public static void main(String[] args) {
		System.out.println("Please input numbers between 1 and 100 and ends inputting by inputting 0");
		Scanner input = new Scanner(System.in);
		int number = 1;
		int[] countArray = new int [100];
		while ( number != 0) {
			number = input.nextInt();
			countArray[number]++;
		}
		
		for ( int i=1; i<countArray.length;i++) {
			if ( countArray[i]!=0 && countArray[i]==1) {
				System.out.println(i +" occurs"+ countArray[i]+" time");
			}
			else if( countArray[i]!=0)
				System.out.println(i + " occurs"+countArray[i]+" times");
				
		}
		
		// TODO Auto-generated method stub

	}

}
