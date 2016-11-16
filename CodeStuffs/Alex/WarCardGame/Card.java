import java.util.Arrays;

public class Card {
    private String type;
    private String suit;
    private String name;
    private int value;

    public Card(String type, String suit) {
        this.type = type;
        this.suit = suit;
        this.name = getName();
        this.value = getValue();
    }

    public String getName() {
        return String.format("%s of %s", type, suit);
    }

    public int getValue() {
        int index = Arrays.asList(Deck.cardTypes).indexOf(type);
        index += 2;
        return index;
    }

    public String toString() {
        return String.format("%s (%s)", name, value);
    }

}

