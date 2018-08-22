package demo;

public class RandomCoordinate {

	public static void main(String[] args) {
		
		System.out.println("Now display a random coordinate");
		
		int x = (int) (50 - 100*Math.random());
		
		int y = (int) (100 - 200*Math.random());
		
		System.out.println("The coordinate should be ("+x+","+y+")");
		
	}

}
