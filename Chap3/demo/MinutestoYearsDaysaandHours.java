package demo;

import java.util.Scanner;

public class MinutestoYearsDaysaandHours {

	public static void main(String[] args) {
		
		System.out.println("Enter a period of minutes");
		
		Scanner input = new Scanner (System.in);
		
		int minutes = input.nextInt();
		
		int days = minutes/1440 ;
		
		int remainedMinutes = minutes % 1440 ;
		
		//remainedMinutes Ϊ������������ʣ�������
		int remainedHours = remainedMinutes / 60 ;
		
		
		//finalremainedminutes Ϊ��Сʱ��������ʣ�������
		int finalremainedminutes = minutes%60 ;
		
		int years = days/365 ;
		
		
		//��������ͷΪ������-365*����
		int remaineddays = days - years*365 ; 
		
		System.out.println("The sum of minutes is equal to " + years+"years and "+remaineddays +"days"+ remainedHours+"hours and"+finalremainedminutes+"minutes");
				
				
		// TODO Auto-generated method stub

	}

}


