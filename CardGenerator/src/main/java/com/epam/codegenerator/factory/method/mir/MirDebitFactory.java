package com.epam.codegenerator.factory.method.mir;

import com.epam.codegenerator.card.Card;
import com.epam.codegenerator.card.mir.MirDebit;
import com.epam.codegenerator.factory.method.CardFactory;

/**
 * Factory mir debit
 */
public class MirDebitFactory extends CardFactory {
	
	/**
	 * Create type of card
	  @return card type
	 */
	@Override
	public Card createCard() {
		return new MirDebit();
	}

}
