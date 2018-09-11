package com.epam.codegenerator.factory.method.master;

import com.epam.codegenerator.card.Card;
import com.epam.codegenerator.card.master.MasterMaestro;
import com.epam.codegenerator.factory.method.CardFactory;

/**
 * Factory master maestro
 */
public class MasterMaestroFactory extends CardFactory {
	
	/**
	 * Create type of card
	  @return card type
	 */
	@Override
	public Card createCard() {
		return new MasterMaestro();
	}

}
