package com.epam.card.mir;

import com.epam.card.Card;
import com.epam.create.card.CreatenumberCard;

/**
 * Class mir clasic card
 */
public class MirClasic extends Card {

	/**
	 * Full code of type card
	 */
	private static final int[] CODE_TYPE_CARD = {2, 2, 2, 0, 4, 5};
	
	@Override
	public int[] createCodeCard() {
		CreatenumberCard createnumberCard = new CreatenumberCard();
		return createnumberCard.createCard(CODE_TYPE_CARD);
	}

}
