package com.epam.codegenerator.factory.method.master;

import com.epam.codegenerator.card.Card;
import com.epam.codegenerator.card.master.MasterElectronic;
import com.epam.codegenerator.factory.method.CardFactory;

/**
 * Factory master electronic
 */
public class MasterElectronicFactory extends CardFactory {
	
	/**
	 * Create type of card
	  @return card type
	 */
	@Override
	public Card createCard() {
		return new MasterElectronic();
	}

}
