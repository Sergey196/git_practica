package com.epam.codegenerator.card.master;

import com.epam.codegenerator.card.Card;

/**
 * Class master maestro card
 */
public class MasterMaestro extends Card {

	/*Full code of type card*/
	private static final int[] CODE_TYPE_CARD = {2, 2, 2, 1, 8, 8};
	
	public MasterMaestro() {
		super.setCodeTypeCard(CODE_TYPE_CARD);
	}
}
