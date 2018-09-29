
public class BoundedTypeDemo {
	
	public static void main(String[]args) {
		GeometricObject obj1  = new Circle();
		GeometricObject obj2 = new Rectangle();
		obj1.setArea(10);
		obj2.setArea(11);
		System.out.println(equalArea(obj1,obj2));	
		}
	
	public static <E extends GeometricObject> boolean equalArea(E object1, E object2) {
		return object1.getArea() == object2.getArea();
	}
}
