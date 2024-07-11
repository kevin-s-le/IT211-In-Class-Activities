// Step 1: Set up the main class and import any necessary packages
import java.util.Scanner;

public class Percentages {
    public static void main(String[] args) {
        // Step 2: Declare variables for user input
        double num1, num2;

        // Step 3: Use Scanner to get input from user for the value of double
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the first double >> ");
        num1 = kb.nextDouble();
        System.out.println("Enter a second double >> ");
        num2 = kb.nextDouble();
        // Step 4: Pass the value to a method named computePercent()
        computePercent(num1, num2);
        computePercent(num2, num1);

        kb.close();
    }
    // Step 5: Call the computePercent() method with the original and reversed values
    public static void computePercent(double x, double y) {
        System.out.println(x + " is " + (x/y) +"% of " + y);
    }
}