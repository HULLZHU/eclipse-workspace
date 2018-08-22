import java.util.*;
import javafx.geometry.Point2D;
public class PE_09_05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first points.");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println("Enter the second point.");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		Point2D p1 = new Point2D(x1,y1);
		Point2D p2 = new Point2D(x2,y2);
		
		System.out.println("The distance between 2 points is :" + p1.distance(p2));
		System.out.println("P1 £º"+ p1.toString());
		System.out.println("P2:" + p2.toString());
		

	}

}