package inheritance;

public class GetSetDayTime {
	public static void main(String[] args) {
		
	MyDayGetSet g1 = new MyDayGetSet();
	
	g1.setDay("Monday");
	g1.setDd(20);
	g1.setMm(5);
	g1.setYyyy(2020);
	g1.setHrs(2);
	g1.setMin(26);
	g1.setSec(50);
	
	System.out.println(g1.getDay()+" "+g1.getDd()+" "+g1.getMm()+" "+g1.getYyyy()+
			" "+g1.getHrs()+" "+g1.getMin()+" "+g1.getSec());
	
	}
}
