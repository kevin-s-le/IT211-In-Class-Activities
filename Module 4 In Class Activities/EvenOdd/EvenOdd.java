import java.util.Scanner;
public class EvenOdd {
    public static void main(String [] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the integer that the user inputs

        // Determine whether the integer is even or odd
        boolean isEven = isEven(number);

        // Display the result
        if(isEven) {
            System.out.println("The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }

        scanner.close();
    }

    // Method to check if number is even
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}