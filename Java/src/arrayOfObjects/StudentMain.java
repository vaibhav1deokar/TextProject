package arrayOfObjects;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {
	public static void main(String[] args) {

		Student stdArr[] = new Student[2];

		stdArr[0] = new Student();
		stdArr[0].id = 123;
		stdArr[0].name = "Rahul";
		stdArr[0].rollno = 1526;
		
		System.out.println(Arrays.toString(stdArr));

		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<stdArr.length;i++) {
			stdArr[i] = new Student();
			System.out.println("Enter Student id");
			stdArr[i].id = sc.nextInt();
			System.out.println("Enter Student name");
			stdArr[i].name = sc.next();
			System.out.println("Enter rollno");
			stdArr[i].rollno = sc.nextInt();
			
			stdArr[i].s = new StuDept();
			System.out.println("Enter dept");
			stdArr[i].s.deptname = sc.next();
			System.out.println("Enter dept id");
			stdArr[i].s.d_id = sc.nextInt();
		}
		System.out.println(Arrays.toString(stdArr));
	}
}