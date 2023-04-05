package hyrachicalInheritance;

public class Doctor extends Person{

	int id;
	String specialization, hospital;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

	void display() {
		System.out.println(id+" "+name+" "+specialization+" "+contact+" "+hospital);
	}
}
