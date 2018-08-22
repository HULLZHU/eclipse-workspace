
public  class SimpleCircle {
	// we can test a class by simply adding a main method in the same class
	public static void main(String args[]) {
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("The area of "+ circle1.radius +" is "+ circle1.getArea());
	}
	double radius;
	//如果调用该类时候，括号内传递参数，则默认radius=1作为默认参数
	SimpleCircle(){
		radius = 1;
	}
	//如果调用该类的时候，括号内含有参数，则将括号内的参数作为参数来进行实例化
	SimpleCircle(double newRadius){
		radius = newRadius;
	}
	
	 double getArea() {
		return radius*radius*Math.PI;
	}
	double getPerimeter() {
		return radius*2*Math.PI;
	}
	void setRadius(double newRadius) {
		radius = newRadius;
	
}
	
	public static double getArea(double r) {
		return r*r*Math.PI;
	}
}
