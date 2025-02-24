package task3;

import java.io.File;

public class Task8 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\raksh\\OneDrive\\Documents\\Tech Mahindra Training\\Core JAVA\\IOTest\\Test.txt"); 

		if (file.exists() && file.isFile()) {
			long fileSize = file.length(); 
			System.out.println("Size in Bytes: " + fileSize);
			System.out.println("Size in KB: " + (fileSize / 1024.0));
			System.out.println("Size in MB: " + (fileSize / (1024.0 * 1024)));
		} else {
			System.out.println("File does not exist.");
		}
	}
}
