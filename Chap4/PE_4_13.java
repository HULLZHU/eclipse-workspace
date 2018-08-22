import java.util.Scanner;

public class PE_4_13 {

	public static void main(String[] args) {
		
		System.out.println("Please input a letter.");
		
		Scanner input = new Scanner(System.in);
		
		String s1 = input.nextLine();
		
		int letter =(int) s1.charAt(0);
		
	    if (letter< 65 || letter > 90)
	    {
	    	System.out.println("Please input a valid letter.");
	    }
	    
	    else
	    {
	    	if (letter != 65 || letter !=69 || letter !=73 || letter != 79 || letter!=85)
	    		System.out.println("The letter you input " + s1 + " is a consonant");
	    	else 
	    	{
	    		System.out.println("The letter you input "+s1 + " is a vowl");
	    	}
	    }
		// TODO Auto-generated method stub

	}

}
