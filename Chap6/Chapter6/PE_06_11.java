package Chapter6;

public class PE_06_11 {

	public static void main(String[] args) {
		printTitle();
		printBody();
	}
	
	public static void printTitle() {
		System.out.println("Sales Amount         Commission");
		System.out.println("_______________________");
	}
	
	public static double computeCommission(double salesAmount) {
		double commission = 0;
		if (salesAmount <= 5000) {
			commission = salesAmount*0.08;
		}
		else if (salesAmount<=10000) {
			commission = 400 + (salesAmount - 5000)*0.1;
		}
		else 
			commission = 900 + (salesAmount - 10000)*0.12;
		
		return commission;
	}
	
	public static void printBody() {
		double salesAmount = 5000;
		while ( salesAmount <= 100000) {
			System.out.print(salesAmount);
			System.out.print("      ");
			System.out.println(computeCommission(salesAmount));
			salesAmount += 5000;
		}
	}

}
