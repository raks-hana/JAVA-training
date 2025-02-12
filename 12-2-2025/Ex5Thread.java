package Techmm;

public class ThreadTask {
    public static void main(String[] args) {
        ThreadOne t1 = new ThreadOne();
        t1.start();
        ThreadTwo t2 = new ThreadTwo();
        t2.start();
        t2.run();
        ThreadThree t3 = new ThreadThree();
        t3.start();
        ThreadRunnableOne t4 = new ThreadRunnableOne();
        t4.run();
        ThreadRunnableTwo t5 = new ThreadRunnableTwo();
        t5.run();
        new Thread(t5).start();
    }
}
class ThreadOne extends Thread {
    public void run() {
        System.out.println("Raksha");
        System.out.println("Thread");
        System.out.println("Task");
    }
}
class ThreadTwo extends Thread {
    public void run(){
        System.out.println("From ThreadTwo");
        System.out.println("From ThreadTwo");
        //System.out.println(10/0);
    }
}
class ThreadThree extends Thread {
    public void run(){
        System.out.println("From ThreadThree");
        System.out.println("From ThreadThree");
        System.out.println("From ThreadThree");
        System.out.println("From ThreadThree");
        System.out.println("From ThreadThree");
    }
}
class ThreadRunnableOne implements Runnable {
    public void run() {
        System.out.println("From ThreadRunnableOne");
        System.out.println("From ThreadRunnableOne");
    }
}
class ThreadRunnableTwo implements Runnable {
    public void run() {
        System.out.println("From ThreadRunnableTwo");
        System.out.println("From ThreadRunnableTwo");
        System.out.println("From ThreadRunnableTwo");
    }
}
