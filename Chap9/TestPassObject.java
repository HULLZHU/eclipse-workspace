
public class TestPassObject {

	public static void main(String[] args) {
		CircleWithPrivateDataField myCircle = new CircleWithPrivateDataField(1);
		int n = 6;
		printAreas(myCircle,n);
		
		System.out.println("\n"+"Radius is "+ myCircle.getRadius());
		System.out.println("n is "+ n );

	}

	private static void printAreas(CircleWithPrivateDataField myCircle, int n) {
		System.out.println("Radius\t\tArea");
		while ( n >=1 ) {
			System.out.println(myCircle.getRadius()+"\t\t"+myCircle.getArea());
			myCircle.setRadius(myCircle.getRadius()+1);
			n--;
		}
		
	}

}
