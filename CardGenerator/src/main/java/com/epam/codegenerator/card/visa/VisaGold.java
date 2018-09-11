package com.epam.codegenerator.card.visa;

import com.epam.codegenerator.card.Card;

/**
 * Class visa gold card
 */
public class VisaGold extends Card {


	/*Full code of type card*/
	private static final int[] CODE_TYPE_CARD = {4, 7, 9, 7, 3, 8};
	
	public VisaGold() {
		super.setCodeTypeCard(CODE_TYPE_CARD);
	}

}
