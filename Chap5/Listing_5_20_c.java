
public class Listing_5_20_c {

	public static void main(String[] args) {
		
		int i = 5 ;
		
		while ( i>= 1)
		{
			int num = 1;
			
			for ( int j =1 ; j<=i; j++)
			{
				System.out.print(num+"xxxx");
				
				num*=2;
			}
			System.out.println();//每一次完成对 i 的 iteration，均换行 ，因其属于outer loop
			
		
			i -- ;
		}
		// TODO Auto-generated method stub

	}

}
