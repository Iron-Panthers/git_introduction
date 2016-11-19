import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<Card>();
    public static String[] cardSuits = {"Diamonds", "Hearts", "Spades", "Clubs"};
    public static String[] cardTypes = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};

    public Deck() {
        for (int s = 0; s < cardSuits.length; s++) {
            String suit = cardSuits[s];
            for (int t = 0; t < cardTypes.length; t++) {
                String type = cardTypes[t];
                deck.add(new Card(type, suit));
            }
        }
        shuffle();
    }

    public Deck(ArrayList<Card> cards) {
        for (Card card : cards) {
            deck.add(card);
        }
    }

    public Card drawCard() {
        if (deck.size() > 0) {
            Card card = deck.get(0);
            deck.remove(0);
            return card;
        } else {
            return null;
        }
    }

    public void addCard(Card card) {
        deck.add(card);
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public int getDeckSize() {
        return deck.size();
    }

    public void shuffle() {
        ArrayList<Card> shuffledDeck = new ArrayList<Card>();
        int originalDeckSize = deck.size();
        for (int i = 0; i < originalDeckSize; i++) {
            int randomCardIndex = (int) (Math.random() * deck.size());
            Card randomCard = deck.get(randomCardIndex);
            shuffledDeck.add(randomCard);
            deck.remove(randomCardIndex);
        }
        deck = shuffledDeck;
    }

    public String toString() {
        String returnString = "";
        for (Card card : deck) {
            returnString += String.format("%s\n", card);
        }
        return returnString;
    }
}
