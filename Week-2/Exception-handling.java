package Techmm;
import java.util.Scanner;

public class ExceptionHandling {
  
    public static void processInput() {
        Scanner scanner = new Scanner(System.in);
        double number = 0;

        try {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine(); // Read input as a string
            number = Double.parseDouble(input); // Convert to double
            
            double reciprocal = 1 / number; // Calculate reciprocal
            System.out.println("Reciprocal: " + reciprocal);
            
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter a valid number.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } finally {
            scanner.close(); // Close scanner to prevent resource leak
            System.out.println("Process completed.");
        }
    }

    public static void main(String[] args) {
        processInput();
    }
}
