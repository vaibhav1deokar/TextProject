package exceptionhandaling;

public class MultipleException {
	
	public static void main(String[] args) {
		
		int a = 10,b=5;
		
		int arr[] = {1,2,3,4,5,6};
		String s = "india";
		
		try {
			System.out.println(arr[5]);
			System.out.println("division is : "+(a/b));
			System.out.println("charactor is : "+s.charAt(3));
		}
		catch(ArithmeticException e){
			System.out.println("Aeithmetic : do not enter zero");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size is 6 enter proper index");
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Done.....");
	}
}