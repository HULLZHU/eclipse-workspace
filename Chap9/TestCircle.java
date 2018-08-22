
public class TestCircle {

	public static void main(String[] args) {
		CircleTest circle1 = new CircleTest(1);
		CircleTest circle2 = new CircleTest(2);
		
		swap1(circle1,circle2);
		System.out.println("After swap1, circle1 = "+ circle1.radius +" circle2 = "+ circle2.radius);
		swap2(circle1, circle2);
		System.out.println("After swap2, circle1 = " +circle1.radius + " circle2= "+circle2.radius);
	}


	private static void swap1(CircleTest circle1, CircleTest circle2) {
		CircleTest temp = circle1;
		circle1 = circle2;
		circle2 = temp;
	}
	
	private static void swap2(CircleTest circle1, CircleTest circle2) {
		double temp = circle1.radius;
		circle1.radius = circle2.radius;
		circle2.radius = temp;
	}

}
