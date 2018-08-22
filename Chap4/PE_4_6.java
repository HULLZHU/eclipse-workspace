
public class PE_4_6 {

	public static void main(String[] args) {
		
		System.out.println("Now generate three random point on the circle ");
		
		double random_angle = 2*Math.PI*Math.random();
		
		double random_angle2 = 2*Math.PI*Math.random();
		
		double random_angle3 = 2*Math.PI*Math.random();
		
		double x1 = 40 * Math.cos(random_angle);
		
		double x2 = 40 * Math.cos(random_angle2);
		
		double x3 = 40 * Math.cos(random_angle3);
		
		double y1 = 40 * Math.sin(random_angle);
		
		double y2 = 40 * Math.sin(random_angle2);
		
		double y3 = 40 * Math.sin(random_angle3);
		
		double d12 = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		
		double d23 = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		
		double d13 = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
		
		double angle_1 = Math.acos((d12*d12+d13*d13-d23*d23)/(2*d12*d13));
		
		double angle_2 = Math.acos((d12*d12+d23*d23-d13*d13)/(2*d12*d13));
		
		double angle_3 = Math.acos((d23*d23+d13*d13-d12*d12)/(2*d13*d23));
		
		System.out.printf("The coordinate of three points are \n(%.2f,%.2f)\n (%.2f. %.2f)\n (%.2f,%.2f)\n",x1,y1,x2,y2,x3,y3);
		
		System.out.printf("The angle of this triangle is %.2f , %.2f and %.2f",angle_1, angle_2, angle_3);
		
		
		// TODO Auto-generated method stub

	}

}
