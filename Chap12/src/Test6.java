
public class Test6 {

	public static void main(String[] args) {
		try {
			method();
			System.out.println("after the method call");
		}
		
		catch (RuntimeException ex) {
			System.out.println("RuntimeException in main.");
		}
		
		catch(Exception ex) {
			System.out.println("Exception in main");
		}
		
	}

	private static void method() throws Exception {
			String s = "abc";
			System.out.println(s.charAt(3));
	}

}
