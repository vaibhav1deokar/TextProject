package Another;

import java.util.Scanner;

public class Test1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String inputstr = sc.nextLine();
		String searchstr = sc.next();
		int count = 0;
		String temp[] = inputstr.split(" ");
		
		for(int i = 0; i<temp.length;i++) {
			if(searchstr.equals(temp[i])) {
				count++;
			}
		}
		System.out.println(count);
	}

}
