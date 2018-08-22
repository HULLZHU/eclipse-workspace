
public class Case_Study_5_8_2 {

	public static void main(String[] args) {
		
		System.out.println("Now We will compute in how many years the tuition while double");
		
		int i = 0;
		
		double tuition  = 10000;
		
		double num_of_years = 0;
		
		while (tuition <=20000)
		{
			tuition = 1.07 * tuition;
			
			num_of_years ++ ; 
		}
		
		System.out.println("In " + num_of_years+" years , The tuition will double");
		// TODO Auto-generated method stub

	}

}
