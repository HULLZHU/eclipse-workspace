
public class Stock {
	private String symbol ;
	private String name;
	private double previousClosingPrice;
	private double currentPrice;
	
	public Stock(){
		this("-","-",0);
	};
	
	public Stock( String symbol, String name, double previousClosingPrice){
		this.symbol = symbol;
		this.name = name;
		this.previousClosingPrice = previousClosingPrice;
	}
	
	public  void setCurrentPrice(double currentPrice){
		this.currentPrice = currentPrice;
	}
	
	public double getPercentageChange() {
		return (currentPrice - previousClosingPrice)/previousClosingPrice;
	}
	
	public String  getStockName() {
		return name;
	}

}
