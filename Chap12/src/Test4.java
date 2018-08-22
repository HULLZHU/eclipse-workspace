
public class Test4 {

	public static void main(String[] args) {
		try {
			System.out.println(1/0);
		}
		catch ( Exception ex) {
			System.out.println(ex.getMessage());
			System.out.println(ex.toString());
			ex.printStackTrace();
			
		}
		
		
	}

}
