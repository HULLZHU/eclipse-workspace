import java.util.*;
public class PE_08_21 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println("How many cities do you have ?");
		double[][] cities = new double[input.nextInt()][2];
		System.out.println("Please locate cities.");
		for ( int i = 0; i < cities.length; i ++ ) {
			for ( int j = 0; j < cities[i].length; j++ ) {
				cities[i][j] = input.nextDouble();
			}
		}
		System.out.println("X axis  Y axis.");
		printTable( cities);
		int centerCity = 0;
		double minDistance = distanceToOtherCities(cities[0][0],cities[0][1],cities);
		for ( int i = 1; i < cities.length; i++ ) {
			if ( minDistance>distanceToOtherCities(cities[i][0],cities[i][1],cities)) {
				centerCity = i;
				minDistance = distanceToOtherCities(cities[i][0],cities[i][1],cities);
			}
		}		
		System.out.println("The center city is city" + centerCity +" and the distance to other cities is "+minDistance);
	}
	private static double distanceToOtherCities(double d, double e, double[][] cities) {
		double distance = 0;
		for ( int i = 0; i < cities.length ; i ++ ) {
				distance = distance+ distance(d,e, cities[i][0],cities[i][1]);
		}
		return distance;
	}
	private static double distance(double d, double e, double f, double g) {
		double distance = Math.sqrt((d-f)*(d-f)+(e-g)*(e-g));
		return distance;
	}
	private static void printTable(double[][] cities) {
		for ( int i = 0; i < cities.length; i ++ ) {
			for ( int j = 0; j < cities[i].length; j ++ ) {
				System.out.print(" "+cities[i][j]+" ");
				if ( j == 1)
					System.out.println("");
			}
		}	
	}
}
