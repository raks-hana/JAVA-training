package Techmm1;

public class ThreadTwo extends Thread {
    public void run(){
        System.out.println("From ThreadTwo");
        System.out.println("From ThreadTwo");
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        ThreadTwo t1 = new ThreadTwo();
        t1.start();
        t1.run();
    }
}
