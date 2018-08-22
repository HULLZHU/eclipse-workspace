import java.util.Scanner;

public class PE_4_18 {

	public static void main(String[] args) {
		
		System.out.println("Please input M :for math\n C:for computer\n I:for IT\n");
		
		System.out.println("Please input:1 for freshman\n 2:for sophomore\n 3:for junior\n 4:for senior");
		
		Scanner input = new Scanner(System.in);
		
		String data = input.next();
		
		System.out.println(" You are ");
		
		if ( data.charAt(0) =='M')
			System.out.println("Mathematics");
		
		if ( data.charAt(0)=='C')
			System.out.println("Computer Science");
		
		if ( data.charAt(0)=='I')
			System.out.println("Information Technology");
		
		if (data.charAt(1)=='1')
			System.out.println("Freshman");
		
		if (data.charAt(1)=='2')
			System.out.println("Sophomore");
		
		if (data.charAt(1)=='3')
			System.out.println("Junior");
		
		if (data.charAt(1)=='4')
			System.out.println("Senior");
		
		
		// TODO Auto-generated method stub

	}

}
