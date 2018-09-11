package com.epam.codegenerator.card.mir;

import com.epam.codegenerator.card.Card;

/**
 * Class mir premium card
 */
public class MirPremium extends Card {

	/*Full code of type card*/
	private static final int[] CODE_TYPE_CARD = {2, 2, 0, 4, 5, 6};	
	
	public MirPremium() {
		super.setCodeTypeCard(CODE_TYPE_CARD);
	}

}
