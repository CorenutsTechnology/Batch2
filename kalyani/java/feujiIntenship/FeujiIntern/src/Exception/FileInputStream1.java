package Exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStream1 implements file {

	public static void main(String[] args) {
		FileInputStream1 fileInputStream1 = new FileInputStream1();
		fileInputStream1.file();
	}

	@Override
	public void file() {
		FileInputStream fileInputStream = null;

		try {
			fileInputStream = new FileInputStream("/home:txt");

		} catch (FileNotFoundException e) {
			System.out.println("file not found exception " + e.getMessage());
		} finally {
			try {

				if (fileInputStream != null) {
					fileInputStream.close();

				}

			} catch (IOException e) {

				System.out.println("IoException " + e.getMessage());

				e.printStackTrace();
			}
		}

	}
}
