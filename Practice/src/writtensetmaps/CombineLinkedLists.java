package writtensetmaps;

import java.util.LinkedList;

public class CombineLinkedLists {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		list1.add(6);

		LinkedList<Integer> list2 = new LinkedList<>();
		list2.add(11);
		list2.add(22);
		list2.add(33);
		list2.add(44);

		LinkedList<Integer> combinedList = combineLinkedLists(list1, list2);
		System.out.println(combinedList);
	}

	public static LinkedList<Integer> combineLinkedLists(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		LinkedList<Integer> combinedList = new LinkedList<>();

		int size1 = list1.size();
		int size2 = list2.size();
		int maxSize = Math.max(size1, size2);

		for (int i = 0; i < maxSize; i++) {
			if (i < size1)
				combinedList.add(list1.get(i));
			if (i < size2)
				combinedList.add(list2.get(i));
		}

		return combinedList;
	}
}