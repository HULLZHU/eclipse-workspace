
 class CircleWithPrivateDataField {

    private double radius = 1;
	private static int numberOfObjects= 0;
	
	public CircleWithPrivateDataField() {
		numberOfObjects++;
	}
	
	public CircleWithPrivateDataField( double newRadius) {
		radius = newRadius;
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = (newRadius>=0)?newRadius:0;
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea(){
		return radius*radius*Math.PI;
	}
	
	public static void main(String[] args) {
		CircleWithPrivateDataField  myCircle = new CircleWithPrivateDataField();
		System.out.println(myCircle.radius);
	}

}
