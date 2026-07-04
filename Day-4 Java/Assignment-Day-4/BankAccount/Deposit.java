package BankAccount;

public class Deposit {
	public void deposit(BankAccount account, double amount) {

        account.setBalance(account.getBalance() + amount);

        System.out.println("Amount Deposited Successfully.");
    }

}
