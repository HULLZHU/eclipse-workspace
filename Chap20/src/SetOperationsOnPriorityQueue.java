import java.util.Arrays;
import java.util.PriorityQueue;

public class SetOperationsOnPriorityQueue {
	public static void main(String[]args) {
		PriorityQueue<String> queue1 = new PriorityQueue<String>();
		PriorityQueue<String> queue2 = new PriorityQueue<String>();
		
		queue1.offer("George");
		queue1.offer("Jim");
		queue1.offer("John");
		queue1.offer("Blake");
		queue1.offer("Kevin");
		queue1.offer("Michael");
		
		queue2.offer("George");
		queue2.offer("Katie");
		queue2.offer("Kevin");
		queue2.offer("Michelle");
		queue2.offer("Ryan");
		
		System.out.println(queue1);
		System.out.println(queue2);
		
	
		//get union
		queue1.addAll(queue2); 
		System.out.println(queue1);
		queue1 = new PriorityQueue<String>(Arrays.asList(
		        new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
		//get difference
		queue1.removeAll(queue2); 
		System.out.println(queue1);
		queue1 = new PriorityQueue<String>(Arrays.asList(
		        new String[]{"George", "Jim", "John", "Blake", "Kevin", "Michael"}));
		//get intersection
		queue1.retainAll(queue2);
		System.out.println(queue1);
		 
	}
}
