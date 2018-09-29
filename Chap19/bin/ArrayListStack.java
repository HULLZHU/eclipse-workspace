import java.util.ArrayList;

public class ArrayListStack<E> extends ArrayList<E> {
	
	public int getSize() {
		return this.size();
	}
	
	public E peek() {
		return this.get(this.size()-1);
	}
	
	public void push(E o) {
		this.add(o);
	}
	
	public E pop() {
		E o  = this.get(this.getSize()-1);
		this.remove(this.size()-1);
		return o;
	} 
	
	public boolean isEmpty() {
		return this.isEmpty();
	}
	
	public String toString() {
		return this.toString();
	} 
	
	
	//the method to make list without duplicate numbers
	public void removeDuplicates() {
		for ( int i = 0 ; i < this.size() -1 ; i ++ ) {
			for ( int j = i + 1 ; j < this.size(); j ++) {
				if (this.get(i)== this.get(j)) {
					this.remove(j);
				}
			}
		}
	}
	
	/** main method */
	
	public static void main(String[]args) {
		ArrayListStack<Integer> list = new ArrayListStack<>();
		list.push(10);
		list.push(8);
		list.push(8);
		list.push(6);
		list.removeDuplicates();
		System.out.println(list.pop());
		System.out.println(list.pop());
		System.out.println(list.pop());
	}

}
