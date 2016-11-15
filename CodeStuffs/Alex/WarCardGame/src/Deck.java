import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<Card>();
    private static String[] cardSuits = {"Diamond", "Hearts", "Spades", "Clubs"};
    private static String[] cardTypes = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public Deck() {
        for (int s = 0; s < cardSuits.length; s++) {
            String suit = cardSuits[s];
            for (int t = 0; t < cardTypes.length; t++) {
                String type = cardTypes[t];
                deck.add(new Card(type, suit));
                System.out.println(type + " of " + suit);
            }
        }

    }

    public void shuffle() {
        ArrayList<Card> shuffledDeck = new ArrayList<Card>();
        for (int i = 0; i < deck.size(); i++) {
            int randomCardIndex = (int) Math.random() * (deck.size() + 1);
            Card randomCard = deck.get(randomCardIndex);
            shuffledDeck.add(randomCard);
            deck.remove(randomCardIndex);
        }
        deck = shuffledDeck;
    }
}
