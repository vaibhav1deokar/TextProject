package arrays;

public class OccuranceElement {
	
	void occuranceCheck(char ch[]) {
//		int count = 0;
		for(int i = 0;i<ch.length;i++) {
			int count = 1;
			for (int j = i+1; j<ch.length;j++) {
				if(ch[i]==ch[j] && ch[i]!='\0') {
					count++;
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0') {
				System.out.println(ch[i]+"=>"+count);
			}

		}
	}
	
	public static void main(String[] args) {
		char []ch = {'a','b','c','d','a','b','c','d','a','b','c','d'};
		
		OccuranceElement obj = new OccuranceElement();
		obj.occuranceCheck(ch);
	}

}
