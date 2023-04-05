package classandobject;

public class StudentMarksExampleMain {
	public static void main(String[] args) {
		
		StudentMarksExample s1 = new StudentMarksExample();
		StudentMarksExample s2 = new StudentMarksExample();
		
		s1.inData(123, 56, 58, 75, "vijay");
		s2.inData(321, 65, 75, 85, "raju");
		
//		System.out.println(s1.hashCode());//  hexa decimal from of hashcode
//		System.out.println(s2);
		
		float per = s1.percentage();
		s1.grade(per);
		
//		StudentMarksExample s2 = s1;
//		System.out.println(s1);
//		System.out.println(s2);
	}

}
