import java.util.ArrayList;
public class ObjectsArrayList {
	public static void main(String[]args) {
	ArrayList<Object> list = new ArrayList<>();
	list.add(new Circle());
	list.add(new Student());
	list.add(new Geometric());
	System.out.println(list.toString());
	}


}
