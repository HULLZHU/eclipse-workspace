
public class MyGenericStack<E> {
	@SuppressWarnings("unchecked")//the compiler is not sure whether this casting will succeed in runtime
	private E[] elements =  (E[])new Object[10];
	private int length = 0;
	
	public int getSize() {
		int size = 0;
		for ( int i = 0 ; i < elements.length ; i ++ ) {
			if ( elements != null)
				size ++ ;
		}
		return size;
	}
	
	public E peek() {
		return elements[length - 1 ];
	}
	
	public void push(E o) {
		length ++ ;
		elements[length - 1] = o; 
	}
	
	public boolean isEmpty() {
		for ( int i = 0 ; i < elements.length ; i++) {
			if (elements[i]!= null)
				return false;
		}
		return true;
	}

	public String toString() {
		String str = "";
		for ( int i = 0 ; i < elements.length ; i ++) {
			if (elements[i] != null)
				str += elements[i].toString() + " ";
		}
		
		return str;
	}
}
