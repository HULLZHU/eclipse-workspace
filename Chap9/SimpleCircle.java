
public  class SimpleCircle {
	// we can test a class by simply adding a main method in the same class
	public static void main(String args[]) {
		SimpleCircle circle1 = new SimpleCircle();
		System.out.println("The area of "+ circle1.radius +" is "+ circle1.getArea());
	}
	double radius;
	//������ø���ʱ�������ڴ��ݲ�������Ĭ��radius=1��ΪĬ�ϲ���
	SimpleCircle(){
		radius = 1;
	}
	//������ø����ʱ�������ں��в������������ڵĲ�����Ϊ����������ʵ����
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
