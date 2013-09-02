package net.nolasaint.misc.cards;

public class Card {
	
	// Returns string representation of numerical card value
	public static String toString(int value) {
		
		if (value == 53) return "Black Joker";
		if (value == 54) return "Red Joker";
		
		// Determine suit and value
		int card = (value % 13 == 0) ? 13 : value % 13;
		int suit = (int) Math.floor((double) value / 13.25);
		String cardName = "";
		String suitName = "";
		
		switch (card) {
		case 1:
			cardName = "Ace";
			break;
		
		case 11:
			cardName = "Jack";
			break;
			
		case 12:
			cardName = "Queen";
			break;
			
		case 13:
			cardName = "King";
			break;
			
		default:
			cardName = String.valueOf(card);
			break;
			
		}
		
		switch (suit) {
		case 0:
			suitName = "Spades";
			break;
			
		case 1:
			suitName = "Diamonds";
			break;
			
		case 2:
			suitName = "Clubs";
			break;
			
		case 3:
			suitName = "Hearts";
			break;
			
		}
		
		return cardName.concat(" of ").concat(suitName);
		
	}
	
}
