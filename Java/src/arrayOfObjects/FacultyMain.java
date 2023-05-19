package arrayOfObjects;

import java.util.Arrays;
import java.util.Scanner;

public class FacultyMain {

	public static void main(String[] args) {

		Faculty facArr[] = new Faculty[2];

//		facArr[0] = new Faculty();
//		facArr[0].id = 123;
//		facArr[0].name = "Rakesh";
//		facArr[0].salary = 50000;
//
//		System.out.println(Arrays.toString(facArr));

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < facArr.length; i++) {
			facArr[i] = new Faculty();
			System.out.println("Enter fac. id");
			facArr[i].id = sc.nextInt();
			System.out.println("Enter fac. name");
			facArr[i].name = sc.next();
			System.out.println("Enter fac. salary");
			facArr[i].salary = sc.nextInt();
			
			facArr[i].f = new FacDept();
			System.out.println("Enter fac. dept");
			facArr[i].f.deptname = sc.next();
		}
		System.out.println(Arrays.toString(facArr));
	}

}
