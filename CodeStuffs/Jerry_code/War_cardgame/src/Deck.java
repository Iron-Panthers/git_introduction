import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	
	public ArrayList<Cards> deck = new ArrayList<>();
	
	public Deck() {}
	
	public void resetDeck() {
		for(Cards c: Cards.values()) {
			deck.add(c);
			deck.add(c);
			deck.add(c);
			deck.add(c);
		}
		Collections.shuffle(deck);
	}
}
