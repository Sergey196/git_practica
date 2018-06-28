package com.epam.card.visa;

import com.epam.card.Card;
import com.epam.create.card.CreatenumberCard;

/**
 * Class visa gold card
 */
public class VisaGold extends Card {

	/**
	 * Full code of type card
	 */
	private static final int[] CODE_TYPE_CARD = { 4, 7, 9, 7, 3, 8};	
	
	@Override
	public int[] createCodeCard() {
		CreatenumberCard createnumberCard = new CreatenumberCard();
		return createnumberCard.createCard(CODE_TYPE_CARD);
	}

}
