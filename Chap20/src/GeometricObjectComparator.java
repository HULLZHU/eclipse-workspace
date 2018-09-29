import java.util.Comparator;

public class GeometricObjectComparator implements Comparator<GeometricObject>, java.io.Serializable,Comparable<GeometricObject> {

	@Override
	public int compare(GeometricObject o1, GeometricObject  o2) {
		if(o1.getArea() > o2.getArea())
			return 1;
		else if ( o1.getArea() == o2.getArea())
			return 0;
		else
			return -1;
	}

	@Override
	public int compareTo(GeometricObject arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

}
