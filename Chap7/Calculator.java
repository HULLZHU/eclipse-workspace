

public class Calculator {

	public static void main(String [] x) {
		if ( x.length !=3) {
			System.out.println("Out");
			System.exit(0);
		}
		int result = 0;
		switch ( x[1].charAt(0)) {
		case '+': result = Integer.parseInt(x[0])+Integer.parseInt(x[2]);
		break;
		case '-': result = Integer.parseInt(x[0])-Integer.parseInt(x[2]);
		break;
		case '.': result = Integer.parseInt(x[0])*Integer.parseInt(x[2]);
		break;
		case '/' :result = Integer.parseInt(x[0])/Integer.parseInt(x[2]);
		break;
		}
		
		
		System.out.println("result is "+ result);
		// TODO Auto-generated method stub

	}

}
