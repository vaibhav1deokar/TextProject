package Written3;

public class Person {
	
	private String name,gender;
	private int age;
	private Address add;
	
	public void setAdd(Address add) {
		this.add = add;
	}

	public Address getAdd() {
		return add;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName () {
		return name;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getGender () {
		return gender;
	}
	
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge () {
		return age;
	}

}
