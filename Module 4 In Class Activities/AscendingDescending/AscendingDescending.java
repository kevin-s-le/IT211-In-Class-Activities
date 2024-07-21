import java.util.Scanner;
import java.util.Arrays;

public class AscendingDescending {
    public static void main(String[] args) {
        // Create a Scanner object to collect user input
        Scanner scanner = new Scanner (System.in);
        // Prompt the user to enter three integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();

        // Create an Array to hold the three integers from user
        int[] numbers = {num1, num2, num3};
        // Sort the Array in ascending order
        Arrays.sort(numbers);
        // Display the numbers in ascending order
        System.out.println("Numbers in ascending order: " + numbers[0] + " " + numbers[1] + " " + numbers[2]);
        // Display the numbers in descending order
        System.out.println("Numbers in descending order: " + numbers[2] + " " + numbers[1] + " " + numbers[0]);

        scanner.close();
    }
}
