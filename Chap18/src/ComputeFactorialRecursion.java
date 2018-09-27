
public class ComputeFactorialRecursion {

	public static void main(String[] args) {
		
	}
	
	public static long factorial(int n ) {
		return factorial(n,1);
	}
	
	public static long factorial(int n, int result) {
		if (n==0)
			return 1;
		else
			return factorial(n-1,n*result);
	}

}
