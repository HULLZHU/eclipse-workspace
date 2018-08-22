
public class PassingObjectsToMethods {

	public static void main(String[] args) {
		CircleWithPrivateDataField myCircle = new CircleWithPrivateDataField(5);
		myCircle.setRadius(6.5);
		printCircle(myCircle);
		
		// TODO Auto-generated method stub

	}

	private static void printCircle(CircleWithPrivateDataField myCircle) {
		System.out.println("The radius is : " + myCircle.getRadius() +" and the area is "+ myCircle.getArea());
		
	}

}
