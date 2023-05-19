package interfaces;

public class SBI implements BankOperation{
	
	
	public void deposite() {
		System.out.println("can deposite money from ATM");
	}
	
	@Override
	public void withdraw() {
		System.out.println("can withdraw money from ATM");
	}
	
	@Override
	public void loan() {
		System.out.println("home loan, education loan, car loan");
	}
	
	@Override
	public void balanceCheck() {
		System.out.println("we can check balance");
	}
	
	@Override
	public void moneyTransfer() {
		System.out.println("we can transfer money");
	}
	

}
