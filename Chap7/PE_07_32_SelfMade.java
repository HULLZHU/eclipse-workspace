import java.util.*;
public class PE_07_32_SelfMade {

	public static void main(String[] args) {
		System.out.println("how many numbers do you want to input?");
		Scanner input = new Scanner(System.in);
		int[] arr = new int[input.nextInt()];
		for ( int i =0 ; i<arr.length; i ++) {
			arr[i] = input.nextInt();
			}
		partition(arr);
		
		System.out.println("After partition, the array is :");
		for ( int i = 0 ; i < arr.length ; i++) {
			System.out.print("   "+ arr[i]);
		}
	}

	public static void partition(int[] arr) {
		int first = 0; 
		int last =arr.length -1; 
		int low = first + 1;
		int high = last;
		int pivot = arr[first];
		while ( low < high) {
			while ( low <= high &&arr[low] <= pivot ) {
				low ++ ; 
			}
			
			while ( low <= high && arr[high] > pivot) {
				high --; 
			}
			
			if( high > low) {
				int temp = arr[low];
				arr[low] = arr[high];
				arr[high] = temp;
				}
			
		}
		while ( high > first && arr[high] >= pivot ) {
			high -- ;
		}
		
		if ( pivot > arr[high]) {
		      arr[first] = arr[high];
		      arr[high] = pivot;
		}
		    
		
	}
	
		
	}

