package task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task5 {
	public static void checkFileNotEmpty(String filePath) throws Exception {
		File file = new File(filePath);
		if (!file.exists()) {
			throw new FileNotFoundException("File does not exist.");
		}
		Scanner scanner = new Scanner(file);
		if (!scanner.hasNext()) {
			scanner.close();
			throw new Exception("File is empty.");
		}
		System.out.println("File is not empty. Reading content:");
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}

	public static void main(String[] args) {
		try {
			checkFileNotEmpty("C:\\Users\\raksh\\OneDrive\\Documents\\Tech Mahindra Training\\Core JAVA\\IOTest\\Test1.txt"); 
		} catch (FileNotFoundException e) {
			System.out.println("Exception caught: File not found.");
		} catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
