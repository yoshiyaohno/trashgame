import java.util.*;
import java.io.*;

public class GameTest {
    // fields
    private List<Card> hand;
    private List<Card> discard;
    private Deck deck;

    private InputStreamReader isr;
    private BufferedReader in;

    // constructors
    public GameTest() {
        isr = new InputStreamReader( System.in );
        in = new BufferedReader( isr );
        deck = new Deck();
        hand = new LinkedList();
        discard = new ArrayList();
    }

    // methods
    public static void main( String[] args) {
        for( int i = 0 ; i < 5 ; ++i )
            hand.add( deck.draw() );
        
        while( true ) {
            System.out.println( hand);
        }
    }

}
