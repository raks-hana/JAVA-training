package task7;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>(List.of("Red", "Blue", "Green"));
		ArrayList<String> list2 = new ArrayList<>(list1);

		System.out.println("Copied List: " + list2);
	}
}
