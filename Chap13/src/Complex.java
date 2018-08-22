
public class Complex  implements Cloneable {
	private double realPart;
	private double imaginaryPart;
	
	public Complex(double a, double b) {
		realPart = a;
		imaginaryPart = b;
	}
	
	public Complex(double a) {
		this(a,0);
	}
	
	public Complex() {
		this(0);
	}
	
	public double getRealPart() {
		return this.realPart;
		
	}
	
	public double getImaginaryPart() {
		return this.imaginaryPart;
	}
	
	public void setRealPart(double realPart) {
		this.realPart = realPart;
	}
	
	public void setImaginaryPart(double imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
	}
	public Complex add(Complex complex) {
		realPart += complex.getRealPart();
		imaginaryPart += complex.getImaginaryPart();	
		return new Complex(realPart,imaginaryPart);
	}
	
	public Complex subtract(Complex complex) {
		realPart -= complex.getRealPart();
		imaginaryPart -= complex.getImaginaryPart();	
		return new Complex(realPart,imaginaryPart);
	}
	
	public Complex multiply(Complex complex) {
		realPart = (realPart*complex.getRealPart()-imaginaryPart*complex.getImaginaryPart());
		imaginaryPart = (imaginaryPart*this.getRealPart() + realPart*complex.getImaginaryPart());
		return new Complex(realPart,imaginaryPart);
	}
	
	public Complex divide(Complex complex) {
		realPart = (realPart*complex.getRealPart()-imaginaryPart*complex.getImaginaryPart())/(complex.getRealPart()*complex.getRealPart()+complex.getImaginaryPart()*complex.getImaginaryPart());
		imaginaryPart = (imaginaryPart*complex.getRealPart()-realPart*complex.getImaginaryPart())/(complex.getRealPart()*complex.getRealPart()+complex.getImaginaryPart()*complex.getImaginaryPart());
		return new Complex(realPart,imaginaryPart);
	}
	
	public double abs() {
		return Math.sqrt(this.getRealPart()*this.getRealPart()+this.getImaginaryPart()*this.getImaginaryPart());
	}

	public String toString () {
		return realPart + " + "+imaginaryPart+"i";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Complex(getRealPart(),getImaginaryPart());
		
	}
	

}
