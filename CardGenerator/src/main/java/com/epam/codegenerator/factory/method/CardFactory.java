package com.epam.codegenerator.factory.method;

import com.epam.codegenerator.card.Card;

/**
 * Abstract Factory all cards
 */
public abstract class CardFactory {
	
	/**
	 * Create code card
	  @return code card
	 */
    public int[] createCodeCard() {
    	Card card = createCard();
    	return card.makeCard();
    }

	
	/**
	 * Create type of card
	  @return card type
	 */
    public abstract Card createCard();
}
