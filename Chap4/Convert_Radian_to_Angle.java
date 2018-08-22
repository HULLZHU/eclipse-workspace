import java.util.*;

public class Convert_Radian_to_Angle {

	public static void main(String[] args) {
		
		System.out.println("Please input the angle in radian");
		
	    Scanner input = new Scanner(System.in);
	    
	    double degree_in_radian = input.nextDouble();
	    
	    double degree_in_angle = Math.toDegrees(degree_in_radian)%360;
	    
	    System.out.println(" The angle in angle is " + degree_in_angle );
		// TODO Auto-generated method stub

	}

}
