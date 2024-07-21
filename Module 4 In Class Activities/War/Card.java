public class Card {
    private char suit; // s for spades, h for hearts, d for diamonds, or c for  clubs
    private int value; // 1 through 13

    // Constructor
    public Card(char suit, int value) {
        setSuit(suit);
        setValue(value);

    }

        // Get method for suit
        public char getSuit() {
            return suit;
        }

        // Set method for suit
        public void setSuit(char suit) {
            if (suit == 's' || suit == 'h' || suit == 'd' || suit == 'c') {
                this.suit = suit;
            } else {
                throw new IllegalArgumentException("Invalid suit");
            }
        }

        // Get method for value
        public int getValue() {
            return value;
        }

        // Set method for value
        public void setValue(int value) {
            if (value > 0 && value < 14) {
                this.value = value;
            } else {
                throw new IllegalArgumentException("Invalid value");
            }
    }

        // Method to convert suit into full string
        public String getSuitName() {
            switch (suit) {
                case 's':
                    return "Spades";
                case 'h':
                    return "Hearts";
                case 'd':
                    return "Diamonds";
                case 'c':
                    return "Clubs";
                default:
                    return "Unknown";
            }
        }

        // Override toString method
        @Override
        public String toString() {
            return getValue() + " of " + getSuitName();
        }
}