
public class CheckingAccount extends Account {
	private double overDraftAccountLimit;
	
	CheckingAccount(double overDraftAccountLimit){
		super();
		this.overDraftAccountLimit = overDraftAccountLimit;
	}
	
	@Override
	public void withDraw(double amount) {
		if ( this.getBalance()-amount < overDraftAccountLimit) {
			System.out.println("The amount is less than the overdraft limit, you cannot withdraw any more money.");
		}
		else
			this.setBalance((int) (this.getBalance()-amount));
	}
	
}
