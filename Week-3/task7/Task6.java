package task7;

import java.util.ArrayList;
import java.util.List;

public class Task6 {

	public static void main(String[] args) {
		ArrayList<String> colors = new ArrayList<>(List.of("Red", "Blue", "Green", "Yellow"));
		colors.remove(2);

		System.out.println("After Removal: " + colors);
	}
}
