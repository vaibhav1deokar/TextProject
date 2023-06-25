package com.wrapperclass;

public class AddInteger {

	public static void main(String[] args) {

		String s = "bb5bjdj8dhfn9shdb1";
		char ch[] = s.toCharArray();
		int sum = 0, i;

		for (i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				int num = Character.getNumericValue(ch[i]);
				sum = ch[i] + sum;
			}
		}
		System.out.println(sum);
	}
}