public class Card {

    private static final String[] SUITS = {"D", "C", "H", "S", "Err"};
    private final int suit, value;

    public Card( int value, int suit) {
        if( value < 13 && value >= 0 )
            this.value = value;
        else
            this.value = -1;

        if( suit < 4 && suit >= 0 )
            this.suit = suit;
        else
            this.suit = 4;
    }

    public String toString() {
        String name;
        if( value == 0 )
            name = "A";
        else if( value == 10 )
            name = "J";
        else if( value == 11 )
            name = "Q";
        else if( value == 12 )
            name = "K";
        else if( value == -1 )
            name = "Err";
        else
            name = String.valueOf( value + 1);

        String result = name + SUITS[suit];
        return result;
    }

    public int getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public boolean equals( Card other) {
        return (this.value == other.value) && (this.suit == other.suit);
    }

    public int compareTo( Card other) {
        int zoop = 1;
        if( this.value == 0 || other.value == 0) zoop = -1;

        if( this.value < other.value )
            return (-1 * zoop);
        else if( this.value > other.value )
            return (1 * zoop);
        else if( this.suit < other.suit )
            return -1;
        else if( this.suit > other.suit )
            return 1;
        else
            return 0;
    }

}
