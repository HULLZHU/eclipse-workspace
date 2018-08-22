import java.util.*;

public class Exercise_4_5 {

	public static void main(String[] args) {
		
		System.out.println("Now show a number between 34 and 55");
		
		int a = (int) ( Math.ceil ( 22* ( Math.random() ) ) );
		
		// a的取值范围是  1- 22
		
		int b = a + 33;
		
		// b的取值范围是 34 - 35
		
		System.out.println("The number is " + b);
		
		int c = (int)( Math.floor(999*Math.random() + 1 ) ) ;
		// c的取值范围是
		
		System.out.println( "The number is " + c );
		
		int d = (int)( Math.ceil( 501 * ( Math.random() )));
		
		// d 的 取值范围是  1 - 501
		
		int e = (54 + d) / 10  ;
		
		// e 的取值范围是5.5 - 55.5
		
		System.out.println(" The number is " + e);
		
		
		
		
		// TODO Auto-generated method stub

	}

}
