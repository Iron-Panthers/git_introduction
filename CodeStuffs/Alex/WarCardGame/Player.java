import java.util.ArrayList;

public class Player {
    private Card card;
    private Card[] tieBreakerCards = new Card[3];
    private Deck deck;
    private boolean computer = false;

    public Player() {
        this.deck = Main.deck;
    }

    public Player(boolean computer) {
        this.deck = Main.deck;
        this.computer = computer;

    }

    public Card drawCard() {
        Card card = deck.drawCard();
        this.card = card;
        return card;
    }

    public Card getCard() {
        return card;
    }

    public Card[] drawTieBreakerCards() {
        for (int i = 0; i < 3; i++) {
            tieBreakerCards[i] = deck.drawCard();
            if (tieBreakerCards[i] == null) {
                return null;
            }
        }
        return tieBreakerCards;

    }

    public Card[] getTieBreakerCards() {
        return tieBreakerCards;
    }

}
