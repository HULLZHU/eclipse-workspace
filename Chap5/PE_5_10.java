
public class PE_5_10 {

	public static void main(String[] args) {
		
		int number = 100;
		int count = 0;
		while ( number <= 1000)
		{
			if ( number% 5==0 && number %6==0)
			{
				count ++ ;
				if (count % 10==0)
				{
					System.out.println(" "+number);
				}
				else 
					System.out.print(" "+number);
			}
			number++;
		}
		// TODO Auto-generated method stub

	}

}
