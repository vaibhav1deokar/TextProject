package exceptionhandaling;

import javax.swing.filechooser.FileNameExtensionFilter;

public class FileNameValidation {
	
	void validate (String s) throws FileNameException {
		int count = 0;
		for(int i =0; i<s.length();i++) {
//			if(s.charAt(i)==' ' ) {
//				throw new FileNameException("space not allowed .....");
//			}else {
//				count++;
//			}
			
			if(s.contains(" ")) {
				throw new FileNameException("space not allowed .....");
			}
			else {
//				System.out.println("Valid file name");
			}
//			System.out.println("Valid file name");
		}
		System.out.println("Valid file name");

	}
	
	public static void main(String[] args) throws FileNameException {
		
		String s = "filejava";
		
		FileNameValidation obj = new FileNameValidation();
		obj.validate(s);
	}

}
