package list;

import java.util.LinkedList;
import java.util.ListIterator;

public class Traverse {
	
	public static void main(String[] args) {
		
		LinkedList<String> list= new LinkedList<>();
		
		list.add("Rohan");
		list.add("Sunita");
		list.add("Monika");
		list.add("Vaishali");
		list.add("Kamlesh");
		list.add("Rakesh");
		list.add("Ravindra");
		
		
		ListIterator <String> itr=list.listIterator(list.size());
		while(itr.hasPrevious()){
			System.out.println(itr.previous());
		}
	}

}
