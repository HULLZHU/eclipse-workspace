
public class MyPoint {
	private double x ;
	private double y ;
	public MyPoint() {
		x  = 0;
		y =  0;
	}
	
	public MyPoint(double newX, double newY) {
		this.x = newX;
		this.y = newY;
	}
	
	public double getX () {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	//求该到原点的距离
	public double distance(double newX, double newY) {
		return Math.sqrt((this.x - newX)*(this.x - newX)+(this.y-newY)*(this.y-newY));
	}
	
	public double distance ( MyPoint temp) {
		return Math.sqrt((this.x - temp.getX())*(this.x - temp.getX())+(this.y-temp.getY())*(this.y-temp.getY()));
	}
	
}
