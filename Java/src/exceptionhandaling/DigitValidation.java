package exceptionhandaling;

public class DigitValidation {

	void validate(String s) throws FileNameException {
		
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) >= '\0' && s.charAt(i) <= '9' || s.charAt(0)>='a' && s.charAt(0)<='z') {
				throw new FileNameException("digit and small char  not allowed .....");
			}
//			System.out.println("Valid file name");
		}
		System.out.println("Valid file name");
	}

	
	public static void main(String[] args) throws FileNameException {

		String s = "Filejava";

		DigitValidation obj = new DigitValidation();
		obj.validate(s);
	}
}