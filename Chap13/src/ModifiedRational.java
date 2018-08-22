
public class ModifiedRational extends Number implements Comparable<ModifiedRational>{
	private long[] rational = new long[2];
	
	public ModifiedRational() {
		rational[0] = 0;
		rational[1] =1;
	}
	public ModifiedRational(long[] r) throws IllegalRationalFormatException {
		if (r.length !=2) {
			throw new IllegalRationalFormatException("Wrong format in Rational Number representation");
		}
		else
			rational = r;
		long gcd = gcd(rational[0],rational[1]);
		this.rational[0] = ((this.rational[0]>0)?1:-1)*rational[0]/gcd;
		this.rational[1] = Math.abs(r[1])/gcd;
	}
	
	public long getNumerator() {
		return rational[0];
	}
	
	public long getDenominator() {
		return rational[1];	
		}
	
	public ModifiedRational add(ModifiedRational secondRational) throws IllegalRationalFormatException {
		long n = rational[0]*secondRational.getDenominator()+rational[1]*secondRational.getNumerator();
		long d = rational[1]*secondRational.getDenominator();
		long[] r = {n,d};
		return new ModifiedRational(r);
	}
	
	public ModifiedRational subtract(ModifiedRational secondRational) throws IllegalRationalFormatException {
		long n = rational[0]*secondRational.getDenominator()-rational[1]*secondRational.getNumerator();
		long d = rational[1]*secondRational.getDenominator();
		long[] r = {n,d};
		return new ModifiedRational(r);
	}
	
	public ModifiedRational multiply(ModifiedRational secondRational) throws IllegalRationalFormatException {
		long n = rational[0]*secondRational.getNumerator();
		long d = rational[1]*secondRational.getNumerator();
		long[] r = {n,d};
		return new ModifiedRational(r);
	}
	
	public ModifiedRational divide(ModifiedRational secondRational) throws IllegalRationalFormatException {
		long n = rational[0]*secondRational.getDenominator();
		long d = rational[1]*secondRational.getNumerator();
		long[] r = {n,d};
		return new ModifiedRational(r);
	}
	
	@Override
	public String toString() {
		if (rational[1]==1)
			return rational[0]+"";
		else
			return rational[0] + "/" +rational[1];
	}
	
	@Override
	public boolean equals(Object other) {
		ModifiedRational r = (ModifiedRational)other;
		try {
			if (this.subtract(r).getNumerator()==0)
				return true;
			else
				return false;
		} catch (IllegalRationalFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	private long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		int gcd = 1;
		for (  int k = 1; k <=n1 && k<=n2 ; k ++ ) {
			if ( n1%k == 0 && n2 %k == 0)
				gcd = k;
		}
		return gcd;
	}
	
	
	@Override
	public int compareTo(ModifiedRational o)  {
		try {
			if ( this.subtract(o).getNumerator()>0)
				return 1;
			else if ( this.subtract(o).getNumerator()<0)
				return -1;
			else
				return 0;
		} catch (IllegalRationalFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return -1;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return rational[0]*1.0/rational[1];
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return (float)doubleValue();
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return (int)doubleValue();
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return (long)doubleValue();
	}
	
}