package whilelooping;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int num = 37, c = 2;
		int mid = num/2;
		
		while(c<=mid) {
			if(num%c==0) {
				System.out.println("Not Prime no. "+num);
				break;
			}
			c++;
		}
		if(c>mid) {
			System.out.println("Prime no. "+num);
		}
	}

}
