import java.util.*;
public class MyDate {
	//data field
	private int year;
	private int day;
	private int month;
	//construct
	public MyDate() {
		//�˴�����GregorianCalendar���� date ������data field ���������ڽ�ʡ�ڴ�
	    GregorianCalendar date = new GregorianCalendar();
	    year = date.get(Calendar.YEAR);
	    month = date.get(Calendar.MONTH);
	    day = date.get(Calendar.DAY_OF_MONTH);
	  }
	  
	  public MyDate(long elapsedTime) {
		  ////�˴�����GregorianCalendar���� date ������data field ���������ڽ�ʡ�ڴ�
	    GregorianCalendar date = new GregorianCalendar();
	    date.setTimeInMillis(elapsedTime);
	    year = date.get(Calendar.YEAR);
	    month = date.get(Calendar.MONTH);
	    day = date.get(Calendar.DAY_OF_MONTH);
	  }
	    
	 public MyDate(int year, int month, int day) {
	    this.year = year;
	    this.month = month;
	    this.day = day;
	  }
	  
	  public int getYear() {
	    return year;
	  }

	  public int getMonth() {
	    return month;
	  }
	  
	  public int getDay() {
	    return day;
	  }
	  
	  public void setYear(int year) {
	    this.year = year;
	  }
	  
	  public void setMonth(int month) {
	    this.month = month;
	  }
	  
	  public void setDay(int day) {
	    this.day = day;
	  }  
}
