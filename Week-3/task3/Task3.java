package task3;

import java.io.File;

public class Task3 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\raksh\\OneDrive\\Documents\\Tech Mahindra Training\\Core JAVA\\IOTest\\Test.txt"); 
		if (file.exists()) {
			System.out.println("File exists.");
		} else {
			System.out.println("File does not exist.");
		}
	}
}
