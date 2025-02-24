package task3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Task9 {
	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\raksh\\OneDrive\\Documents\\Tech Mahindra Training\\Core JAVA\\IOTest\\Test.txt");

		if (file.exists() && file.isFile()) {
			byte[] fileContent = Files.readAllBytes(file.toPath());
			System.out.println("File Content in Bytes: " + new String(fileContent));
		} else {
			System.out.println("File does not exist.");
		}
	}
}
