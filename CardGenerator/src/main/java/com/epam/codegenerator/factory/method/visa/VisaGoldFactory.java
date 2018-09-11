package com.epam.codegenerator.factory.method.visa;

import com.epam.codegenerator.card.Card;
import com.epam.codegenerator.card.visa.VisaGold;
import com.epam.codegenerator.factory.method.CardFactory;

/**
 * Factory visa gold
 */
public class VisaGoldFactory extends CardFactory {

	/**
	 * Create type of card
	  @return card type
	 */
	@Override
	public Card createCard() {
		return new VisaGold();
	}

}
