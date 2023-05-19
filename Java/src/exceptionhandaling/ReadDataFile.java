package exceptionhandaling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDataFile {
	public static void main(String[] args) throws IOException {

		try {
			FileInputStream fis = new FileInputStream("E:\\ThinkQuetint\\Text.txt");

			int i;
			while ((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
