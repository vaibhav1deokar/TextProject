package arrayOfObjects;

public class StuDept {

	String deptname;
	int d_id;

	public StuDept() {
	}

	public StuDept(String deptname, int d_id) {
		super();
		this.deptname = deptname;
		this.d_id = d_id;
	}

	public String toString() {
		return d_id + " " + deptname;
	}

}
