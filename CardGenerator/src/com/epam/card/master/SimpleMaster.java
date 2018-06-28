package com.epam.card.master;

import com.epam.card.Card;
import com.epam.create.card.CreatenumberCard;

/**
 * Class simple master card
 */
public class SimpleMaster extends Card {

	/**
	 * Full code of type card
	 */
	private static final int[] CODE_TYPE_CARD = {2, 2, 5, 6, 7, 5};
	
	@Override
	public int[] createCodeCard() {
		CreatenumberCard createnumberCard = new CreatenumberCard();
		return createnumberCard.createCard(CODE_TYPE_CARD);
	}

}
