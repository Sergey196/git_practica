package com.epam.codegenerator.factory.method.visa;

import com.epam.codegenerator.card.Card;
import com.epam.codegenerator.card.visa.VisaElectron;
import com.epam.codegenerator.factory.method.CardFactory;

/**
 * Factory visa electron
 */
public class VisaElectronFactory extends CardFactory {

	/**
	 * Create type of card
	  @return card type
	 */
	@Override
	public Card createCard() {
		return new VisaElectron();
	}

}
