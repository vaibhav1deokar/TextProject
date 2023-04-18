package writtenabstraction;

public class JuicerMachineMain {
	
	public static void main(String[] args) {
		
		Juicer j = new Juicer();
		j.crush();
		j.rotate();
		j.filter();
		
		Machine m = new Juicer();
		m.crush();
		m.rotate();
		
	}

}
