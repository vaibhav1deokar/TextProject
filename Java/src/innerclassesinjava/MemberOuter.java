package innerclassesinjava;

public class MemberOuter {
	
	int a = 1000;
	static int b = 200;
	private String s = "satish";
	
	class MemberInner {
		int a = 10;
		void display () {
			System.out.println(this.a);
			System.out.println(a);
			System.out.println(b);
			System.out.println(MemberOuter.this.a);
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		MemberOuter obj = new MemberOuter();
		MemberOuter.MemberInner obj2 = obj.new MemberInner();
		obj2.display();
	}

}
