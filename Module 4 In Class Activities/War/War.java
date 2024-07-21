import java.util.Random;

public class War {

    public static void main(String[] args) {
    Random random = new Random();
    // Suit array for random suit selection
    char[] suits = {'s', 'h', 'd', 'c'};
    // Generate random suit and value for computer card
    char computerSuit = suits[random.nextInt(4)];
    int computerValue = random.nextInt(13) + 1;
    // Generate random suit and value for player
    char playerSuit = suits[random.nextInt(4)];
    int playerValue = random.nextInt(13) + 1;
    // Ensure the two cards are not identical
    while (computerSuit == playerSuit && computerValue == playerValue) {
        playerSuit = suits[random.nextInt(4)];
        }
        // Create the cards
        Card computerCard = new Card(computerSuit, computerValue);
        Card playerCard = new Card(playerSuit, playerValue);
        // Display the cards
        System.out.println("Your card is the " + playerCard + ".");
        System.out.println("Opponent's card is the " + computerCard + ".");

        // Compare the cards and display the result
        if (computerCard.getValue() > playerCard.getValue()) {
            System.out.println("Computer wins!");
        } else {
            System.out.println("Player Wins!");
        }
    }
}

