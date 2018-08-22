
public class TestMyInteger {

	public static void main(String[] args) {
		MyInteger num = new MyInteger(10);
		System.out.println(num.isEven()+" "+num.isOdd()+" "+num.isPrime());
		int m = 7;
		System.out.println(MyInteger.isEven(m) +" "+ MyInteger.isEven(m)+" "+MyInteger.isPrime(m));
		char [] chr = {'1','2','3'};
		System.out.println(MyInteger.parseInt("123"));
		System.out.println(MyInteger.parseInt(chr));
		
		
	}

}
