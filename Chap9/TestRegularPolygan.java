
public class TestRegularPolygan {

	public static void main(String[] args) {
		RegularPolygon myPolygon = new RegularPolygon(6,4,3.6,9.8);
		System.out.print("Area:");
		System.out.printf("%4.2f\n",myPolygon.getArea());
		System.out.println("X : " +myPolygon.getXCoordinate()+" Y: "+ myPolygon.getYCoordinate());
		
		

	}

}
