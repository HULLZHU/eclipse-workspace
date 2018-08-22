
public class PE_5_20 {

	public static void main(String[] args) {
		
		int i = 2;
		int count = 0;
		while ( i <= 1000)
		{
			boolean isPrime = true;
			int divisor = 2;
			while ( divisor <= i/2) {
				if ( i % divisor == 0) {
					isPrime = false;
					break;
				}
				divisor++;
			}
			
			if (isPrime) {
				count ++;
				if ( count % 8 ==0){
					System.out.println(" "+i);
				}
				else {
					System.out.print(" " + i);
					}
			}
			i ++;
			
			
		}
		// TODO Auto-generated method stub

	}

}
