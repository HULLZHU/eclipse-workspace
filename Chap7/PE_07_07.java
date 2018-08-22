
public class PE_07_07 {

	public static void main(String[] args) {
		int [] array = new int[100];
		for ( int i =0; i<100 ; i++) {
			array[i]= (int) (10*Math.random());
		}
		
		int [] countArray = new int[10];
		
		for ( int i = 0; i <100; i ++) {
			int temp = array[i];
			countArray[temp]++;
		}
		
		for ( int i =0; i<10; i++)
			System.out.printf("%5d",i);
		System.out.println("");
		
		
		for (int e : countArray )
			System.out.printf("%5d",e);

	}

}
