
public class PE_5_4 {

	public static void main(String[] args) {
		
		System.out.println("  Miles                                  kilometers");
		
		int miles = 1;
		
		double kilometers = 1.609;
		
		while ( miles < 10)
		{   System.out.println("");
			System.out.printf("    %d                                         %.3f", miles, kilometers);
			
			miles ++;
			kilometers = 1.609 * miles;
		}
		
		// TODO Auto-generated method stub

	}

}
