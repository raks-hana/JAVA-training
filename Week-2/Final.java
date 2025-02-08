package Techmm;

// Final class: Cannot be extended
final class FinalClass {
    // Final variable: Its value cannot be changed once assigned
    final int val = 100;

    // Final method: Cannot be overridden by subclasses
    public final void displayMessage() {
        System.out.println("Final method cannot be overridden");
    }
}

public class FinalOne {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        System.out.println("Final variable value: " + val);
        obj.displayMessage();
    }
}
