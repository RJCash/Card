/**
 * Created by rickiecashwell on 3/21/17.
 */
public enum Rank {
    TWO(false),THREE(false),FOUR(false),FIVE(false),SIX(false),
    SEVEN(false),EIGHT(false),NINE(false),TEN(false),JACK(true),
    KING(true),QUEEN(true),ACE(true);
    boolean faceValue;

    Rank(boolean face) {
    this.faceValue = face;
    }

    public boolean getFaceValue() {
    return this.faceValue;
    }
}
