
public class QuadraticEquation {
	private double a ;
	private double b ;
	private double c ; 
	private double root1;
	private double root2;
	
	QuadraticEquation(){
	}
	public double getA(){
		return a;
	}
	
	public void setA(double a) {
		this.a = a;
	}
	
	public double getB() {
		return b;
	}
	
	public void setB(double b ) {
		this.b = b;
	}
	
	public double getC() {
		return c;
	}
	
	public void setC(double c) {
		this.c = c;
	}
	
	public double getDiscriminant() {
		return Math.sqrt(b*b-4*a*c);
	}
	
	{
		if ( this.getDiscriminant()>=0) {
			root1 = (-b+this.getDiscriminant())/(2*a);
			root2 = (-b+this.getDiscriminant()/2*a);
		}
    }
	
	public String getRoots() {
		if(this.getDiscriminant()<0)
			return "No roots.";
		else if ( this.getDiscriminant()>0)
			return "Root1: "+root1 +" Root2:"+root2;
		else 
			return "Same Root: " + root1;
	}
}