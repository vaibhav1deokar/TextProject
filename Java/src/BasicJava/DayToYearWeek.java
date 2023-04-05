package BasicJava;

public class DayToYearWeek {
	public static void main(String[] args) {

		double d = 25, y, w;
		y = d / 365;
		w = (d % 365) / 7;
		d = d - (y * 365) + (w * 7);
		System.out.println(" year = " + y);
		System.out.println(" week = " + w);
		System.out.println(" days = " + d);
	}

}
