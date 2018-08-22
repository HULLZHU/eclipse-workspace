
public class PE_5_39 {

	public static void main(String[] args) {
		int saleAmount = 0;
		int commission = 0;
		
		while ( commission <= 25000) {
			if ( saleAmount < 5000) {
				commission = (int) (saleAmount*0.08);
			}
			else if (saleAmount < 10000){
				commission = (int) (400 + (commission - 5000)*0.1);
			}
			else 
				commission = (int) (900 + (saleAmount - 10000)*0.12);
			
			saleAmount++;
		}
		System.out.println(saleAmount);
	}

}
