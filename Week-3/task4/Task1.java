package task4;

public class Task1 {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Exception caught: Division by zero is not allowed.");
		}
	}
}
