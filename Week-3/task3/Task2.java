package task3;

import java.io.File;
import java.io.FilenameFilter;

public class Task2{
	public static void main(String[] args) {
		File folder = new File("C:\\Users\\raksh\\OneDrive\\Documents\\Tech Mahindra Training\\Core JAVA\\IOTest"); 
		String extension = ".txt";

		FilenameFilter filter = (dir, name) -> name.endsWith(extension);
		String[] files = folder.list(filter);

		if (files != null) {
			for (String file : files) {
				System.out.println(file);
			}
		} else {
			System.out.println("No files found.");
		}
	}
}
