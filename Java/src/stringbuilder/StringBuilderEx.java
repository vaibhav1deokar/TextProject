package stringbuilder;

public class StringBuilderEx {
	
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer();
		System.out.println(sb.capacity());
		
		sb.append("java language");
		System.out.println(sb.capacity());
		System.out.println(sb);
		
//		sb.delete(2, 4);
//		System.out.println(sb);
		
//		sb.deleteCharAt(7);
//		System.out.println(sb);
		
//		sb.replace(5, 9, "good");
//		System.out.println(sb);
		
//		sb.reverse();
//		System.out.println(sb);
		
//		sb.insert(6, 500);
//		System.out.println(sb);
		
		sb.setCharAt(3, 'x');
		System.out.println(sb);
		
	}

}
