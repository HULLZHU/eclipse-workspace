import java.util.ArrayList;
// MyStack.java: Implementing a stack using inheritance
class MyStack extends ArrayList<Object> {
  public boolean isEmpty() {
    return super.isEmpty();
  }

  public int getSize() {
    return super.size();
  }

  public Object peek() {
    return super.get(getSize() - 1);
  }

  public Object pop() {
	  Object temp = get(getSize()-1);
      remove(getSize() - 1);
      return temp;
  }

  public Object push(Object o) {
    super.add(o);
    return o;
  }

  public int search(Object o) {
    return indexOf(o);
  }

  public String toString() {
    return "stack: " + toString();
  }
}
