
public class TestRectangle {

	public static void main(String[] args) {
		Rectangle myRectangle = new Rectangle(2,4);
		System.out.println("The area of the rectangle is "+ myRectangle.getArea());
		System.out.println("The area of the rectangle is " + myRectangle.getPerimeter() );
        System.out.println("The count is "+ Rectangle.count);
	}

}
