import java.util.LinkedList;
import java.util.List;

public class Deck {

    private List<Card> cards = new LinkedList<Card>();

    public Deck() {
        this(1);
    }

    public Deck( int size) {
        for( int i = 0; i < size; ++i )
            for( int suit = 0; suit < 4; ++suit )
                for( int value = 0; value < 13; ++value )
                    cards.add( new Card( value, suit));
    }

    public String toString() {
        String result = cards.toString();
        return result;
    }

    public Card draw() {
        if( cards.size() == 0 ) return new Card(-1,-1);
        int rand = (int)( Math.random() * cards.size());
        Card drawn = cards.remove( rand);
        return drawn;
    }

    public int size() {
        return cards.size();
    }

}
