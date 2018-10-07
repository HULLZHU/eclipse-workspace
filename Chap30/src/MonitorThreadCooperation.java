import java.util.concurrent.*;

public class MonitorThreadCooperation {
  private static Account account = new Account();
  
  public static void main(String[]args) {
	  ExecutorService executor = Executors.newFixedThreadPool(2);
	  executor.execute(new WithDrawTask());
	  executor.execute(new DepositTask());
	  executor.shutdown();
	  
  }
  
  
  
  
  
  public static class WithDrawTask implements Runnable{
	@Override
	public void run() {
		while (true) {
			account.withdraw((int)(Math.random()*100));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
  }
  
  public static class DepositTask implements Runnable{

	@Override
	public void run() {
		while(true) {
		account.deposit((int)(Math.random()*100));
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	} 
  }

  
  private static class Account{
	  private int balance = 0 ;
	  
	  public int getBalance() {
		  return balance;
	  }
	  
	  public synchronized void deposit(int amount) {
		  balance += amount;
		  System.out.println("Deposit "+ amount+" Balance "+this.getBalance());
		  notifyAll();
	  } 
	  
	  public synchronized void withdraw(int amount) {
		  try {
			  while ( balance < amount)
				  wait();
		  }
		  catch (InterruptedException ex) {
			  ex.printStackTrace();
		  }
		  
		  balance -= amount;
		  System.out.println("Withdraw "+ amount + " Balance "+ balance);
	  }
  }
}