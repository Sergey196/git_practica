package com.epam.codegenerator.card.master;

import com.epam.codegenerator.card.Card;

/**
 * Class simple master card
 */
public class SimpleMaster extends Card {

	/*Full code of type card*/
	private static final int[] CODE_TYPE_CARD = {2, 2, 5, 6, 7, 5};

	public SimpleMaster() {
		super.setCodeTypeCard(CODE_TYPE_CARD);
	}
}
