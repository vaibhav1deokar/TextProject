package inheritance;

public class MyTimeGetSet extends MyDateGetSet{
	
	int hrs,min,sec;

	public int getHrs() {
		return hrs;
	}

	public void setHrs(int hrs) {
		this.hrs = hrs;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSec() {
		return sec;
	}

	public void setSec(int sec) {
		this.sec = sec;
	}
	
//	void display() {
//		System.out.println(hrs+" "+min+" "+sec);
//	}

}
