import org.junit.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.core.IsEqual.*;
/**
 * Created by rickiecashwell on 3/21/17.
 */
public class CardTest {
    @Test
    public void goingFaceUpToFaceDown() throws Exception{
        Card card = new Card(Suit.DIAMONDS,Rank.ACE);
        card.faceUp = true;
        boolean flip = card.flip();
        assertThat(false, equalTo(flip));
    }
    @Test
    public void goingFacedownToFaceUp() throws Exception{
        Card card = new Card(Suit.DIAMONDS,Rank.ACE);
        card.faceUp = false;
        boolean flip = card.flip();
        assertThat(true, equalTo(flip));
    }
    @Test
    public void isCorrectRank(){
        Card card = new Card(Suit.HEARTS, Rank.ACE);
        assertThat(Rank.ACE, equalTo(card.getRank()));
    }
    @Test
    public void isCorrectSuit(){
        Card card = new Card(Suit.HEARTS, Rank.ACE);
        assertThat(Suit.HEARTS, equalTo(card.getSuit()));
    }
    @Test
    public void isAceAFaceCard(){
        Card card = new Card(Suit.HEARTS,Rank.ACE);
        boolean faceUp = Rank.ACE.getFaceValue();
        assertThat(true, equalTo(faceUp));
    }
    @Test
    public void isTwoAFaceCard(){
        Card card = new Card(Suit.HEARTS,Rank.TWO);
        boolean faceValue = Rank.TWO.getFaceValue();
        assertThat(false, equalTo(faceValue));
    }
    @Test
    public void isColorOfHeartsRed(){
        Card card = new Card(Suit.HEARTS,Rank.THREE);
        String color = Suit.HEARTS.getColor();
        assertThat("red", equalTo(color));
    }
    @Test
    public void isTheFirstCardTheSameColorAsTheSecond(){
        Card card1 = new Card(Suit.SPADE, Rank.QUEEN);
        Card card2 = new Card(Suit.DIAMONDS, Rank.KING);
        String card1Color = card1.getSuit().getColor();
        String card2Color = card2.getSuit().getColor();
        assertThat(false, equalTo(card1Color.equals(card2Color)));
    }
    @Test
    public void canPersonBeDealtDeck(){

    }

}
