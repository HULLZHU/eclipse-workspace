package Chapter6;
import java.util.*;
public class PE_06_25 {

	public static void main(String[] args) {
		System.out.println("Please inpua milliseconds");
		Scanner input = new Scanner(System.in);
		long milliSeconds = input.nextLong();
		convertMillis(milliSeconds);
	}
	
	public static void convertMillis(long milliSeconds) {
		long seconds = milliSeconds/1000;
		long minutes=0;
		long hours=0;
		if (seconds >= 60) {
			minutes = seconds/60;
			seconds = seconds % 60;
			if ( minutes >= 60 ) {
				hours = minutes/60;
				minutes  = minutes%60;
			}
		}
		System.out.println(hours+":"+minutes+":"+seconds);
	}

}
