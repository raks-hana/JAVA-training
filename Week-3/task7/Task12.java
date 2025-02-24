package task7;

import java.util.LinkedList;
import java.util.List;

public class Task12 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(List.of("Red", "Blue", "Green"));

		for (String item : list) {
			System.out.println(item);
		}
	}
}
