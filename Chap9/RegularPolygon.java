
public class RegularPolygon {
	private int n = 3;//number of sides
	private double side = 1;//length of each side
	private double x = 0;//coordinate of X
	private double y = 0 ;// coordinate of Y
	
	public RegularPolygon(){
		
	};
	
	public RegularPolygon(int n , double side){
		this.n= n;
		this.side =side;
	}
	
	public RegularPolygon(int n , double side, double newX, double newY) {
		this( n, side);
		this.setXCoordinate(newX);
		this.setYCoordinate(newY);
	}
	
	public void setNumberOfSides(int n ) {
		this.n= n;
	}
	
	public int getNumberOfSides() {
		return n;
	}
	
	public void setLengthOfSide(double side) {
		this.side = side;
	}
	
	public double getLengthOfSide() {
		return this.side;
	}
	
	public double getXCoordinate() {
		return x;
	}
	
	public void setXCoordinate(double x) {
		this.x = x;
	}
	public double getYCoordinate() {
		return y;
	}
	
	public void setYCoordinate(double Y) {
		this.y = Y;
	}
	
	public double getArea() {
		return n*side*side/(4*Math.tan(Math.PI/4));
	}

}
