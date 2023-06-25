package list;

import java.util.ArrayList;

public class Day {

	void addData(ArrayList<String> al) {

		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");
		al.add("Sat");
		al.add("Sun");
		al.add("Mon");

		ArrayList<String> list = new ArrayList<>();

		for (String s : al) {
			if (!list.contains(s)) {
				list.add(s);
			}
		}
		System.out.println(list);
	}

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		Day obj = new Day();
		obj.addData(al);

	}

}
