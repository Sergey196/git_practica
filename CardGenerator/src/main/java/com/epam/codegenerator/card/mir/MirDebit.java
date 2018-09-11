package com.epam.codegenerator.card.mir;

import com.epam.codegenerator.card.Card;

/**
 * Class mir debit card
 */
public class MirDebit extends Card {

	/*Full code of type card*/
	private static final int[] CODE_TYPE_CARD = {2, 2, 0, 4, 3, 7};	
	
	public MirDebit() {
		super.setCodeTypeCard(CODE_TYPE_CARD);
	}

}
