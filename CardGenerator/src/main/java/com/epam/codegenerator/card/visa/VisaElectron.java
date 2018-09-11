package com.epam.codegenerator.card.visa;

import com.epam.codegenerator.card.Card;

/**
 * Class visa electron card
 */
public class VisaElectron extends Card {

	/*Full code of type card*/
	private static final int[] CODE_TYPE_CARD = {4, 4, 3, 9, 8, 4};	

	public VisaElectron() {
		super.setCodeTypeCard(CODE_TYPE_CARD);
	}
}
