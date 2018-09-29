
public class RationalMatrix extends GenericMatrix<Rational>{

	@Override
	protected Rational add(Rational o1, Rational o2) {
		// TODO Auto-generated method stub
		return o1.add(o2);
	}

	@Override
	protected Rational multiply(Rational o1, Rational o2) {
		// TODO Auto-generated method stub
		return o1.multiply(o2);
	}

	@Override
	protected Rational zero() {
		// TODO Auto-generated method stub
		return new Rational(0,1);
	}

}
