
public class PE_5_40 {

	public static void main(String[] args) {
		int count = 0;
		int count_h = 0;
		int count_t = 0;
		double temp = 0;
		while ( count < 10000) {
			temp = Math.random();
			if ( temp > 0.5) {
				System.out.println("Head");
			    count_h++;
			    }
			else {
				System.out.println("tail");
			    count_t++;
			}
			count ++;
		}
		System.out.println("head"+count_h);
		System.out.println("tail"+count_t);
		// TODO Auto-generated method stub

	}

}
