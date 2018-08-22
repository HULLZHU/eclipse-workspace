
public class PE_5_18_D {

	public static void main(String[] args) {
		
		System.out.println("  Pattern D");
		
		int arr = 1;
		while ( arr <= 7 )
		{
			// define space
			int space = 0;
			while ( space< arr)
			{
				System.out.print("  ");
				space++;
			}
			
			//define numbers
			
			int i = 1;
			while ( i <= 7-arr)
			{
				System.out.print(" "+ i);
				i++;
			}
			
			System.out.println("");
			arr++;
		}
		// TODO Auto-generated method stub

	}

}
