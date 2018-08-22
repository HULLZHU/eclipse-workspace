import java.util.*;;
public class PE_07_31 {

	public static void main(String[] args) {
		System.out.println("How many number do you want to input for list1");
		Scanner input = new Scanner(System.in);
		int[] list1 = new int[input.nextInt()];
		System.out.println("How many number do you want to input for list2");
		int[] list2 = new int[input.nextInt()];
		System.out.println("Please input numbers for list1.");
		for ( int i = 0; i < list1.length; i ++) {
			list1[i] = input.nextInt();
		}
		System.out.println("Please input numbers for list2.");
		for ( int i = 0; i < list1.length ; i ++) {
			list2[i]= input.nextInt();
		}
		
		int[] list3 = new int[ list1.length + list2.length];
		for ( int i = 0 ; i< list1.length+list2.length; i++) {
			if ( i < list1.length ) {
				list3[i] = list1[i];
			}
			
			else if ( i >= list1.length) {
				list3[i]= list2[i-list1.length];
			}
		}
		
		for ( int e : list3) {
			System.out.println(e);
		}
		
		sortedArray(list3);
		for ( int e : list3)
			System.out.println(e);
		// TODO Auto-generated method stub

	}

	private static void sortedArray(int[] list3) {
		for ( int i = 0 ; i < list3.length-1 ; i ++ ) {
			int currentMax = list3[i];
			int currentMaxIndex = i;
			for ( int j = i + 1; j < list3.length; j++) {
				if( currentMax<list3[j]) {
					currentMax = list3[j];
					currentMaxIndex = j;
				}
			}
			
			if ( i != currentMaxIndex) {
			list3[currentMaxIndex] = list3[i];
			list3[i] = currentMax;
				
			}
		}
		
		
	}

}
