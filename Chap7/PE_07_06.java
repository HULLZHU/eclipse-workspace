
public class PE_07_06 {

	public static void main(String[] args) {
		double[] primeArray = new double[50];
		double num = 2;
		primeArray[0]=2;
		for ( int i = 0; primeArray[49] == 0;num ++ ) {
			if (isPrime(num, primeArray)) {
				primeArray[i]= num;
				i++;
			}	
		}
		
		for ( double e : primeArray)
			System.out.print("  " +e);
		
	}

	private static boolean isPrime(double num, double[] primeArray) {
		int sqrtNum = (int)(Math.sqrt(num));
		for ( int i = 0; primeArray[i]<=sqrtNum;i++) {
			if (num % primeArray[i] == 0)			
				return false;
		}
		return  true;
	}

}
