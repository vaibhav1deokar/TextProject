package interfaces;

public class BankMain {

	public static void main(String[] args) {

		SBI s = new SBI();
		s.deposite();
		s.loan();
		s.withdraw();
		s.balanceCheck();
		s.moneyTransfer();
	}

}
