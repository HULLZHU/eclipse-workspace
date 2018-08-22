
public class TestStock {

	public static void main(String[] args) {
		Stock myStock = new Stock("ORCL","Oracle cooperation",100);
		myStock.setCurrentPrice(120);
		System.out.println("The "+ myStock.getStockName() + "'s price changes "+myStock.getPercentageChange() );
	}

}
