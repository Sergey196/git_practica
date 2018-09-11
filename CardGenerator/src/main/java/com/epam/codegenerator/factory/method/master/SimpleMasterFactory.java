package com.epam.codegenerator.factory.method.master;

import com.epam.codegenerator.card.Card;
import com.epam.codegenerator.card.master.SimpleMaster;
import com.epam.codegenerator.factory.method.CardFactory;

/**
 * Factory simple master
 */
public class SimpleMasterFactory extends CardFactory {
	
	/**
	 * Create type of card
	  @return card type
	 */
	@Override
	public Card createCard() {
		return new SimpleMaster();
	}

}
