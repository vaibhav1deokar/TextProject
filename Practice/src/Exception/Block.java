package Exception;

public class Block {
	
	public String value() {
		try {
			System.out.println("try block");
			return "java";
		}
		finally {
			System.out.println("finally block");
			return "c++";
		}
	}
	
	public static void main(String[] args) {
		
		Block obj = new Block();
		obj.value();
	}

}
