package Chapter6;

public class PE_06_15 {

	public static void main(String[] args) {
		System.out.println(" Taxable         single       Married Joint        Married        Head of ");
		System.out.println("Income                        or Qualifying        Separaye       a House ");
		System.out.println("                              Widow(er)                               ");
		System.out.println("________________________________________________________________________________");
		printTable();
	}
	
	public static void printTable() {
		double taxableIncome = 50000;
		while ( taxableIncome<=60000) {
			System.out.print(taxableIncome);
			int countOfStatus = 1;
			while (countOfStatus<=4) {
			System.out.print("           "+computeTax(countOfStatus,taxableIncome));
			countOfStatus++;
			}
			System.out.println();
			taxableIncome+=50;
		}
	}
	
	public static double computeTax(int status,double taxableIncome) {
		if(status ==1 ) 
			return taxableIncome*0.25;
		else if ( status ==2 ) 
			return taxableIncome*0.15;
		else if (status ==3 )
			return taxableIncome*0.25;
		else 
			return taxableIncome*0.25;
	}

}
