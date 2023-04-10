package overriding;

class bank {
	void loan() {
		System.out.println("Every bank must offer loan");
	}
}

class SBI extends bank {
	void loan() {
		System.out.println("SBI provides House loan only");
	}
}

class HDFC extends bank {
	void loan() {
		System.out.println("HDFC provides Car loan only");
	}
}

public class BankMain {

	public static void main(String[] args) {

		bank b1;
		b1 = new bank();
		b1.loan();

		b1 = new SBI();
		b1.loan();

		b1 = new HDFC();
		b1.loan();

//		SBI s1 = (SBI)new Bank();      //down casting not possible in java.
//		s1.loan();

	}

}
