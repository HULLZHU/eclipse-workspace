
public class FinalTest {

	public static void main(String[] args) {
		String s = "Java";
		StringBuilder builder = new StringBuilder(s);
		change(s,builder);
		System.out.println(s);
		System.out.println(builder);
		

	}

	private static void change(String s, StringBuilder builder) {
		s = s + " and HTML";
		builder = builder.append(" and HTML");
		
	}

}
