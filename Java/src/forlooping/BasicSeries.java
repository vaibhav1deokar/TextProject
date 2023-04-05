package forlooping;

public class BasicSeries {
	public static void main(String[] args) {
		
		int end = 15, a=1;
		for(int i=1; i<=end;i++) {
			System.out.print(a+" ");
			a+=3;
		}
		System.out.println();
		
		int c = 1,x=2;
		for(int i=1; i<=7;i++) {
			System.out.print(c+" ");
			c=c+(i*x);
		}
		System.out.println();
		
		for(int i=1;i<=10;i++) {
			System.out.print((i*i)+" ");
			
		}
		System.out.println();
		
		int s=1,b=1;
		for(int i =1; i<=6;i++) {
			
			System.out.print(s+" ");
			s = s+(i+1)*(i+1);
			
		}
	}

}
