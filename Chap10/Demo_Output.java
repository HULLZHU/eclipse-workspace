
public class Demo_Output {

	public static void main(String[] args) {
		System.out.println(Integer.parseInt("10"));
		System.out.println(Integer.parseInt("10",10));
		System.out.println(Integer.parseInt("10",16));
		System.out.println(Integer.parseInt("11"));
		System.out.println(Integer.parseInt("11",10));
		System.out.println(Integer.parseInt("11",16));
		Integer x= 3;
		int y = new Integer(3)+ new Integer(4);
		Double num = 3.5;
		System.out.println(num.intValue());
		char[] list = {'1','c','d'};
		String s1 = new String(list);
	}

}
