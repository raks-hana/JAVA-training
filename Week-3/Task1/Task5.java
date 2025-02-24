package task1;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = sc.next();
		StringBuilder res = new StringBuilder();

		for (int i=0; i<str.length(); i++) {
			if (i % 2 == 0) {
				res.append(Character.toUpperCase(str.charAt(i)));
			} else {
				res.append(Character.toLowerCase(str.charAt(i)));
			}
		}

		System.out.println("Changed String: " + res);
		sc.close();
	}
}
