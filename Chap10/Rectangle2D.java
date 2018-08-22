
public class Rectangle2D {
	private double x = 0; 
	private double y = 0;
	private double height = 0;
	private double width = 0 ;
	
	public Rectangle2D() {
		
	}
	public Rectangle2D(double x, double y , double height, double width ) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
	}
	
	public double getArea() {
		return height*width;
	}
	
	public double getPerimeter() {
		return 2*(height + width );
	}
	
	public boolean contains( MyPoint newPoint) {
		MyPoint p1 = new MyPoint(x+width/2,y+height/2);
		MyPoint p2 = new MyPoint(x-width/2,y+height/2);
		MyPoint p3 = new MyPoint(x-width/2,y-height/2);
		MyPoint p4 = new MyPoint(x+width/2,y-height/2);
		if( newPoint.getX()<p1.getX()&&newPoint.getX()>p2.getX()&&newPoint.getY()<p1.getY()&&newPoint.getY()>p3.getY())
			return true;
		else
			return false;
	}
	public double getCenterX() {
		return x;
	}
	public double getCenterY() {
		return y;
	}
	public double getHeight() {
		return height;
	}
	public double getWidth() {
		return width;
	}
	public boolean contains(Rectangle2D newRectangle) {
		MyPoint newP1= new MyPoint(newRectangle.getCenterX()+newRectangle.getHeight()/2,newRectangle.getCenterY()+newRectangle.getHeight()/2);
		MyPoint newP2 = new MyPoint(newRectangle.getCenterX()-newRectangle.getHeight()/2,newRectangle.getCenterY()+newRectangle.getHeight()/2);
		MyPoint newP3 = new MyPoint(newRectangle.getCenterX()-newRectangle.getHeight()/2,newRectangle.getCenterY()-newRectangle.getHeight()/2);
		MyPoint newP4 = new MyPoint(newRectangle.getCenterX()+newRectangle.getHeight()/2,newRectangle.getCenterY()-newRectangle.getHeight()/2);
		if (this.contains(newP1)&&this.contains(newP2)&&this.contains(newP3)&&this.contains(newP4))
			return true;
		else
			return false;
	}
	
}
