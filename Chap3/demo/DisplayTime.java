package demo;

import java.util.*;

public class DisplayTime {
	

	public static void main(String[] args) {
		
		
		
		//enter a period of time
		Scanner input= new Scanner(System.in);
		
		//prompt the user to enter a radius
		System.out.print("Enter a period of time");
		
		//assign value to variables
		int time=input.nextInt();
		
		//assign value to expectedly presented variables
		int hour=time/60;
		int remainedminute=time%60;
		
		System.out.println("the total hour is"+hour+",and the remained minute is"+remainedminute);
		
		
		
		
		
		
	}

}
