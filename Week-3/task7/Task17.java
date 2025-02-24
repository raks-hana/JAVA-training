package task7;

import java.util.LinkedList;
import java.util.List;

public class Task17 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(List.of("Red", "Blue"));
		list.addFirst("Green");

		System.out.println("Updated List: " + list);
	}
}
