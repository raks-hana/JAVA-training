package task3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task10 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\raksh\\OneDrive\\Documents\\Tech Mahindra Training\\Core JAVA\\IOTest\\Test1.txt"))) {
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}
	}
}
