package BankAccount;

public class Withdraw {
	public void withdraw(BankAccount account, double amount) {

        if (amount <= account.getBalance()) {

            account.setBalance(account.getBalance() - amount);

            System.out.println("Amount Withdrawn Successfully.");
        } else {

            System.out.println("Insufficient Balance.");
        }
    }

}
