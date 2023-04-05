package returntype;

public class SimpleIntrestMain {
	public static void main(String[] args) {

		SimpleInterestMethod obj = new SimpleInterestMethod();

		double d = obj.product(652, 45.3, 55);  //b la a ani c la product dyaycha aahe t b phile a la 
                                               //dein nantar vapas gheun parat c la dein.
		obj.simpleIntrest(d);
		
//		obj.simpleIntrest(obj.product(652, 45.3, 55));// yat b a la sangen tu direct c la de mala nako deu.
	
	}

}
