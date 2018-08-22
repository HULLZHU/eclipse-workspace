
public class CircleWithStaticMembers {
	double radius;
	
	public static int numberOfObjects = 0;
	
	CircleWithStaticMembers(){
		radius=1;
		numberOfObjects++;
	}
	
	CircleWithStaticMembers(double newRadius){
		radius = newRadius;
		numberOfObjects++;
	}
	
	static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	double getArea() { 
		return Math.PI*radius*radius;
	}

}
