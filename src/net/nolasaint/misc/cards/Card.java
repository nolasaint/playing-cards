package net.nolasaint.misc.cards;

public class Card {
	
	// Spades
	public static final int ACE_SPADES = 1;
	public static final int TWO_SPADES = 2;
	public static final int THREE_SPADES = 3;
	public static final int FOUR_SPADES = 4;
	public static final int FIVE_SPADES = 5;
	public static final int SIX_SPADES = 6;
	public static final int SEVEN_SPADES = 7;
	public static final int EIGHT_SPADES = 8;
	public static final int NINE_SPADES = 9;
	public static final int TEN_SPADES = 10;
	public static final int JACK_SPADES = 11;
	public static final int QUEEN_SPADES = 12;
	public static final int KING_SPADES = 13;

	// Diamonds
	public static final int ACE_DIAMONDS = 14;
	public static final int TWO_DIAMONDS = 15;
	public static final int THREE_DIAMONDS = 16;
	public static final int FOUR_DIAMONDS = 17;
	public static final int FIVE_DIAMONDS = 18;
	public static final int SIX_DIAMONDS = 19;
	public static final int SEVEN_DIAMONDS = 20;
	public static final int EIGHT_DIAMONDS = 21;
	public static final int NINE_DIAMONDS = 22;
	public static final int TEN_DIAMONDS = 23;
	public static final int JACK_DIAMONDS = 24;
	public static final int QUEEN_DIAMONDS = 25;
	public static final int KING_DIAMONDS = 26;

	// Clubs
	public static final int ACE_CLUBS = 27;
	public static final int TWO_CLUBS = 28;
	public static final int THREE_CLUBS = 29;
	public static final int FOUR_CLUBS = 30;
	public static final int FIVE_CLUBS = 31;
	public static final int SIX_CLUBS = 32;
	public static final int SEVEN_CLUBS = 33;
	public static final int EIGHT_CLUBS = 34;
	public static final int NINE_CLUBS = 35;
	public static final int TEN_CLUBS = 36;
	public static final int JACK_CLUBS = 37;
	public static final int QUEEN_CLUBS = 38;
	public static final int KING_CLUBS = 39;

	// Hearts
	public static final int ACE_HEARTS = 40;
	public static final int TWO_HEARTS = 41;
	public static final int THREE_HEARTS = 42;
	public static final int FOUR_HEARTS = 43;
	public static final int FIVE_HEARTS = 44;
	public static final int SIX_HEARTS = 45;
	public static final int SEVEN_HEARTS = 46;
	public static final int EIGHT_HEARTS = 47;
	public static final int NINE_HEARTS = 48;
	public static final int TEN_HEARTS = 49;
	public static final int JACK_HEARTS = 50;
	public static final int QUEEN_HEARTS = 51;
	public static final int KING_HEARTS = 52;

	// Jokers
	public static final int JOKER_BLACK = 53;
	public static final int JOKER_RED = 54;
	
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
