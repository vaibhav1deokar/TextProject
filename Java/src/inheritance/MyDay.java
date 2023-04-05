package inheritance;

public class MyDay extends MyTime{
	
	String day;
	
	void setDay(String day) {
		this.day=day;
	}
	
	void display() {
		System.out.println(day+" "+dd+" "+mm+" "+yyyy+" "+hrs+" "+min+" "+sec);
	}

}
