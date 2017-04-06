import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.IsEqual.*;

/**
 * Created by rickiecashwell on 3/22/17.
 */
public class PersonTest {


    @Test
    public void canPersonHoldADeck(){
        Deck deck = new Deck();
        Person player = new Person();
        assertThat(player.getDeck(), equalTo(deck));
    }
    public void canPersonHaveAHandOfCards(){
        Deck deck = new Deck();
        Person player = new Person();
        player.getHand();

    }
}
