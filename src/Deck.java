import java.util.ArrayList;

/**
 * Created by rickiecashwell on 3/22/17.
 */
public class Deck {
    private ArrayList<Card> deck;
    Suit suit;
    Rank rank;

    public Deck(){
       int count = 0;
        deck = new ArrayList<>();
        for(int x = 0; x < 1; x++){
            for(Rank rank: Rank.values()) {
                for (Suit suit : Suit.values()) {
                    deck.add(new Card(suit, rank));
                    count++;
                }
                }
            }
        System.out.println("there are: "+count+" cards in deck");
        }

    public ArrayList<Card> getDeck(){
        return deck;
    }
    public String toString() {
        return "Deck{" +
                "deck=" + deck +"\n";

    }
}
