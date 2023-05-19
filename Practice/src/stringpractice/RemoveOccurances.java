package stringpractice;

public class RemoveOccurances {

	public static void main(String[] args) {

		String s = "java language java is language";
		String[] arr = s.split("java");
		String b = "java";

		String res = "";
		int i;

		for (i = 0; i < arr.length; i++) {
			if (arr[i] != b) {
				res = res + arr[i];
			}
		}
		System.out.println(res);
	}
}