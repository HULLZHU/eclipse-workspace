import java.util.*;
public class PE_07_25 {

	public static void main(String[] args) {
		System.out.println("Please input coefficients of quadratic equations.");
		Scanner input = new Scanner(System.in);
		double []eqn = new double[3];
		for ( int i =0; i <3; i ++) {
			eqn[i] = input.nextInt();
		}
		
		if ( eqn[1]*eqn[1]- 4*eqn[0]*eqn[2]>=0) {
		if ( eqn[1]*eqn[1]- 4*eqn[0]*eqn[2]>0) {
			System.out.println("Here are 2 real roots.");
		}
		else 
			System.out.println("Here are 1 rea roots");
		double[]roots=getRoots(eqn);
		if ( roots[0]!=roots[1]) {
			System.out.println("roots1£º"+roots[0]+"roots2:"+roots[1]);
		}
		else 
			System.out.println("roots:"+ roots[0]);
	}
		else {
			System.out.println("No roots");
		}

}

	private static double[] getRoots(double[] eqn) {
            double [] roots = new double[2];
			roots[0] = (-eqn[1]+ Math.sqrt(eqn[1]*eqn[1]- 4*eqn[0]*eqn[2]))/(2*eqn[0]);
			roots[1]= roots[0] = (-eqn[1]- Math.sqrt(eqn[1]*eqn[1]- 4*eqn[0]*eqn[2]))/(2*eqn[0]);
			return roots;
		// TODO Auto-generated method stub
		
}
}