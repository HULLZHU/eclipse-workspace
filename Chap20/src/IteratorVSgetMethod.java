import java.util.Iterator;
import java.util.LinkedList;

public class IteratorVSgetMethod {
	public static void main(String[]args) {
		LinkedList<Double> list = new LinkedList<>();
		for ( int i = 0;  i < 1000; i ++ ) {
			list.add(Math.random());
		}
		
		double milli0 = System.currentTimeMillis();
		for ( int i = 0 ; i < list.size() ; i ++) {
			System.out.println(list.get(i));
		}
		double milli1 = System.currentTimeMillis();
		
		Iterator<Double> iterator = list.iterator();
		double milli2 = System.currentTimeMillis();
		while ( iterator.hasNext()) {
			System.out.println(iterator.next());
		} 
		double milli3 = System.currentTimeMillis();
		
		System.out.println("For get:"+(milli1 - milli0));
		System.out.println("For iterator:"+(milli3 - milli2));
		
	}

}
