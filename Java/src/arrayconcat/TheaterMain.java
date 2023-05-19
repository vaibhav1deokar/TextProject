package arrayconcat;

public class TheaterMain {
		
		Theater t [] = new Theater [3];
		
		void addData() {
			Movie m1[] = new Movie[3];
			m1[0] = new Movie(123,10,"RRR");
			m1[1] = new Movie(456,20,"Theran");
			m1[2] = new Movie(789,30,"Dhoom");

			Movie m2[] = new Movie[3];
			m2[0] = new Movie(321,50,"Time pass");
			m2[1] = new Movie(654,30,"Ved");
			m2[2] = new Movie(987,20,"Kashmir files");

			Movie m3[] = new Movie[3];
			m3[0] = new Movie(123,10,"RRR");
			m3[1] = new Movie(456,20,"Theran");
			m3[2] = new Movie(654,30,"ved");

			t[0] = new Theater (1,"city pride",m1);
			t[1] = new Theater (2,"D-mart",m2);
			t[2] = new Theater (3,"Escon",m3);
		}
		
		void display() {
			for(Theater th : t) {
				for(Movie m :th.mv) {
					if(m.boc>10) {
						System.out.println(th.name+ " "+m.name);
					}
				}
			}
		}
		public static void main(String[] args) {
			
			TheaterMain obj = new TheaterMain();
			obj.addData();
			obj.display();
		}
	}