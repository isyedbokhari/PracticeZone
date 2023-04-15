package week07;

public class BankAccountObj {

	public static void main(String[] args) {
		
		BankAccount wellsFargo = new BankAccount(0, 53563);
		System.out.println("Bank Name: Wells Fargo");
		System.out.println("Account Holder: Syed Bokhari");
		System.out.println("Account Number: " + wellsFargo.getAccountNumber());
		System.out.println("Balance: $" + wellsFargo.getBalance());
		System.out.println("Deposit: $" + wellsFargo.deposit(10000));
		System.out.println("Withdraw: $" + wellsFargo.withdraw(5000));
		System.out.println("Final Balance: $" + wellsFargo.getBalance());
		
	}

}
