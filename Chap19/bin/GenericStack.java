import java.util.*;
public class GenericStack<E> {
	private ArrayList<E> list = new ArrayList<>();
	 
	public int getSize() {
		return list.size();
	}
	
	public E peek() {
		return list.get(getSize()-1);
	}
	
	public void push(E o) {
		list.add(o);
	}
	
	public E pop() {
		E o = list.get(this.getSize()-1);
		list.remove(this.getSize() - 1);
		return o;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	@Override
	public String toString() {
		return "stack:"+list.toString();
	}


	//////////////////////////////////main method for test //////////////////////////
	
	public static void main(String[]args) {
		GenericStack<String> stack1 = new GenericStack<>();
		stack1.push("London");
		stack1.push("Peking");
		stack1.push("ShangHai");
		
		GenericStack<Integer> stack2 = new GenericStack<>();
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
	}
}
