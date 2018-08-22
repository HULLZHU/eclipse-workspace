import java.util.*;
public class PE_12_03 {
	public static void main(String[] args) {
		int[] numbers = getRandomArray();
		Scanner input = new Scanner(System.in);
		boolean stop = false;
		while(!stop) {
			try {
				System.out.println("Please enter the index of Element");
				int index = input.nextInt();
				System.out.println("The element is :" + numbers[index]);
			}
			catch(ArrayIndexOutOfBoundsException ex) {
				ex.printStackTrace();
			}
			finally {
				int temp1 = 0;
				while (temp1 !=1 ) {
				System.out.println("Do you want to continue?Y/N");
				char temp2 = input.next().charAt(0);
				if (temp2=='Y') {
					stop = false;
					temp1 =1;
					}
				else if (temp2 =='N') {
					stop = true;
					temp1 = 1;
					}
				else {
					System.out.println("Please input your choice again.");
				}
			}
	}
		
		}
		}

	private static int[] getRandomArray() {
		int [] array = new int[100];
		for ( int i = 0; i < 100; i++) {
			array[i] = (int) (100*Math.random());
		}
		return array;
	}

}
