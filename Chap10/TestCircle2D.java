public class TestCircle2D {
	public static void main(String[] args) {
		Circle2D circle1 = new Circle2D(2,2,8);
		Circle2D circle2 = new Circle2D(-8,-8,100);
		System.out.println(circle1.isOverLapped(circle2));
	}
}
