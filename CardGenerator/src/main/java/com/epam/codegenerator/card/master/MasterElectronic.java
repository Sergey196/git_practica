package com.epam.codegenerator.card.master;

import com.epam.codegenerator.card.Card;
/**
 * Class master electronic card
 */
public class MasterElectronic extends Card {

	/*Full code of type card*/
	private static final int[] CODE_TYPE_CARD = {2, 2, 2, 1, 5, 6};
	
	public MasterElectronic() {
		super.setCodeTypeCard(CODE_TYPE_CARD);
	}
}
