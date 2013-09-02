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
		
		int size = (hasJokers) ? 54 * decks : 52 * decks;
		
		// Populate list with all values 0 - (size - 1)
		for (int i = 0; i < size; i++) cards.add(i + 1);
		
	}
	
	public void shuffle() {
		// Randomly sort cards
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
		
		return drawnCard;
		
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