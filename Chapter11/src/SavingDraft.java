
public class SavingDraft extends CheckingAccount {
//SavingAccount 可理解为 overDraftLimit 为 0 的特殊 CheckingAccount
	SavingDraft() {
		super(0);
	}
}
