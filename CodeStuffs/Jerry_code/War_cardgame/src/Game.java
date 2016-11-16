import java.util.ArrayList;

public class Game {
	
	public static void run(Deck deck, Player p1, Player p2) {
		deck.resetDeck();
		p1.getDeck(deck);
		p2.getDeck(deck);
		
		boolean war = false;
		
		ArrayList<Cards> warDeck = new ArrayList<>();
		
		//main game loop
		//very poorly written idgaf
		
		while(true) {
			
			if(p1.pDeck.size() == 0 || p2.pDeck.size() == 0) { break; }
			warDeck.clear();
			war = false;
			
			Cards p1Draw = p1.draw();
			Cards p2Draw = p2.draw();
			
			System.out.println("player 1 has drawn a " + p1Draw.name());
			System.out.println("player 2 has drawn a " + p2Draw.name());
			System.out.println();
			
			//card checker
			if(p1Draw.value > p2Draw.value) {
				p1.addCards(p1Draw, p2Draw);
				System.out.println("player 1 has won the battle");
				System.out.println();
			} 
			
			else if (p2Draw.value > p1Draw.value) {
				p2.addCards(p1Draw, p2Draw);
				System.out.println("player 2 has won the battle");
				System.out.println();
			} 
			//WARRRRR
			else {
				System.out.println("WAR HAS STARTED");
				war = true;
				
				while(war) {
					if(p1.pDeck.size() == 0 || p2.pDeck.size() == 0) { break; }
					
					Cards[] facedown = {
							p1.draw(),
							p2.draw()
					};
					
					p1Draw = p1.draw();
					p2Draw = p2.draw();
					
					System.out.println("player 1 has drawn a " + p1Draw.name());
					System.out.println("player 2 has drawn a " + p2Draw.name());
					System.out.println();
					warDeck.add(p1Draw); 
					warDeck.add(p2Draw);
					
					//card checker
					if(p1Draw.value > p2Draw.value) {
						for(Cards card:warDeck) {
							p1.pDeck.add(card);
						}
						p1.pDeck.add(facedown[0]);
						p1.pDeck.add(facedown[1]);
						System.out.println("player 1 has won the war");
						war = false;
					}
					else if(p2Draw.value > p1Draw.value) {
						for(Cards card:warDeck) {
							p2.pDeck.add(card);
						}
						p2.pDeck.add(facedown[0]);
						p2.pDeck.add(facedown[1]);
						System.out.println("player 2 has won the war");
						war = false;
					}
					//facedown cards checker
					else {
						if(facedown[0].value > facedown[1].value) {
							for(Cards card:warDeck) {
								p1.pDeck.add(card);
							}
							p1.pDeck.add(facedown[0]);
							p1.pDeck.add(facedown[1]);
							System.out.println("player 1 has won the war");
							war = false;
						}
						else if(facedown[1].value > facedown[0].value) {
							for(Cards card:warDeck) {
								p2.pDeck.add(card);
							}
							p2.pDeck.add(facedown[0]);
							p2.pDeck.add(facedown[1]);
							System.out.println("player 2 has won the war");
							war = false;
						} 
						else {
							warDeck.add(facedown[0]);
							warDeck.add(facedown[1]);
						}
					}
				}
			}
			//so the game doesn't go supersonic
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		if(p1.pDeck.size() != 0) {
			System.out.println("player 1 won the game");
		} else {
			System.out.println("player 2 won the game");
		}
	}
	
	public static void main(String[] args) {
		Deck deck = new Deck();
		Player player1 = new Player(1);
		Player player2 = new Player(2);
		
		Game.run(deck, player1, player2);
	}
}
