package com.epam;

import com.epam.card.Card;
import com.epam.types.cards.TypesCards;

/**
 * Class launch class
 */
public class Runner {
	
    public static void main(String[] args) {
    	int[] codeCard = Card.createCards(TypesCards.VISA_CLASIC).createCodeCard();
    	
		for (int i = 0; i < codeCard.length; i++) {
			System.out.print(codeCard[i]);
		}
    }
}
