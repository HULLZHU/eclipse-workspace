
public class TestCloneableStack {
	public static void main(String args[]) throws CloneNotSupportedException {
		MyStack list = new MyStack();
		list.push(new Circle(1));
		list.push(new Rectangle(2,2));
		list.push(new Circle(3));
		System.out.println(list.toString());
		MyStack list2 = (MyStack) list.clone();
		System.out.println(list2);
		System.out.println(list.equals(list2));
		System.out.println(list==list2);
		
	}
}
