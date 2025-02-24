package task3;

import java.io.File;

public class Task1 {
	public static void main(String[] args) {
		File folder = new File("C:\\Users\\raksh\\OneDrive\\Documents\\Tech Mahindra Training"); 
		String[] files = folder.list();

		if (files != null) {
			for (String file : files) {
				System.out.println(file);
			}
		} else {
			System.out.println("Directory does not exist.");
		}
	}
}
