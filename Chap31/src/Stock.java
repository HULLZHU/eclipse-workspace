import java.io.Serializable;

public class Stock implements Serializable {
	private double price ;
	private double volitality;
	private double volume;
	
	public Stock(double price, double volatility, double volume) {
		this.price = price;
		this.volitality = volatility;
		this.volume = volume;
	}
	 
	public double getPrice(){
		return price;
	}
	
	public double getVolatility(){
		return volitality;
	}
	
	public double getVolume() {
		return volume;
	}

}
