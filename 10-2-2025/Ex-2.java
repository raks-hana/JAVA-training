package Techmm;

public class Ex2IO {
    public static void main(String[] args) {
        Ex2IO.callSop();
        Ex2IO.callSopln();
        Ex2IO ex = new Ex2IO();
        ex.callSoperr();
    }
    public static void callSop(){
        System.out.print("Hi! ");
        System.out.print("Welcome ");
    }
    public static void callSopln(){
        System.out.println("Player!");
        System.out.println("Begin Adventure");
        System.out.println("Enter Dungeon");
    }
    public void callSoperr(){
        System.err.print("Oops! You have died, ");
        System.err.print("Try again...");
    }
}
