package classandobject;

public class StudentMarksExample {

	int id;
	float m1, m2, m3;
	String name;

	void inData(int id, float m1, float m2, float m3, String name) {

		this.id = id;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.name = name;
	}

	float percentage() {
		float percent = (m1 + m2 + m3) / 3;
		return percent;
	}

	void grade(float percent) {
		if (percent >= 70) {
			System.out.println("distinction");
		} else if (percent >= 60) {
			System.out.println("first class");
		} else if (percent >= 50) {
			System.out.println("second class");
		} else if (percent >= 40) {
			System.out.println("third class");
		}
	}

}
