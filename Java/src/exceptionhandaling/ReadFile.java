package exceptionhandaling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFile {

	FileInputStream fis;

	void connection() throws FileNotFoundException {
		fis = new FileInputStream("E:\\ThinkQuetint\\Text.txt");
	}

	void readData() {
		int i, count = 0;
		try {
			while ((i = fis.read()) != -1) {
				if (i != -1) {
					count++;
					System.out.print((char) i);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
//		System.out.println("number of cha. is : "+count);
	}

	void countCharactor() {

	}

	public static void main(String[] args) throws FileNotFoundException {

		ReadFile obj = new ReadFile();
		
		obj.connection();
		obj.readData();
		obj.countCharactor();
	}
}