package inheritance;

public class Mobile {

	int storage;

	public int getStorage() {
		return storage;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	void calling() {
		System.out.println("must use to calling");
	}

	void camera() {
		System.out.println("mobile must have camera");
	}

	void msg() {
		System.out.println("mobile must have msg function");
	}

}
