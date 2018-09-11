package com.epam.codegenerator.factory.method.mir;

import com.epam.codegenerator.card.Card;
import com.epam.codegenerator.card.mir.MirPremium;
import com.epam.codegenerator.factory.method.CardFactory;

/**
 * Factory mir premium
 */
public class MirPremiumFactory extends CardFactory {
	
	/**
	 * Create type of card
	  @return card type
	 */
	@Override
	public Card createCard() {
		return new MirPremium();
	}

}
