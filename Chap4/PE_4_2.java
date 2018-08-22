import java.util.Scanner;

public class PE_4_2 {

	public static void main(String[] args) {
		
		System.out.println("Now please enter the latitude and longitude \n of two points on the earth in degrees");
		
		Scanner input = new Scanner(System.in);
		
		double latitude_in_degree = input.nextDouble();
		
		double altitude_in_degree = input.nextDouble();
		
        double latitude_in_degree2 = input.nextDouble();
		
		double altitude_in_degree2 = input.nextDouble();
		
		double latitude = Math.toRadians(latitude_in_degree);
		
		double altitude = Math.toRadians(latitude_in_degree);
		
        double latitude2 = Math.toRadians(latitude_in_degree);
		
		double altitude2 = Math.toRadians(latitude_in_degree); 
		
		double d = 6371.01 * Math.acos(Math.sin(latitude)*Math.sin(latitude2))+Math.cos(altitude)*Math.cos(altitude2)*Math.cos(altitude-altitude2);
		
		System.out.printf("The distance between the two point is %.2f km",d);
		
		
	}

}
