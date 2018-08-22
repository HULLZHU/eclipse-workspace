package Chapter6;

public class PE_06_14 {

	public static void main(String[] args) {
		System.out.println(" i           m(i)");
		System.out.println("___________________");
		printBody();
	}
	
	public static void printBody() {
		double sum = 0;
		double count = 1;
		while ( count<= 901) {
			sum =  sum + (Math.pow(-1, count+1))/(2*count - 1);
		    if ( count ==1 || count >=101) {
			System.out.printf("%d",(int)count);
		    System.out.print("         ");
		    System.out.printf("%.4f\n",4*sum );
		    }
			count ++;
		}
	}

}
