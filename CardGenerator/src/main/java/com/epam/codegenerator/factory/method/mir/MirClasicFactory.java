package com.epam.codegenerator.factory.method.mir;

import com.epam.codegenerator.card.Card;
import com.epam.codegenerator.card.mir.MirClasic;
import com.epam.codegenerator.factory.method.CardFactory;

/**
 * Factory mir clasic
 */
public class MirClasicFactory extends CardFactory {
	
	/**
	 * Create type of card
	  @return card type
	 */
	@Override
	public Card createCard() {
		return new MirClasic();
	}

}
