package BankAccount;

public class BankApp {
	 public static void main(String[] args) {

	        BankAccount account = new BankAccount(1001, 10000);

	        Deposit d = new Deposit();
	        Withdraw w = new Withdraw();
	        CheckBalance c = new CheckBalance();

	        c.display(account);

	        d.deposit(account, 5000);
	        c.display(account);

	        w.withdraw(account, 3000);
	        c.display(account);

	        w.withdraw(account, 15000);
	        c.display(account);
	    }

}
