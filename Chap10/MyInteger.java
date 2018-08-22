
public class MyInteger {
	private int value;
	
	public MyInteger(){
		System.out.println("Please enter a value.");
		System.exit(0);
	}
	
	public MyInteger(int newValue){
		value = newValue;
	}
	
	public int getMyInteger() {
		return value;
	}
	
	public boolean isOdd() {
		if ( isOdd(value))
			return true;	
		return false;
	}
	
	public static boolean isOdd(int value2) {
		if ( value2%2==0)
			return false;
		return true;
	}

	public boolean isEven() {
		if(isEven(value))
			return true;
		return false;
	}
	
	public static boolean isEven(int value2) {
		if ( value2 % 2== 1)
			return false;
		return true;
	}

	public boolean isPrime() {
		if ( isPrime(value))
			return true;
		return false;
	}

	public static boolean isPrime(int value2) {
		for ( int i = 2; i < value2/2; i ++ ) {
			if ( value2 % i == 0)
				return false;
		}
		return true;
	}
	
	public static boolean isEven( MyInteger i) {
		int temp = i.getMyInteger();
		if ( isPrime(temp) )
			return true;
		return false;
	}
	
	public static boolean isOdd(MyInteger i ) {
		int temp = i.getMyInteger();
		if ( isOdd(temp))
			return true;
		return false;
	}
	
	public static boolean isPrime(MyInteger i ) {
		int temp = i.getMyInteger();
		if ( isPrime(i))
			return true;
		return false;
	}
	
	public boolean equals(int num ) {
		if ( num == this.value)
			return true;
		return false;
	}
	
	public boolean equals(MyInteger i ) {
		if ( i.getMyInteger() == this.value)
			return true;
		return false;
	}
	
	public static int parseInt(char[] array) {
		StringBuilder temp = new StringBuilder("");
		temp = temp.append(array);
		String s1 = temp.toString();
		int num =Integer.parseInt(s1);
		return num;
	}
	
	public static int parseInt(String s1) {
		return Integer.parseInt(s1);
	}
}
