package task4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3 {
	public static void readFile(String filePath) throws FileNotFoundException {
		File file = new File(filePath);
		Scanner scanner = new Scanner(file); 
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
		scanner.close();
	}

	public static void main(String[] args) {
		try {
			readFile("Test.txt"); 
		} catch (FileNotFoundException e) {
			System.out.println("Exception caught: File not found.");
		}
	}
}
