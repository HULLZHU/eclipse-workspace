
public class TestComparableGeometricObject {

	public static void main(String[] args) {
		GeometricObject rec1 = new Rectangle(2,2);
		GeometricObject rec2 = new Rectangle(2,3);
		Rectangle rec3 = new Rectangle();
		GeometricObject circle1 = new Circle(2);
		GeometricObject circle2 = new Circle(3);
		System.out.println(rec1.compareTo(circle2));
		System.out.println(circle1.compareTo(circle2));
		System.out.println(circle2.compareTo(rec1));
		System.out.println(rec3.howToColor());
		System.out.println(rec1.howToColor());
		System.out.println(circle1.howToColor());
		circle1.equals(circle2);

	}

}
