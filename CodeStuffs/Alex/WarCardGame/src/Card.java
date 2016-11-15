public class Card {
    private String type;
    private String suit;
    private String name;
    private int value;

    public Card(String type, String suit) {
        this.name = getName();
        this.type = type;
        this.suit = suit;
        this.value = getValue();
    }

    public String getName() {
        return String.join("%s of %s", type, suit);
    }

    public int getValue() {
        if (type == "Jack") {
            value = 11;
        } else if (type == "Queen") {
            value = 12;
        } else if (type == "King") {
            value = 13;
        } else if (type == "Ace") {
            value = 14;
        } else {
            value = Integer.parseInt(type);
        }
        return value;
    }


}

