package hyrachicalInheritance;

public class Student extends Person {

	int sid;
	float percent;

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public float getPercent() {
		return percent;
	}

	public void setPercent(float percent) {
		this.percent = percent;
	}

	void display() {
		System.out.println(sid + " " + name + " " + contact + " " + percent);
	}

	void grade() {
		if (percent >= 70) {
			System.out.println("pass with distinsion");
		} else if (percent >= 60) {
			System.out.println("pass in 1st class");
		} else if (percent >= 50) {
			System.out.println("pass in 2nd class");
		} else if (percent >= 40) {
			System.out.println("pass in 3rd class");
		} else {
			System.out.println("fail");
		}
	}

}
