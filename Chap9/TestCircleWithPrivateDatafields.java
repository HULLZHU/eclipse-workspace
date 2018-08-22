
public class TestCircleWithPrivateDatafields {

	public static void main(String[] args) {
		CircleWithPrivateDataField myCircle = new CircleWithPrivateDataField(5);
		System.out.println("The area of the circle of radius "+ myCircle.getRadius()+" is "+myCircle.getArea());
	    myCircle.setRadius(myCircle.getRadius()*1.1);
	    System.out.println("The area of the circle of radius" + myCircle.getRadius() + " is " +myCircle.getArea());
	    System.out.println("The number of objects created is "+ CircleWithPrivateDataField.getNumberOfObjects());
	    System.out.println(myCircle.getRadius());
        
	}

}
