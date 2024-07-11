// Step 1: Import scanner and set up the main class
import java.util.Scanner;
public class MinutesConversion {
    public static void main(String[] args) {
        
        // Step 2: Declare variables for user input and conversion. consts for hours and days
        int minutes;
        double hours;
        double days;
        double MINS_IN_HR = 60;
        double HRS_IN_DAY = 24;
        // Step 3: Prompt the user for input using Scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter minutes to be converted: ");
        minutes = input.nextInt();

        // Step 4: Calculate to convert minutes to hours and days
        hours = minutes / MINS_IN_HR;
        days = hours / HRS_IN_DAY;

        // Step 5: Display the result
        System.out.println(minutes  + " minutes is " + String.format("%.2f", days) + " days, or " + hours + " hours.");

        input.close();
    }
}