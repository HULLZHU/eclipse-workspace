public class Queue {
	private int[] elements;
	private int size ;// number of elements in queue
	private final int DEFAULT_CAPACITY = 16;
	private int i = 0;
	
	public Queue() {
		elements = new int[DEFAULT_CAPACITY];
	}
	
	public Queue(int capacity) {
		elements = new int[capacity];
	}
	
	public void push ( int newElement) {
		if ( size >= elements.length) {
			int []temp = new int[elements.length+1];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		elements[size] = newElement;
		size ++ ;
	}
	
	public int pop () {
		if ( i < size ) {
			i ++ ;
			return elements[i-1];
			}
		else
			return -9999;
	}
	
	public int peek() {
		return elements[0];
	}
	
	public boolean isEmpty() {
		if ( size == 0)
			return true;
		else
			return false;
	}
	
	public int[] getElements() {
		return elements;
	}
	
	public int getSize() {
		return size;
	}
	
}
