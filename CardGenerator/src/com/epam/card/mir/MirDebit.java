package com.epam.card.mir;

import com.epam.card.Card;
import com.epam.create.card.CreatenumberCard;

/**
 * Class mir debit card
 */
public class MirDebit extends Card {

	/**
	 * Full code of type card
	 */
	private static final int[] CODE_TYPE_CARD = {2, 2, 0, 4, 3, 7};	
	
	@Override
	public int[] createCodeCard() {
		CreatenumberCard createnumberCard = new CreatenumberCard();
		return createnumberCard.createCard(CODE_TYPE_CARD);
	}

}
