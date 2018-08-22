
public class PE_5_24 {

	public static void main(String[] args) {
		
		double num = 99;
		double sum = 0;
		while ( num >= 3)
		{
			if ( num % 2 == 0)
			{
				continue;
			}
			else
			{
				sum = sum + (num -2)/ num ;
			}
			num = num -1 ;
			System.out.println(sum);
		}
		
		// TODO Auto-generated method stub

		
	}

}
