package week07;

public class BankAccount {
	
	private double balance;
	private int accountNumber;
	
	public BankAccount() {
		
	}
	
	public BankAccount(int balance, int accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public double deposit(double amount) {
		balance += amount;
		return balance;
	}
	
	public double withdraw(double amount) {
		if (amount < balance) {
			balance -= amount;
		} else {
			System.out.println("Sorry! You don't have enough balance in your account.");
		}
		return balance;
	}
	
	
	

	
}
