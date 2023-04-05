package inheritance;

public class MobileSamsungMain {
	
	public static void main(String[] args) {
		
	Samsung s1 = new Samsung();
	s1.calling();
	s1.setStorage(128);
	s1.cameraResolution();
	s1.setPrice(50000);
	s1.camera();
	
	System.out.println(s1.getPrice()+" "+s1.getStorage());
	
	
	}
}
