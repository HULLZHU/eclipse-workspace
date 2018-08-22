
public class PE_07_14 {

	public static void main(String [] args) {
		gcd ( 32,64,96);
		
		// TODO Auto-generated method stub

	}

	public static void gcd(int ... numbers) {
		if ( numbers.length == 0) {
			System.out.println("No argument is passed.");
		}
		else {
		int gcd[] = new int[numbers.length];
		for ( int i = 0; i < gcd.length; i ++) {
			if ( i != gcd.length-1)
				gcd[i]= gcdOf2Numbers( numbers[i],numbers[i+1]);
			else {
				gcd[i]=gcdOf2Numbers(numbers[i],numbers[0]);
				
			}
		}
		
		
		int currentMax =1;
		
		currentMax(gcd);
		System.out.println("The gcd of numbers are " + currentMax(gcd));
		// TODO Auto-generated method stub
		}
		
	}
    
	
	private static int currentMax(int[] gcd) {
		int currentMax = 1;
		for ( int i = 0; i<gcd.length;i++ ) {
			if ( currentMax < gcd[i])
				currentMax = gcd[i];
		}
		
		return currentMax;
		// TODO Auto-generated method stub
		
	}

	//True
	private static int gcdOf2Numbers(int i, int j) {
		int gcd = 1;
		for ( int divisor = 2; divisor<=i&& divisor <= j;  ) {
			if ( i%divisor == 0 && j%divisor == 0) {
				gcd = gcd * divisor;
				i = i / divisor;
				j = j / divisor;
			}
			else 
				divisor ++;
			
		}
	
		return gcd;
	}

}
