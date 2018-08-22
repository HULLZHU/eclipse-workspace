
public class Test7 {

	public static void main(String[] args) {
		System.out.println(isNumeric(2.0+""));
		
	}
	
	public static boolean isNumeric(String s) {
		try {
			Double.parseDouble(s);
		}
		catch ( NumberFormatException ex){
			return false;
		}
		return true;
	}

}
