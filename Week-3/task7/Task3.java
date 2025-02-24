package task7;

import java.util.ArrayList;
import java.util.List;

public class Task3 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>(List.of("Blue", "Green"));
		colors.add(0, "Red");

		System.out.println("Updated List: " + colors);
	}
}
