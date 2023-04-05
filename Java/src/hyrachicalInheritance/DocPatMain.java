package hyrachicalInheritance;

public class DocPatMain {
	public static void main(String[] args) {

		Doctor d1 = new Doctor();
		
		d1.setId(123);
		d1.setName("Dr. Ram");
		d1.setHospital("Ram Hospital");
		d1.setAddress("Karve nagar, pune");
		d1.setContact("9865325421");
		d1.setSpecialization("Dentist");
		d1.display();

		System.out.println();

		Patient p1 = new Patient();
		
		p1.setId(321);
		p1.setName("Harshal");
		p1.setDisease("pain in teeth");
		p1.setAadhar("325698541265");
		p1.setAddress("Kothrude, pune");
		p1.setContact("8744653221");
		p1.setRoom(5);
		p1.display();
	}

}
