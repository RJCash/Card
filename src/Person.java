import java.util.ArrayList;
import java.util.Random;

/**
 * Created by rickiecashwell on 3/22/17.
 */
public class Person {
    Deck thedeck;
    ArrayList<Card> deck;
    ArrayList<Card> hand = new ArrayList<Card>();
    int handCount = 0;
    int deckCount = 0;
    public Person(){
    }
    public Object getDeck() {
        return deck;
    }
    public int getdeckCount(){
        return this.deckCount;
    }
    public Object getHand() {
       int handCount = 0;
        Deck deckClass = new Deck();
        ArrayList<Card> deck = deckClass.getDeck();
        Random generator = new Random(52);
        for(int x = 0; x < 6; x++){
            hand.add(deck.get(generator.nextInt(deck.size())));
            deck.remove(generator.nextInt(deck.size()));
            handCount++;
        }
        int deckCount = deck.size();
        this.deck = deck;
        this.handCount = handCount;
        this.deckCount = deckCount;
        return hand;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hand=" + hand +
                ", handCount=" + handCount +
                ", deckCount=" + deckCount +
                '}';
    }
}
