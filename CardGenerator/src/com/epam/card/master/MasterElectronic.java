package com.epam.card.master;

import com.epam.card.Card;
import com.epam.create.card.CreatenumberCard;

/**
 * Class master electronic card
 */
public class MasterElectronic extends Card {

	/**
	 * Full code of type card
	 */
	private static final int[] CODE_TYPE_CARD = {2, 2, 2, 1, 5, 6};
	
	@Override
	public int[] createCodeCard() {
		CreatenumberCard createnumberCard = new CreatenumberCard();
		return createnumberCard.createCard(CODE_TYPE_CARD);
	}

}
