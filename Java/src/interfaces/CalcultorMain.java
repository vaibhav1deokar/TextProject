package interfaces;

public class CalcultorMain {
	public static void main(String[] args) {
		
		SciCalculator s = new SciCalculator();
		s.add(5, 4);
		s.substract(10, 8);
		s.multiplication(6, 5);
		s.division(10, 2);
		s.square(5);
		s.power(5);
	}

}
