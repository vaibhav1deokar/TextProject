package Another;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Integer>list = new ArrayList<>();
		int sum=0;		
		for(int i = 0; i<5;i++) {
			list.add(sc.nextInt());
		}
		for(int j = 0 ;j<list.size();j++) {
			sum = sum + list.get(j);
		}
		
		System.out.println(sum);
	}

}
