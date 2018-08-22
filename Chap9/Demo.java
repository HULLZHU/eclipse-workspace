import java.util.*;
public class Demo {

	public static void main(String[] args) {
		Date date = new Date();
		System.out.println("The elapsed time since Jan 1, 1970 is " + date.getTime()+ " milliseconds");
		System.out.println(date.toString());
		
		System.out.println("Random Class.");
		Random random1 = new Random();
		for ( int i = 0; i < 10; i ++ ) {
			System.out.println(random1.nextInt(13)+" ");
		}

	}

}
