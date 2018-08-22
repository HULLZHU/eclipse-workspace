import java.util.*;
public class TestATM {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		ATM myAccount = new ATM();
		while ( -1 != 0 ) {
			int trigger = -1;
			System.out.println("Please enter your id .");
			int id = input.nextInt();
			while ( id < 0 && id > 9) {
				System.out.println("Please enter the id again");
			}
			myAccount.logIn(id);
			while(trigger!=0) {
			printMainMenu();
			int choice = input.nextInt();
			if ( choice == 1) {
				System.out.println(myAccount.checkBalance());
			    printMainMenu();
			    }
			if ( choice == 2) {
				System.out.println("Please enter the amount of money you wanna to withdraw.");
				double amount = input.nextDouble();
				myAccount.withDraw(amount);
				printMainMenu();
			}
			
			if (choice == 3 ) {
				System.out.println("Please enter the amount of money you wanna to deposit.");
				double amount = input.nextDouble();
				myAccount.deposit(amount);
				printMainMenu();
			}
			if ( choice == 4 ) {
				trigger= 0;
			}
		}
		}

	}

	private static void printMainMenu() {
		System.out.println("Main Menu.");
		System.out.println("1.check balance\n2.withdraw\n3.deposit\n4.exit");
	}
}
