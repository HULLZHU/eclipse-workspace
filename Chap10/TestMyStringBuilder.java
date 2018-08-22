
public class TestMyStringBuilder {

	public static void main(String[] args) {
		MyStringBuilder s1 = new MyStringBuilder("zhuhe");
		MyStringBuilder s2 = new MyStringBuilder("Linziqi");
		MyStringBuilder s3 = s1.append(s2);
		System.out.println(s3.toString());
		System.out.println(s1.charAt(2));
		System.out.println(s1.reverse());
		MyStringBuilder newS = s1.insert(s2, 1);
		System.out.println(newS.toString());

	}

}
