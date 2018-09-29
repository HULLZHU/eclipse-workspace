import java.util.PriorityQueue;

public class PriorityQueueDemo {
	public static void main(String[]args) {
		PriorityQueue<String> queue1 = new PriorityQueue();
		queue1.offer("Oklahama");
		queue1.offer("Indiana");
		queue1.offer("Georgia");
		queue1.offer("Texas");
		
		System.out.println("Priority queue using Comparable ");
		while (queue1.size()>1) {
			System.out.print(queue1.remove() + " ");
		}
		
		PriorityQueue<String> queue2 = new PriorityQueue<>(4, java.util.Collections.reverseOrder());
		queue2.offer("Oklahoma");
		queue2.offer("Indiana");
		queue2.offer("Georgia");
		queue2.offer("Texas");
		
		System.out.println("\n Priority queue using Comparator");
		while ( queue2.size() > 0 ) {
			System.out.print(queue2.remove() + "  ");
		}
	}

}
