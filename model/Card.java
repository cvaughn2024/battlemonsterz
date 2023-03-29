package edu.ycp.cs320.battlemonsterz.model;

// model class for Cards
// only the controller should be allowed to call the set methods

public class Card {
	private double health, attack_rating, defense_rating;
	
	
	public Card(double health, double attack_rating, double defense_rating) {
		this.health = health;
		this.attack_rating = attack_rating;
		this.defense_rating = defense_rating;
	}
	
	public double getHealth() {
		return health;
	}
	
	public void setHealth(double health) {
		this.health = health;
	}
	
	public double getAttackRating() {
		return attack_rating;
	}
	
	public void setAttackRating(double attack_rating) {
		this.attack_rating = attack_rating;
	}
	
	public double getDefenseRating() {
		return defense_rating;
	}
	
	public void setDefenseRating(double defense_rating) {
		this.defense_rating = defense_rating;
	}
	
	
}
	
	
	
	
