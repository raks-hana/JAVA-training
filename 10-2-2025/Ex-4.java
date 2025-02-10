package Techmm;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Ex3IO {
    public static void main(String[] args) throws IOException {
        Ex3IO obj = new Ex3IO();
        Ex3IO.getBufferedClass();
        obj.getScannerClass();
    }

    public static void getBufferedClass() throws IOException {
        // Enter data using BufferReader
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter String input:");
        String s = r.readLine();
        System.out.println("You entered string using Buffer: " + s);
        System.out.println("Enter int input:");
        int n = Integer.parseInt(r.readLine());
        System.out.println("You entered int using Buffer: " + n);
        System.out.println("Enter float input:");
        float f = Float.parseFloat(r.readLine());
        System.out.println("You entered float using Buffer: " + f);
    }

    public void getScannerClass() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the input string :");
        String s1 = s.nextLine();
        System.out.println("You entered string using Scanner: " + s1);

        System.out.println("Enter the input integer :");
        int a = s.nextInt();
        System.out.println("You entered integer using Scanner: " + a);

        System.out.println("Enter the input float :");
        float b = s.nextFloat();
        System.out.println("You entered float using Scanner: " + b);
    }
}
