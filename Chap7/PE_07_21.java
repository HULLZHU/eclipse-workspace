import java.util.*;
public class PE_07_21 {

	public static void main(String[] args) {
		System.out.println("Please input the number of slot.");
		Scanner input = new Scanner(System.in);
		int slotNum = input.nextInt();
		int hitTime = slotNum -1;
		System.out.println("Please input the number of balls being dropped");
		int ballNum = input.nextInt();
		int[] resultArray = new int[slotNum];
		// generate an array to represent the possible result of experiment
		for ( int i =0; i<hitTime;i++) {
			resultArray[i] = -hitTime + 2*i; 
		}
		//generate an array to count the occurence time of dropping into one slot
		int[] countArray = new int[slotNum];
		for ( int i = 0 ;i < ballNum; i++ ) {
			int currentSlot = 0;
			double generateNum;
			for ( int j = 0; j< hitTime; j++) {
				generateNum =  Math.random();
				if ( generateNum >= 0.6)
					currentSlot = currentSlot -1;
				else
					currentSlot = currentSlot+1;
			}
			// count the number of balls in one slot
			for ( int k=0; k < resultArray.length;k++) {
				if ( resultArray[k]==currentSlot)
					countArray[k] ++;
			}
		}
		System.out.println("The countArray is ");
		for ( int e : countArray) {
			System.out.printf("%3d",e);
		}
		System.out.println("");
		System.out.println("________________________________________");
		//generate a temp array
		printHistogram(countArray);

	}

	private static void printHistogram(int[] countArray) {
		int max = getMax(countArray);
		for ( int i = 0 ; i < max;i ++) {
			for ( int j = 0 ; j < countArray.length; j ++ ) {
				if ( j != countArray.length-1) {
				if ( countArray[j]< max)
					System.out.printf("%3s"," ");
				else if ( countArray[j]>=max)
					System.out.printf("%3c", '=');
				}
				if ( j == countArray.length - 1)
					System.out.println("");
				countArray[j]++;
			}
		}
		// TODO Auto-generated method stub
		
	}

	public static int getMax(int[] countArray) {
		
		int currentMax = countArray[0];
		int currentMaxIndex = 0;
		for ( int j =  1; j<countArray.length;j++) {
		if ( currentMax < countArray[j]) {
				currentMax = countArray[j];
				currentMaxIndex = j;
				}
			}
		// TODO Auto-generated method stub
		return currentMax;
		
	}

}
