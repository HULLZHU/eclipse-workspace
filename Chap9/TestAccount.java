
public class TestAccount {

	public static void main(String[] args) {
		Account myAccount = new Account();
		myAccount.setBalance(20000);
		myAccount.setAnnualInterestRate(0.045);
		myAccount.withDraw(2500);
		myAccount.deposit(3000);
		System.out.println("Balance: " + myAccount.getBalance());
		System.out.println("Monthly InerestRate: " +myAccount.getMonthlyInterest());
		System.out.println("Date Created: " + myAccount.getCreatedDate());

	}

}
