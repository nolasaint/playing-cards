package net.nolasaint.misc.cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	
	private final boolean hasJokers;
	private final int decks;
	
	private List<Integer> cards = new ArrayList<Integer>();
	private List<Integer> discard = new ArrayList<Integer>();
	
	public Deck() {
		hasJokers = false;
		decks = 1;
		
		generate();
		
	}
	
	public Deck(boolean hasJokers) {
		this.hasJokers = hasJokers;
		decks = 1;
		
		generate();
		
	}
	
	public Deck(int decks) {
		hasJokers = false;
		this.decks = decks;
		
		generate();
		
	}
	
	public Deck(boolean hasJokers, int decks) {
		this.hasJokers = hasJokers;
		this.decks = decks;
		
		generate();
		
	}
	
	// Generate the deck
	private void generate() {
		cards.clear();
		discard.clear();
		
		// Populate list with all values 0 - (size - 1)
		for (int i = 1; i <= (54 * decks); i++) {
			int faceValue = i;
			
			while (faceValue > 54) faceValue -= 54;
			
			// If specified to have no jokers, skip adding jokers
			if (hasJokers || faceValue != 53 && faceValue != 54) cards.add(i);
			else if (faceValue == 53 || faceValue == 54) continue;
			
		}
		
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
		
	}
	
	// Rebuilds deck
	public void rebuild() {
		generate();
		
	}
	
	// Takes card from top of deck and discards it
	public void burn() {
		discard.add(cards.get(0));
		cards.remove(0);
		
	}
	
	// Returns card from top of decks, then discards it
	public int draw() {
		int drawnCard = cards.get(0);
		
		// Remove card from active deck and add to discard pile
		cards.remove(0);
		discard.add(drawnCard);
		while (drawnCard > 54) drawnCard -= 54;
		
		return drawnCard;
		
	}
	
	// Not recursive so that draw() can return non-array
	public int[] draw(int iterations) {
		int[] drawnCards = new int[iterations];
		
		for (int i = 0; i < iterations; i++) drawnCards[i] = draw();
		
		return drawnCards;
		
	}
	
	// Returns number of cards left in active deck
	public int getRemaining() {
		return cards.size();
		
	}
	
	// Returns the size of an individual deck
	public int getDeckSize() {
		if (hasJokers) return 54;
		else return 52;
		
	}
	
	// Return number of decks
	public int getDecks() {
		return decks;
		
	}
	
	public boolean hasJokers() {
		return hasJokers;
		
	}
	
}