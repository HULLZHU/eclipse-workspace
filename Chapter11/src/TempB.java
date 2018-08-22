
public class TempB extends SimpleCircle {
	public static void main ( String [] args) {
		System.out.println(new SimpleCircle(2));
	}
	private double length;
	
	TempB(double radius, double length){
		super(radius);
		this.length = length;	
	}
	
	@Override
	public double getArea() {
		return getArea()*length;
	}

}
