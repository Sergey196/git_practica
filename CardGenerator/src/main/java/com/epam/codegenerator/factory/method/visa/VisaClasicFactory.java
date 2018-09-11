package com.epam.codegenerator.factory.method.visa;

import com.epam.codegenerator.card.Card;
import com.epam.codegenerator.card.visa.VisaClasic;
import com.epam.codegenerator.factory.method.CardFactory;

/**
 * Factory visa classic
 */
public class VisaClasicFactory extends CardFactory {
	
	/**
	 * Create type of card
	  @return card type
	 */
	@Override
	public Card createCard() {
		return new VisaClasic();
	}

}
