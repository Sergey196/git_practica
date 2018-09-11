package com.epam.codegenerator.card.mir;

import com.epam.codegenerator.card.Card;

/**
 * Class mir clasic card
 */
public class MirClasic extends Card {

	/*Full code of type card*/
	private static final int[] CODE_TYPE_CARD = {2, 2, 2, 0, 4, 5};
	
	public MirClasic() {
		super.setCodeTypeCard(CODE_TYPE_CARD);
	}

}
