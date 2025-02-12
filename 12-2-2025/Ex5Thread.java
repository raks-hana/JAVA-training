package Techmm;

public class TaskOne {
    public static void main(String[] args) {
        ThreadTask t1 = new ThreadTask();
        t1.start();
    }
}
    class ThreadTask extends Thread {
    public void run() {
        System.out.println("Raksha");
        System.out.println("Thread");
        System.out.println("Task");
    }
}
