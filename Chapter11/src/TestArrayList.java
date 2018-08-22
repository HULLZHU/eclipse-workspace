import java.util.ArrayList;
public class TestArrayList {

	public static void main(String[] args) {
		ArrayList<String> cityList = new ArrayList<>();
		cityList.add("London");
		cityList.add("Denver");
		cityList.add("Paris");
		cityList.add("Miami");
		cityList.add("Seoul");
		cityList.add("Tokyo");
		System.out.println("List Size : "  + cityList.size());
		System.out.println("Miami in the list? :" + cityList.contains("Miami"));
		System.out.println("Location of Denver is " + cityList.indexOf("Denver"));
		System.out.println("Empty: " + cityList.isEmpty());
		cityList.add(2, "Xian");
		cityList.remove("Miami");
		cityList.remove(1);
		System.out.println(cityList.toString());
		for ( int i = cityList.size()-1; i >= 0 ; i -- ) {
			System.out.println(cityList.get(i)+ " ");
		}
		System.out.println();
		
		ArrayList<SimpleRectangle> list = new ArrayList<>();
		list.add(new SimpleRectangle(2,1));
		list.add(new SimpleRectangle(3,1));
		
		System.out.println("The area of the circle  ?"+ list.get(0).getArea());
		

	}

}
