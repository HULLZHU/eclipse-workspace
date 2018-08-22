
public class Test8 {

	public static void main(String[] args)  {
		try {
			System.out.println(1/2);
			System.out.println(1/0);
			System.out.println(1/3);
		}
		
		catch (IllegalArgumentException ex) {
			System.out.println("IllegalArgumentException caught");
		}
		catch (ArithmeticException ex) {
			System.out.println("Arithmetic Exception caught.");
			throw new ArithmeticException("ArithmenticException with chainded exception");
		}
		finally {
			System.out.println("This is the final statement.");
		}
		System.out.println("This is the statment after final statement.");
	}

}
