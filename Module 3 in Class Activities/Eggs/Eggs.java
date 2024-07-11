// Step 1: Import Scanner and set up main class
import java.util.Scanner;
public class Eggs {
    public static void main(String[] args) {

        // Step 2: Define constants for the prices
        final double DOZEN_PRICE = 3.25;
        final double INDIVIDUAL_PRICE = 0.45;

        // Step 3: Prompt the user for input using Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("How many eggs are you buying?");
        int numberOfEggs = input.nextInt();

        // Step 4: Calculate the number of dozens and individual eggs
        int dozens = numberOfEggs / 12;
        int looseEggs = numberOfEggs % 12;

        // Step 5: Caluclate the total cost
        double totalCost = (dozens * DOZEN_PRICE) + (looseEggs * INDIVIDUAL_PRICE);

        // Step 6: Write output
        System.out.printf("You ordered %d eggs. That's %d dozen at $%.2f per dozen and %d loose eggs at $%.2f cents each for a total price of $%.2f.%n" , 
                          numberOfEggs, dozens, DOZEN_PRICE, looseEggs, INDIVIDUAL_PRICE, totalCost);

        // Close the scanner
        input.close();
    }
}