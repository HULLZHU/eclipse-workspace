public class PE_5_18_C {

	public static void main(String[] args) {
		
		System.out.println("      Pattern C");
		
		int arr = 1;
		
		while( arr <= 6)
		{   //set the space-form
			int space = 0;
			
			while ( space < 6 -arr)
			{
				System.out.print("  ");
				space ++;
			}
			
		    //set the numbers;
			int i = arr;
			while ( i <=arr & i>=1  )
			{
				System.out.print(" "+i);
				i --;
			}
			System.out.println("");
			arr ++;
		}
		// TODO Auto-generated method stub

	}

}
