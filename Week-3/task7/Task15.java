package task7;

import java.util.LinkedList;
import java.util.List;

public class Task15 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(List.of("Red", "Blue"));
		list.add(1, "Yellow");

		System.out.println("Updated List: " + list);
	}
}
