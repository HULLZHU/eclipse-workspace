
public class TestStackOfInteger {

	public static void main(String[] args) {
		StackOfIntergers stack = new StackOfIntergers();
		for ( int i = 0 ; i < 10 ; i ++ ) {
			stack.push(i);
		}
		
		while ( !stack.empty())
			System.out.print(stack.pop()+" ");
		// TODO Auto-generated method stub

	}

}
