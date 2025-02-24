package task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4 {
	public static void readNumbers(String filePath) throws Exception {
		File file = new File(filePath);
		Scanner scanner = new Scanner(file);

		while (scanner.hasNext()) {
			int number = scanner.nextInt();
			if (number > 0) {
				scanner.close();
				throw new Exception("Positive number found: " + number);
			}
			System.out.println("Valid number: " + number);
		}
		scanner.close();
	}

	public static void main(String[] args) {
		try {
			readNumbers("C:\\Users\\raksh\\OneDrive\\Documents\\Tech Mahindra Training\\Core JAVA\\IOTest\\Test2.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Exception caught: File not found.");
		} catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
