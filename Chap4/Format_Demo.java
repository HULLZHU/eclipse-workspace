
public class Format_Demo {

	public static void main(String[] args) {
		
		System.out.printf("%-10s,%-10s,%-10s,%-10s,%-10s\n","Degrees","Radians","Sine","Cosine","Tangent");
		
		int degree = 30 ;
		
		double radian = Math.toRadians(degree);
		
		System.out.printf("%-10d, %-10.4f, %-10.4f, %-10.4f,%-10.4f\n", degree, radian,Math.sin(degree),Math.cos(degree),Math.tan(degree));
		
		degree = 60 ;
		
		radian = Math.toRadians(degree);
		
		System.out.printf("%-10d, %-10.4f, %-10.4f, %-10.4f, %-10.4f\n",degree, radian, Math.sin(radian), Math.cos(radian), Math.tan(radian) );
        
	    System.out.printf("%f",2.0);
	}

}
