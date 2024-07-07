import java.util.Scanner;
public class QuartsToGallonsInteractive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int QUARTS_IN_GALLON = 4;
        int quartsNeeded = 0;
        System.out.println("How many quarts do you need?");
        quartsNeeded = input.nextInt();
        int gallonsNeeded;
        int extraQuartsNeeded;
        gallonsNeeded = quartsNeeded / QUARTS_IN_GALLON;
        extraQuartsNeeded = quartsNeeded % QUARTS_IN_GALLON;
        System.out.println("A job that needs " + quartsNeeded + " quarts required " + gallonsNeeded + " gallons plus " + 
        extraQuartsNeeded + " quarts.");
        input.close();
    }
}