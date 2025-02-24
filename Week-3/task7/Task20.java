package task7;

import java.util.LinkedList;
import java.util.List;

public class Task20 {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<>(List.of("Red", "Blue", "Green"));
		System.out.println("First: " + list.getFirst());
		System.out.println("Last: " + list.getLast());
	}
}
