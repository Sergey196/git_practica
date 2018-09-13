package com.epam.codegenerator.card;

import java.util.Arrays;

/**
 * Card class
 */
public class Card {

	/*code of card*/
	private int[] codeCard;
	
	/**
	 * Set code of card
	 */	
	public void setCodeCard(int[] codeCard) {
		this.codeCard = codeCard;
	}
	
	/**
	 * Get code of card
	 */	
	public int[] getCodeCard() {
		return this.codeCard;
	}
	
	/**
	 * to string format
	 */	
	@Override
	public String toString() {
		return Arrays.toString(codeCard);
	}
}
