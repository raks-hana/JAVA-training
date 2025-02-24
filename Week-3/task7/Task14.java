package task7;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Task14 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(List.of("Red", "Blue", "Green"));
		Collections.reverse(list);

		for (String item : list) {
			System.out.println(item);
		}
	}
}
