
public class PE_5_3 {

	public static void main(String[] args) {
		
		System.out.println("  Kilogram                         Pounds");
		
		int kilogram = 1;
		double pound = 2.2*kilogram;
		while ( kilogram < 199 )
		{   	
			pound = 2.2*kilogram;
			if ( kilogram%2 !=0) {
			System.out.println("");
	        System.out.printf("  %d                    %.2f",kilogram, pound);
			}
			kilogram ++;
		}
		// TODO Auto-generated method stub

	}

}
