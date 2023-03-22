package edu.ycp.cs320.battlemonsterz.model;
import java.util.*;

// model class for Cards
// only the controller should be allowed to call the set methods

public class Deck {
	private ArrayList<Card> cards = new ArrayList<>();
	
	
	public Deck(ArrayList<Card> cards) {
		this.cards = cards;
		
	}
	
	public void addCard(Card card) { // adds card to collection
		cards.add(card);
		
	}
	public void saveCards() { // saves cards to collection
		
	}
	
	public void deleteCard(Card card) { // deletes card from collection
		cards.remove(cards.size());
	}
	
	
	
	public void confirm() { // user confirms collection
		
	}
	
	
	
	
	
	

	
	
}
	
	
	
	
