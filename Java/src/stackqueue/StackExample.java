package stackqueue;

import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<>();

		st.push(10);
		st.push(46);
		st.push(22);
		st.push(34);
		st.push(64);
		st.push(84);
		st.push(93);

		System.out.println(st);
		System.out.println(st.search(22));
		System.out.println(st.peek());

		st.pop();
		System.out.println(st);

//		st.remove(2);
//		System.out.println(st);	
	}

}
