package array;

import java.util.Arrays;

public class Student {

	int roll, mark[];
	String name;

	public Student(int r, String n, int[] m) {
		roll = r;
		mark = m;
		name = n;
	}

	public void display() {
		System.out.println("Student name : "+name);
		System.out.println("Roll : "+roll);
		System.out.println("Marks achived in sub : ");
//		for(int i = 0 ; i < mark.length;i++) {
//			System.out.print(mark[i]+" ");
//		}
		System.out.println(Arrays.toString(mark));
		System.out.println("\n================================");
	}
	
	public static void main(String[] args) {
		
		int mks1[] = {78,45,23,79,78};
		int mks2[] = {34,89,93,49,78};
		
		Student s1 = new Student(123, "Raju", mks1);
		Student s2 = new Student(321, "Sanju", mks2);
		
		s1.display();
		s2.display();

	}

}


