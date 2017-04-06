import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by rickiecashwell on 3/23/17.
 */
public class DeckTest {
    @Test
    public void isThere40CardsInDeck(){
        Deck deck = new Deck();
        int length = deck.getDeck().size();
        assertThat(52, equalTo(length));
    }
}
