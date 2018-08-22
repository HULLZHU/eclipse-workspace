import java.util.*; 
public class Dec2Hex {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a decimal number: ");
		
		int decimal = input.nextInt();
		
		String hex = "";
		
		int count = 0;
		
		while (decimal !=0) {
			
			int hexValue = decimal%16;
			
			char hexDigit = (hexValue <=9 && hexValue >=0)?
			  (char)(hexValue+'0'):(char)(hexValue -10 +'A');
			
			System.out.println("The hexDigit is " + hexValue);
					
					hex = hex+hexDigit;
					
					decimal = decimal /16 ; 
					
					count ++ ;

		}
		
		System.out.println("The hex number is "+ hex);
		System.out.println("The program has been executed for " + count);
		// TODO Auto-generated method stub

		
	}

}
