
public class PE_5_19 {

	public static void main(String[] args) {
		
		System.out.println(" Pyramid  ");
		
		double arr = 1;
		while ( arr <= 8)
		{
			//define space
			int i = 0;
			while ( 8 - i >=arr)
			{ 
				System.out.print("  ");
			i++;
			}
			double num = Math.pow(2, arr-1);
			double initial = 1;
			if ( arr > 1)
			{
				while ( initial<Math.pow(2, arr-1))
					{
				System.out.print( (int)initial+" ");
				initial = initial * 2;	
					}
			
			}
			   while( num/2 >=
					   1.0)
			  {
				System.out.print((int)num+" ");
				num = num /2;
			  }
			   System.out.print("1");
			
			
			
			
			System.out.println("");
			arr++;	
		}
		// TODO Auto-generated method stub

	}

}
