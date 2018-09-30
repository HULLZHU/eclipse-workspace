import java.io.File;
import java.io.FileNotFoundException;
import java.util.PriorityQueue;
import java.util.Scanner;

public class AlphabeticallyReadingText {
	public static void main(String[]args) throws FileNotFoundException {
		File file = new File("test.txt");
		Scanner input = new Scanner(file);
		String words = "";
		PriorityQueue<String> queue = new PriorityQueue();
		while ( input.hasNext()) {
			queue.offer(input.next());
		}
		input.close();
		
		while ( !queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
	}
}
