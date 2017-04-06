import java.util.Random;

/**
 * Created by rickiecashwell on 3/21/17.
 */
public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck);
        Person player = new Person();
        System.out.println(player.getHand());
        System.out.println("there are "+player.getdeckCount()+" cards left in deck");


    }
}
