
public class StackOfIntergers {
	//Data Field
	private int[] elements;
	private int size;// the number of integers in the stack; the default value of size = 0
	private final static int DEFAULT_CAPACITY = 16;
	//Constructors
	//summary of this programming procedure
	//first: construct an stack with the capacity of a default number or a specified number
	//second: add the value to the stack
	//third : check if the number of value is too much to overflow the limitation of the stack
	//fourth: if true, expand the capacity twice to continue the value assignment
	//fifth : assignment is over until all the value are assigned to the elements[];
	public StackOfIntergers(){
		this(DEFAULT_CAPACITY);
	}// construct an empty 
	
	public StackOfIntergers(int newCapacity){
		elements = new int[newCapacity];
	}
	
	public void push(int value) {
		if ( size >= elements.length) {
			int[] temp= new int[elements.length *2];
		System.arraycopy(elements, 0, temp, 0, elements.length);
		elements = temp;
		}
		elements[size]= value;
		size ++;
	}
	//return and remove the top element from stack
	public int pop() {
		return (--size);
	
	}
	//return the top element from stack
	public int dequeue() {
		int temp = elements[0];
		//shift the array left to right
		for ( int i = 0; i < size-1; i ++ ) {
			elements[i] = elements[ i + 1];
		}
		size -- ;
		return temp;
	}
	
	public boolean empty() {
		return (size==0);
	}
	
	public int getSize() {
		return size;
	}
	public int[] getElements() {
		return elements;
	}
	

	
}
