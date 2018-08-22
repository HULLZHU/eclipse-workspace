import java.util.Scanner;

public class Case_Guess_Birthday {

	public static void main(String[] args) {
		
		String set1 = " 1 3 5 7\n" + "9 11 13 15\n"+ "17 19 21 23\n"+ " 25 27 29 31\n";
		
		String set2 = " 2 3 6 7\n" + "10 11 14 15\n"+ " 18 19 22 23\n" + "26 27 30 31\n";
		
		String set3 = " 4 5 6 7\n" + "12 13 14 15\n"+ "20 21 22 23\n" + " 28 29 30 31\n";
		
		String set4 = " 8 9 10 11\n" + "12 13 14 15\n"+ "24 25 26 27\n" + "28 29 30 31\n";
		
	    String set5 = " 16 17 18 19\n"+ "20 21 22 23\n"+ "24 25 26 27\n" + "28 29 30 31\n";
	    
	    Scanner input = new Scanner(System.in);
	    
	    int day = 0;
	    
	   
	    
	    System.out.println(" Is your birthday in this set?\n" + " If yes, input 1, if no, input 0 ");
	    
	    System.out.println(set1);
	    
	    int answer = input.nextInt();
	    
	    if ( answer == 1)
	    {
	    	day = day + 1;
	    }
	    
	    else {
	    	
	    }
	    
        System.out.println(" Is your birthday in this set?\n" + " If yes, input 1, if no, input 0 ");
	    
	    System.out.println(set2);
	    
	    answer = input.nextInt();
	    
	    if ( answer == 1)
	    {
	    	day = day +2;
	    }
	    else
	    {
	    }
	   

        System.out.println(" Is your birthday in this set?\n" + " If yes, input 1, if no, input 0 ");
	    
	    System.out.println(set3);
	    
	    answer = input.nextInt();
	    if (answer ==1)
	    {
	    	day = day + 4;
	    }
	    else
	    {
	    
	    }
	    

        System.out.println(" Is your birthday in this set?\n" + " If yes, input 1, if no, input 0 ");
	    
	    System.out.println(set4);
	    
	    answer = input.nextInt();
	    
	    if (answer ==1)
	    {
	    	day =day + 8;
	    }
	    else
	    {
	    	
	    }
	    

        System.out.println(" Is your birthday in this set?\n" + " If yes, input 1, if no, input 0 ");
	    
	    System.out.println(set5);
	    
	    answer= input.nextInt();
	    
	    if (answer == 1)
	    {
	    	day = day + 16;
	    }
	    else
	    {
	    }
	    
	    
	    System.out.println(" The birthday is " + day);
	    
	    
	    
	    
	    
	    
	    

	}

}
