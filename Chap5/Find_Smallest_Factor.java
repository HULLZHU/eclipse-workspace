import java.util.*;
public class Find_Smallest_Factor {

	public static void main(String[] args) {
		
		System.out.println("please input a number");
		
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		
		boolean found = false ; 
		
	    int factor = 2 ;
	    
	    while ( factor <=num && found==false)
	    {
	    	if (num%factor == 0)
	    		found = true;
	    	else
	    		factor ++ ;
	    }
	    
	    System.out.println("The smallest factor other than 1 for "+num + " is "+factor);
		
		
		// TODO Auto-generated method stub

	}

}
