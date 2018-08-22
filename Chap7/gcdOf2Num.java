
public class gcdOf2Num {

	public static void main(String[] args) {
		int i = 36;
		int j = 54;
		int gcd =1;
		for ( int divisor = 2; divisor<=i&&divisor <= j;  ) {
			if ( (i%divisor == 0) && (j%divisor == 0)) {
				gcd = gcd * divisor;
				i = i / divisor;
				j = j/divisor;
				System.out.println(gcd);
			}
			else 
				divisor ++;
		}
		
		System.out.println(gcd);
		// TODO Auto-generated method stub

	}

}
