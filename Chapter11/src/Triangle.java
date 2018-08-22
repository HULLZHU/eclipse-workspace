
public class Triangle extends Geometric {
	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle() {	
	}
	public Triangle ( double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public double[] getSides() {
		double [] sides = new double[3];
		sides[0] = side1;
		sides[1] = side2;
		sides[2] = side3;
		return sides;
	}
	
	public double getArea() {
		double s = (side1 + side2 +side3)/2;
		double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
		return area;
	}
	
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	
	public String toString() {
		String s1 = "Filled :" + this.isFilled();
		String s2 = "Color :"+ this.getColor();
		String s3 = "Date Created :" + this.getDate().toString();
		String s4 = "Area :"+ this.getArea();
		String s5 = "Perimeter :"+ this.getPerimeter();
		String s0  = s1+"\n"+s2 +"\n"+s3+"\n"+s4+"\n"+s5;
		return s0;
	}
	
	public static void main(String args[]) {
		Triangle myTriangle = new Triangle();
		myTriangle.setColor("White");
		myTriangle.setFilled(true);
		System.out.println(myTriangle.toString());
		
	}
	
	
	

}
