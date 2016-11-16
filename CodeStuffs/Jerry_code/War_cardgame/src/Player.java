import java.util.ArrayList;

public class Player {
	ArrayList<Cards> pDeck = new ArrayList<>();
		
	int id;
	
	public Player(int id) {
		this.id = id;
	}
	
	public void getDeck(Deck deck) {
		//i know this is a terrible way but too i'm lazy to think
		if(id == 1) {
			for(int i = 0; i < 26; i++) {
				pDeck.add(deck.deck.get(i));
			}
		} else if(id == 2) {
			for(int i = 26; i < 52; i++) {
				pDeck.add(deck.deck.get(i));
			}
		}
	}
	
	public Cards draw() {
		Cards crd = pDeck.get(0);
		pDeck.remove(0);
		return crd;
	}
	
	public void addCards(Cards...card) {
		for(Cards crd : card) {
			pDeck.add(crd);
		}
	}
}
