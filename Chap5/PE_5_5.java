
public class PE_5_5 {

	public static void main(String[] args) {
		
		System.out.println("Kilograms         Pounds  |  Kilograms         Pounds");
		
		int kilogram = 1 ; 
		double pound =2.2;
		
		int pound2 = 20;
		
		double kilogram2 = 9.09;
		
		while ( kilogram < 100)
		{
			System.out.println("");
			System.out.printf("   %d             %.1f     |    %d                 %.2f",kilogram, pound,pound2,kilogram2);
			
			kilogram = kilogram + 2 ;
			pound2 = pound2 + 5;
			kilogram2= pound2 *9.09/20;
			pound = 2.2 * kilogram;
		}
		// TODO Auto-generated method stub

	}

}
