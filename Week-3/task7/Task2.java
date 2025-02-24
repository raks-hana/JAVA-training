package task7;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>(List.of("Red", "Blue", "Green"));

		for (String color : colors) {
			System.out.println(color);
		}
	}
}
