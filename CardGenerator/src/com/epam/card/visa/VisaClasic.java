package com.epam.card.visa;

import com.epam.card.Card;
import com.epam.create.card.CreatenumberCard;

/**
 * Class visa clasic card
 */
public class VisaClasic extends Card {

	/**
	 * Full code of type card
	 */
	private static final int[] CODE_TYPE_CARD = { 4, 4, 3, 9, 7, 4};			
	
	@Override
	public int[] createCodeCard() {
		CreatenumberCard createnumberCard = new CreatenumberCard();
		return createnumberCard.createCard(CODE_TYPE_CARD);
	}

}
