import java.util.*;

public class Convert_Angle_to_Radian {

	public static void main(String[] args) {
		
		System.out.println("Please input the degree of angle");
		
		Scanner input = new Scanner(System.in);
		
		double angle_in_degree = input.nextDouble();
		
		double angle_in_radian = Math.toRadians(angle_in_degree);
		
		System.out.println(" The radian of angle is " + angle_in_radian  );


	}

}
