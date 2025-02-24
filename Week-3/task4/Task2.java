package task4;

public class Task2 {
	public static void checkEven(int num) throws Exception {
		if (num % 2 != 0) {
			throw new Exception("Odd number detected! Exception thrown.");
		}
		System.out.println("The number is even: " + num);
	}

	public static void main(String[] args) {
		try {
			checkEven(5); 
		} catch (Exception e) {
			System.out.println("Exception caught: " + e.getMessage());
		}
	}
}
