import java.util.ArrayList;

public class Player {
    public Card card;
    private Card[] tieBreakerCards = new Card[3];
    public Deck hand;
    //private boolean computer = false;

    public Card drawCard() {
        Card card = hand.drawCard();
        this.card = card;
        Main.drawedCards.add(card);
        return card;
    }

    public void addCard(Card card) {
        hand.addCard(card);
    }

    public Card[] drawTieBreakerCards() {
        for (int i = 0; i < 3; i++) {
            tieBreakerCards[i] = hand.drawCard();
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
