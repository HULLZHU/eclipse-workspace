import java.util.Comparator;

public class TestGeometricObject {
	public static void main(String[]args) {
		GeometricObject o1 = new Rectangle();
		GeometricObject o2 = new Rectangle();
		o1.setArea(100);
		o2.setArea(90);
		
		GeometricObject g = max(o1,o2,new GeometricObjectComparator());
		System.out.println(g.getArea());
	}

	private static GeometricObject max(GeometricObject o1, GeometricObject o2, Comparator<GeometricObject> c) {
		if ( c.compare(o1, o2) > 0)
			return o1;
		else
			return o2;
	}
}
