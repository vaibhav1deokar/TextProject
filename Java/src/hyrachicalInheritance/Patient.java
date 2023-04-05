package hyrachicalInheritance;

public class Patient extends Person {

	int id, room;
	String disease;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	void display() {
		System.out.println(id + " " + name + " " + aadhar + " " + contact + " " + address + " " + room + " " + disease);
	}

}
