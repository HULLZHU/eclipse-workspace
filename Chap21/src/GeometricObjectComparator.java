import java.io.Serializable;
import java.util.Comparator;

public class GeometricObjectComparator implements Comparator<GeometricObject>,Serializable{
	@Override
	public int compare(GeometricObject o1, GeometricObject o2) {
		if ( o1.getArea()  >  o2.getArea())
			return 1;
		else if (o1.getArea() < o2.getArea())
			return -1;
		return 0;
	}}
