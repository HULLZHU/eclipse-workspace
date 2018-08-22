import java.util.ArrayList;

public class ArrayListCloneTest {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		list.add("New York");
		ArrayList<String> list1 = list;
		ArrayList<String> list2 = (ArrayList<String>)(list.clone());
		list.add("Atlanta");
		System.out.println(list == list1);
		System.out.println(list == list2);
		System.out.println("list : "+ list);
		System.out.println("list1 : "+ list1);
		System.out.println("list2 : " + list2);
		
		
		
		

	}

}
