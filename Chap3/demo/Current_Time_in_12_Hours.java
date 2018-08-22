package demo;

public class Current_Time_in_12_Hours {

	public static void main(String[] args) {
		
		System.out.println(" Show the current time in 12 Hours_Form");
		
		long totalSeconds = System.currentTimeMillis()/ 1000 ;
		
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60 ; 
		
		long currentMinute = totalMinutes % 60 ;
		
		long totalHours = totalMinutes /60 ;
		
		long currentHours_in_12 = totalHours % 12; 
		
		System.out.println(" Current Time is " + currentHours_in_12 + ":"+currentMinute+ ":"+currentSecond + "GMT");
		
		
		
		
		// TODO Auto-generated method stub

	}

}
