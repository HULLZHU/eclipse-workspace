import java.util.*;
public class PE_5_16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
	    double number = input.nextDouble();
	    
	    double divisor = 2 ;
	    
	    while ( number % divisor ==0)
	    
	    { 
	    	number = number /divisor;
	    	System.out.println(" " + divisor);
	    }
        loop1:
	    while ( number % divisor != 0)
	    {
	    	divisor ++;
	    	
	    	loop2 :
	    	while ( number % divisor ==0 )
	    	{
	    		System.out.println(" " + divisor);
	    		if ( number / divisor == 1)
	    		{
	    			break loop1;
	    		}
	    		else 
	    		{
	    			number = number / divisor;
	    			divisor = 2 ;
	    			break loop2;
	    		}
	    	}
	    	
	    }
	   
		// TODO Auto-generated method stub
	   

	}

}

