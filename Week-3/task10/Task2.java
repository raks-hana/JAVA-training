package task10;

import Techmm.ThreadEx2;

class BankAccount {
    private int balance = 0;
    synchronized void withdraw(int amount) {
        System.out.println("Trying to withdraw: " + amount);
        while (balance < amount) {
            System.out.println("Insufficient balance. Waiting for deposit...");
            try{wait();}catch(Exception e){}
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: " + balance);
    }
    synchronized void deposit(int amount) {
        System.out.println("Depositing: " + amount);
        balance += amount;
        System.out.println("Deposit successful! New balance: " + balance);
        notify();
    }
}
public class Task2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        BankAccount ba = new BankAccount();
        new Thread() {public void run() {ba.withdraw(15000);}}.start();
        new Thread() {public void run() {ba.deposit(10000);}}.start();
    }
}
