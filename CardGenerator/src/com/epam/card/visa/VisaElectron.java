package com.epam.card.visa;

import com.epam.card.Card;
import com.epam.create.card.CreatenumberCard;

/**
 * Class visa electron card
 */
public class VisaElectron extends Card {

	/**
	 * Full code of type card
	 */
	private static final int[] CODE_TYPE_CARD = { 4, 4, 3, 9, 8, 4};			
	
	@Override
	public int[] createCodeCard() {
		CreatenumberCard createnumberCard = new CreatenumberCard();
		return createnumberCard.createCard(CODE_TYPE_CARD);
	}

}