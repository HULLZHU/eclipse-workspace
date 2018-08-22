
public class PE_5_11 {

	public static void main(String[] args) {
		
		System.out.println("Numbers are \n");
		
		int number=100;
		int count = 0;
		while ( number <= 200)
		{
			if ( (number%5==0||number%6==0)&&!(number%5==0&&number%6==0))
			{
				count ++;
				if (count%10==0)
					System.out.println("");
				else
					System.out.print(number+" ");
			}
			
			number ++;
		}
		// TODO Auto-generated method stub

	}

}
