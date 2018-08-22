
public class TestBetweenCircleAndRectangle {

	public static void main(String[] args) {
		GeometricObjects circle = new Circle(2);
		GeometricObjects rectangle = new Rectangle(2,2);
		System.out.println(GeometricObjects.equalArea(circle, rectangle));
		System.out.println(GeometricObjects.equalPerimeter(circle, rectangle));

	}

}
