
public class PE_5_35 {

	public static void main(String[] args) {
		double i = 1;
		double sum = 0;
		while ( i <= 624 ) {
			sum =1/(Math.sqrt(i)+Math.sqrt(i+1));
			i++;
		}
		System.out.println(sum);
		// TODO Auto-generated method stub

	}

}
