package array;

public class MaxSecond {

	void secondMax(int[] a) {
		int max = a[0];
		int max2 = a[1];
		for(int  i =2;i<a.length;i++) {
			if(a[i]>max) {
				max2=max;
				max=a[i];
			}
			else if(a[i]>max2) {
				max2=a[i];
			}
			
		}
		System.out.println(max2);
	}

	public static void main(String[] args) {

		int[] a = { 6, 6, 4, 2, 7, 3, 8, 5, 7, 5, 9, 4, 5, 6, 2 };

		MaxSecond m = new MaxSecond();
		m.secondMax(a);
	}

}
