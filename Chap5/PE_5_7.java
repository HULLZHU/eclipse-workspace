
public class PE_5_7 {

	public static void main(String[] args) {
		
		double tuition = 10000;
		
		double sum = 0;
		
		int t = 0;
		
		double tuition_10 = 0;
		
		while ( t <= 14)
		{
			sum = sum + tuition;
			
			tuition = tuition * 1.07;
			
			if ( t ==10)
			{
				System.out.println("The tuition in 10 years is" + tuition);
				tuition_10 = sum;
			}
			t++;
		}
		
		double tuition_4year_after_10 = sum - tuition_10;
		
		System.out.println("The tuition in 4 years after 10th year is" + tuition_4year_after_10);
		
		
		
		// TODO Auto-generated method stub

	}

}
