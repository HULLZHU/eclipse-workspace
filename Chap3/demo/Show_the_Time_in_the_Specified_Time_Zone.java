package demo;

import java.util.Scanner;

public class Show_the_Time_in_the_Specified_Time_Zone {

	public static void main(String[] args) {
		
		
		//�������㷨����һ���£�����Ϊ��GMTʱ����ֱ�Ӽ�3600*Timezone
		long totalMilliseconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliseconds/1000 ;
		
		long currentSecond = totalSeconds%60;
		
		long totalMinutes = totalSeconds/60; 
		
		long currentMinute= totalMinutes%60;
		
		long totalHours = totalMinutes / 60 ;
		
		long currentHours = totalHours%24 ; 
		
		System.out.println("Enter your own time zone");
		
		Scanner input= new Scanner(System.in) ;
		
		long timeZone = input.nextLong();
		
		Long hoursoftheZone = (currentHours + timeZone+24)%24;
		
		System.out.print("The time in the " + timeZone+"TimeZone is" +(hoursoftheZone)+":"+currentMinute);
		
		
		// TODO Auto-generated method stub

	}

}
