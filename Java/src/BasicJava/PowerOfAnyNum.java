package BasicJava;

public class PowerOfAnyNum {
	public static void main(String[] args) {

		double a = 5, r=1;
		double p = 3;

		for (int i=1; i<=p;i++) {
			r = a*r;

//			System.out.println("power of no. is = " + p);
//			r++;
		}System.out.println("Power of no. is = "+r);
	}
}
