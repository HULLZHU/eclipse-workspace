import java.util.Arrays;
import java.util.PriorityQueue;

public class MyPriorityQueue<E> extends PriorityQueue<E> implements Cloneable{
	
	public static void main(String[]args) throws CloneNotSupportedException {
		MyPriorityQueue<String> queue = new MyPriorityQueue<String>();
		queue.addAll(Arrays.asList(new String[]{"Hello","Boy","I am your father"}));
		
		MyPriorityQueue<String> queue2 = (MyPriorityQueue<String>)(queue.clone());
		
		for ( String e : queue2) {
			System.out.println(e); 
		}
		

	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		MyPriorityQueue queue = new MyPriorityQueue();
		for ( E e : this ) {
			queue.offer(e);
		}
		return queue;
		
	}
}
