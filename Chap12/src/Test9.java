
public class Test9 {
	public static void main(String[] args) {
		try {
			method();
			System.out.println("After the method call");
		}
		catch (InvalidRadiusException ex) {
			System.out.println("InvalidRadiusException in main");
		}
		catch (Exception ex) {
			System.out.println("Exception in main");
		}
	}
	static void method() throws Exception{
		try {
			CircleWithCustomException c1 = new CircleWithCustomException(1);
			c1.setRadius(-1);
			System.out.println(c1.getRadius());
		}
		catch (InvalidRadiusException ex)  {
			System.out.println("InvalidRadiusException in method()");
			throw new InvalidRadiusException(-1) ;
		}
		catch (Exception ex) {
		    System.out.println("Exception in method()");
		    throw ex;
		}
	}

}
