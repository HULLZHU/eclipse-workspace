package demo;

import java.util.Scanner;

public class MinutestoYearsDaysaandHours {

	public static void main(String[] args) {
		
		System.out.println("Enter a period of minutes");
		
		Scanner input = new Scanner (System.in);
		
		int minutes = input.nextInt();
		
		int days = minutes/1440 ;
		
		int remainedMinutes = minutes % 1440 ;
		
		//remainedMinutes 为按天数折算后的剩余分钟数
		int remainedHours = remainedMinutes / 60 ;
		
		
		//finalremainedminutes 为按小时数折算后的剩余分钟数
		int finalremainedminutes = minutes%60 ;
		
		int years = days/365 ;
		
		
		//天数的零头为总天数-365*年数
		int remaineddays = days - years*365 ; 
		
		System.out.println("The sum of minutes is equal to " + years+"years and "+remaineddays +"days"+ remainedHours+"hours and"+finalremainedminutes+"minutes");
				
				
		// TODO Auto-generated method stub

	}

}


