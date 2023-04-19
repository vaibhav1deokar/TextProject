package array;

public class SquareArray {
	
	void array(int a[]) {
		int sqrt;
		for(int i : a) {
			sqrt = i*i;
			System.out.println("sqrt : "+sqrt);
		}
	}
	
	public static void main(String[] args) {
		
		int a[]= {2,5,8,3,6,9,1,4,7};
		
		SquareArray s = new SquareArray();
		s.array(a);
		
	}

}
