public class ATM {
	private int id = 0;
	private double [] balance = new double[10]; 
	
	public ATM() {
		for ( int i = 0; i <balance.length ; i++ )
			balance[i] = 100;
	}
	
	public void logIn(int id) {
		this.id = id;
	}
	
	public double checkBalance() {
		return balance[id];
	}
	
	public void withDraw(double amount) {
		balance[id] -= amount;
	}
	
	public void deposit(double amount) {
		balance[id] += amount;
	}
}
