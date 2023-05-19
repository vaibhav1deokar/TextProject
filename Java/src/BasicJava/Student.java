package BasicJava;

//class Demo {
//
//}
//
//class Person {
//
//	void show() {
//
//	}
//}

public class Student{ //extends Person {

	public void show() {

	}

	public static void main(String[] args) {

		int a[] = { 5, 9, 1, 7, 6, 4 };
//		int min = a[0];
		int num = 5;
		int d = 0;
		for (int i=0; i<=a.length;i++) {
			if (i < num) {
				d = num -a[i];
				if(d==1 || d==-1) {
					System.out.println(a[i]);
				}
//				min = i - min;
//				System.out.println(a[i]);

			}
		}
//		System.out.println(a[i]);

	}
}
