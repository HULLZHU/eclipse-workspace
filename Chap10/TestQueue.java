
public class TestQueue {

	public static void main(String[] args) {
		Queue myQueue = new Queue();
		myQueue.push(2);
		myQueue.push(3);
		myQueue.push(1);
		myQueue.push(8);
		//int[] temp = myQueue.getElements();
		//for ( int i = 0; i < temp.length ; i ++ ) {
			//System.out.print(temp[i]);
		//}
		for ( int i = 0 ; i < myQueue.getSize(); i ++ ) {
			System.out.println(myQueue.pop());
		}
		
	}

}
