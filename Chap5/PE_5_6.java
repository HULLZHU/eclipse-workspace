
public class PE_5_6 {

	public static void main(String[] args) {
		
		System.out.println("Miles     Kilometers | kilometers    Miles");
		
		int mile1 = 1;
		
		double kilometer1 = 1.609;
		
		double mile2 = 20;
		
		int kilometer2 = 20;
		
		while ( mile1 <= 10) 
		{   
			System.out.printf("%d            %.3f   | %d           %.3f\n",mile1,kilometer1,kilometer2,mile2);
		    mile1 ++ ;
		    kilometer1 = 1.609 * mile1;
		    kilometer2 = kilometer2 +5;
		    mile2 = kilometer2 * 12.430 /20;
		
		}
		// TODO Auto-generated method stub

	}

}
