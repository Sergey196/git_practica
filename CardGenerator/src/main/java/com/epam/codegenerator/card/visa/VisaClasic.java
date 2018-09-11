package com.epam.codegenerator.card.visa;

import com.epam.codegenerator.card.Card;

/**
 * Class visa clasic card
 */
public class VisaClasic extends Card {

	/*Full code of type card*/
	private static final int[] CODE_TYPE_CARD = {4, 4, 3, 9, 7, 4};	
	
	public VisaClasic() {
		super.setCodeTypeCard(CODE_TYPE_CARD);
	}

}
