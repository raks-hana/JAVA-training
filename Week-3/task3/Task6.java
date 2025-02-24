package task3;

import java.io.File;
import java.text.SimpleDateFormat;

public class Task6 {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\raksh\\OneDrive\\Documents\\Tech Mahindra Training\\Core JAVA\\IOTest\\Test.txt"); 

		if (file.exists()) {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			System.out.println("Last Modified: " + sdf.format(file.lastModified()));
		} else {
			System.out.println("File does not exist.");
		}
	}
}
