
public class ComparableRectangle extends Rectangle implements Comparable<ComparableRectangle> {
	
	public ComparableRectangle (double length,double width) {
		super(length,width);
	}
	@Override
	public int compareTo(ComparableRectangle o) {
		if (this.getArea()>o.getArea())
			return 1;
		else if ( this.getArea()<o.getArea())
			return -1;
		else 
			return 0;
	}
	
	public String toString() {
		return "The area is : " + this.getArea();
	}
	

}
