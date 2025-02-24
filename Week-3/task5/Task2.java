package task5;

class Even extends Thread {
	public void run() {
		for (int i = 2; i <= 20; i += 2) {
			System.out.println("Even: " + i);
		}
	}
}

class Odd extends Thread {
	public void run() {
		for (int i = 1; i <= 20; i += 2) {
			System.out.println("Odd: " + i);
		}
	}
}

public class Task2 {
	public static void main(String[] args) {
		Even Even = new Even();
		Odd Odd = new Odd();

		Even.start();
		Odd.start();
	}
}
