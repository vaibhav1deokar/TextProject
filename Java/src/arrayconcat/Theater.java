package arrayconcat;

public class Theater {

	int id;
	String name;
	Movie mv[];


	public Theater(int id, String name, Movie[] mv) {
		super();
		this.id = id;
		this.name = name;
		this.mv = mv;
	}

//	Movie mv[];

	public String toString() {
		return id + " " + name + " " + mv;
	}

}
