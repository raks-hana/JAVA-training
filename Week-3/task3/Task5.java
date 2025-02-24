package task3;

import java.io.File;

public class Task5 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\raksh\\OneDrive\\Documents\\Tech Mahindra Training\\Core JAVA\\IOTest\\Test.txt"); 

		if (file.isDirectory()) {
			System.out.println("It is a directory.");
		} else if (file.isFile()) {
			System.out.println("It is a file.");
		} else {
			System.out.println("Not a valid file or directory.");
		}
	}
}
