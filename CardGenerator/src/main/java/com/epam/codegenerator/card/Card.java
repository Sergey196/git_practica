package com.epam.codegenerator.card;

import com.epam.codegenerator.factory.bilder.CardBilder;

/**
 * Card interface
 */
public abstract class Card {

	/*Full length card*/
	private final int CARD_LENGTH = 16;
	/*Type of card*/
	private int[] codeTypeCard;
	
	/**
	 * Set type of card
	 */	
	public void setCodeTypeCard(int[] codeTypeCard) {
		this.codeTypeCard = codeTypeCard;
	}
	
	/**
	 * Make card
	  @return card code
	 */	
    public int[] makeCard() {
		CardBilder factory = new CardBilder();
		factory.createCode(CARD_LENGTH, this.codeTypeCard);
		factory.createCard();
		return factory.getResult();
    }
}
