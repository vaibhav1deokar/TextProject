package decisionstatement;

public class PositiveNegative {
	public static void main(String[] args) {
		
		int a = -2034;
		
//		if(a>0) {
//			System.out.println("positive no.");
//		}
//		else {
//			System.out.println("Negative no.");
//		}
		if(a>0) {
			if(a%2==0) {
				System.out.println("Even no.");
			}else {
				System.out.println("Odd no.");
			}
		}else {
			System.out.println("no. is Negative....enter positive no.");
		}
	}

}
