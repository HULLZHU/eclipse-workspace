import java.util.*;
public class Triangle {
	private double s1;
	private double s2;
	private double s3;
	
	public Triangle(double newS1, double newS2, double newS3) throws IllegalTriangleException {
		setSides(newS1,newS2,newS3);
		}
	
	public Triangle () throws IllegalTriangleException {
		this (1.0,1.0,1.0);
	}
	
	public void setSides(double newS1, double newS2, double newS3) throws IllegalTriangleException{
		
		try {
		if (newS1>0 && newS2>0 && newS3>0) {
			if(newS1+newS2<=newS3 || newS2+newS3<=newS1 || newS1+newS3 <=newS2)
				throw new IllegalTriangleException("The total length of any two sides should > the left one's length");
			s1 = newS1;
			s2 = newS2;
			s3 = newS3;
		}
		else
			throw new IllegalTriangleException("The sides should not be negative");
		}
		catch (Exception ex) {
			System.out.println("Please set sides again.");
			Scanner input = new Scanner(System.in);
			double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			double side3 = input.nextDouble();
			setSides(side1,side2,side3);
			//方法可以在方法内被自嵌套
		}
		
	}
	
	public static void main(String args[]) throws IllegalTriangleException {
		Triangle demo = new Triangle(1,2,3);
	}
	
	

}
