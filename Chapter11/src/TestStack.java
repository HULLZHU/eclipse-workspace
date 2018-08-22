import java.util.Scanner;

public class TestStack {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    
	    MyStack stack = new MyStack();
	    
	    for (int i = 0; i < 5; i++)
	      stack.push(input.nextLine());
	    
	    System.out.println(stack.getSize() + " strings are: ");
	    while (!stack.isEmpty()) {
	      System.out.println(stack.pop());
	      }

	}

}
