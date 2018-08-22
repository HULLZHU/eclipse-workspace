
public class CastingDemo {

	public static void main(String[] args) {
		Object object1 = new SimpleCircle(1);
		Object object2 = new SimpleRectangle(1,1);
		
		displayObject(object1);
		displayObject(object2);
	}

	private static void displayObject(Object object) {
		if ( object instanceof SimpleCircle) {
			System.out.println("Circle area is : " + ((SimpleCircle)object).getArea());
			System.out.println("Circle diameter is: " + ((SimpleCircle)object).getDiameter());
		}
		else if ( object instanceof SimpleRectangle) {
			System.out.println("Rectangle area is : " + ((SimpleRectangle)object).getArea());
			System.out.println("Rectangle perimeter is : " + ((SimpleRectangle)object).getPerimeter());
		}
		
	}

}
