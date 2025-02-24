package task5;

public class Task1 extends Thread {
	public void run() {
		System.out.println("Hello, Java!");
	}

	public static void main(String[] args) {
		Task1 thread = new Task1();
		thread.start();
	}
}
