
public class Circle extends Geometric {
	double radius;
	
	Circle(){
		
	}
	
	Circle( double radius){
		this.radius = radius;
	}
	
	public boolean equals(Circle circle) {
		return this.radius == circle.radius;
	}
}
