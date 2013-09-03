package net.nolasaint.misc.cards;

public class Cards {
	
	public static void main(String[] args) {
		Deck cardDeck = new Deck(2);
		cardDeck.shuffle();	
		int[] hand = cardDeck.draw(5);
		
		for (int i : hand) {
			System.out.println(Card.toString(i));
			
		}
		
	}
	
}