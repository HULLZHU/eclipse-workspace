
public class Test {
	private String text;
	public Test(String s) {
		 text = s;
	}
	public String getText() {
		return text;
	}
	public static void main(String[] args) {
		Test test = new Test("ABC");
		System.out.println(test);

	}

}
