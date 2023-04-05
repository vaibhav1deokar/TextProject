package returntype;

public class SimpleInterestMethod {

	double product(int p, double r, float t) {  // jya data type chi value mothi he te return kartat.
		return p * r * t;                       //nehami motha data type return kartat.
	}

	void simpleIntrest(double product) {
		System.out.println("simple int. is " + (product) / 100);
	}

}
