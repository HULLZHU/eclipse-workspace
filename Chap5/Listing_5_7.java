
public class Listing_5_7 {

	public static void main(String[] args) {
		
		//Nested loop
		
	System.out.println("        Multiplication Table");
	
    System.out.println("                        ");
	
	for ( int i=1; i<=9; i ++ )
	{
		System.out.print("    "+i);
	}
	
	System.out.println("\n------------------------------------"
			+ "-----------------");
	
	for (int j=1; j<=9; j ++)
	{
		
		System.out.print(j+"|");
		{
		
		for ( int i = 1 ; i <=9 ; i++)
		{
			
			//生成乘法结果
			System.out.printf("%5d",i*j);
		}
		System.out.print("\n");
		
		}
		
		
		
		
		
	}
		
			
		
		

	}

}
