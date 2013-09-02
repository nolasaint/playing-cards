package net.nolasaint.misc.cards;

public class Cards {
	
	public static void main(String[] args) {
		Deck cardDeck = new Deck();
		cardDeck.shuffle();
		
		int[] hand = {
				cardDeck.draw(),
				cardDeck.draw(),
				cardDeck.draw(),
				cardDeck.draw(),
				cardDeck.draw()
				};
		
		
		
		for (int i : hand) {
			
			// Checks if card is in next deck
			if (i > cardDeck.getDeckSize()) i -= cardDeck.getDeckSize();
			
			System.out.println(Card.toString(i));
			
		}
		
	}
	
}