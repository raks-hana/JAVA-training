package task3;

import java.io.File;

public class Task4 {
	public static void main(String[] args) {
		File file = new File("C:\\\\Users\\\\raksh\\\\OneDrive\\\\Documents\\\\Tech Mahindra Training\\\\Core JAVA\\\\IOTest\\\\Test.txt"); 

		System.out.println("Readable: " + file.canRead());
		System.out.println("Writable: " + file.canWrite());
	}
}
