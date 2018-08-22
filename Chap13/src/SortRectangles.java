import java.util.*;
public class SortRectangles {
	public static void main(String [] args) {
		ComparableRectangle[] myRectangles = {new ComparableRectangle(1,2),new ComparableRectangle(2,3),
				new ComparableRectangle(2,9)};
		Arrays.sort(myRectangles);
		
		for (Rectangle rectangle : myRectangles) {
			System.out.println(rectangle+ " ");
			System.out.println("");
		}
	}

}
