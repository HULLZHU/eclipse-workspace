package Chapter6;

public class PE_06_13 {

	public static void main(String[] args) {
		System.out.println("i             m(i)");
		System.out.println("_________________________");
		printbody();
	}
	
	public static void printbody() {
		int count = 1;
		double  sum = 0;
		while ( count <= 20 ) {
			System.out.print(count+"     ");
			sum = sum + (double)count/(count+1);
			System.out.printf("%14.4f\n",sum);
			count++;
			
		}
	}

}
