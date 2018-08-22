import java.util.*;
public class MyRandom {

	public static void main(String[] args) {
		Random myRandom = new Random(999);
		for ( int i = 0; i < 50; i ++ ) {
			System.out.println(myRandom.nextInt(100));
		}

	}

}
