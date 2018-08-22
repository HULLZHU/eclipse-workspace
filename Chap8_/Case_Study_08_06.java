import java.util.*;
public class Case_Study_08_06 {

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("How many point do you have?");
		int rows  =  input.nextInt();
		int columns =2;
		double[][] points = new double[rows][columns];
		//locate the points
		System.out.println("Please input their coordinates");
		for ( int i = 0; i < rows ; i ++) {
			for ( int j = 0; j < columns; j++) {
				points[i][j] = input.nextDouble();
			}
		}
		//display the points
		for( int i = 0; i <points.length;i++){
			for (int j =0; j<points[i].length;j++) {
				System.out.print(" "+points[i][j]);
				if ( j==1)
				  System.out.println("");
			}
	
		}
		
		int p1 = 0;
		int p2 = 1;
		double currentMin = distance(points[p1][0],points[p1][1],points[p2][0],points[p2][1]);
		for ( int i = 0 ; i < points.length-1;i++) {
			for ( int j = i + 1 ;j<points.length;j++) {
				double distance = distance(points[i][0],points[i][1],points[j][0],points[j][1]);
				if ( currentMin > distance) {
					p1 = i;
					p2 = j;
					currentMin = distance;
				}
			}
		}
		System.out.println("The closesr two points are "+ "("+points[p1][0]+","+points[p1][1]+")"+"and"+"("+points[p2][0]+","+points[p2][1]+")");

	}

	private static double distance(double x1, double y1, double x2, double y2) {
		// TODO Auto-generated method stub
		return Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
	}

}
