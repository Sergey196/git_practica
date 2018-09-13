package com.epam.codegenerator.creator;

import java.util.Arrays;

import org.apache.log4j.Logger;

import com.epam.codegenerator.card.Card;
import com.epam.codegenerator.luhn.AlgorithmLuhn;

/**
 * Class builder of card
 */
public class CardCreator {

	/**
	 * loger
	 */
	private static final Logger logger = Logger.getLogger(CardCreator.class);	
	
	/**
	 * Create random code
	  @param lengh card code
	  @param type card
	  @return random code card
	 */
	private int[] createRandomCode(int length, int[] codeTypeCard) {
		
		logger.debug("start of random code generation. lengh = " + length + " codeTypeCard = " + Arrays.toString(codeTypeCard));
		
		int[] codeCard = new int[length];
		
		for (int i = 0; i < codeCard.length; i++) {
			if (i <= codeTypeCard.length - 1) {
				codeCard[i] = codeTypeCard[i];
			} else if (i >= codeTypeCard.length) {
				codeCard[i] = (int) (Math.random() * 10);
			}
		}
		
		logger.debug("finished of random code generation. codeCard = " + Arrays.toString(codeCard));
		
		return codeCard;
		
	}

	/**
	 * Create card
	  @param lengh card code
	  @param type card
	  @return card
	 */
	public Card createCardCode(int length, int[] codeTypeCard) {
		
		int[] codeCard = createRandomCode(length, codeTypeCard);
		int sum = AlgorithmLuhn.getSumLuhnAlgorithm(codeCard);
		
		while ((sum % 10) != 0) {
			if(codeCard[codeCard.length - 1] + (10 - (sum % 10)) < 9) {
				logger.debug("random code does not match the algorithm of the Luhn change this code card = " + Arrays.toString(codeCard) + " sum = " + sum);
				codeCard[codeCard.length - 1] = codeCard[codeCard.length - 1] + (10 - (sum % 10));
				sum = AlgorithmLuhn.getSumLuhnAlgorithm(codeCard);
			} else {
				logger.debug("random code does not match the algorithm of the Luhn generate new code = " + Arrays.toString(codeCard) + " sum = " + sum);
				codeCard = createRandomCode(length, codeTypeCard);
				sum = AlgorithmLuhn.getSumLuhnAlgorithm(codeCard);
			}
		}
		
		logger.debug("finished of code generation. codeCard = " + Arrays.toString(codeCard) + " sum = " + sum);
		
		Card card = new Card();
		card.setCodeCard(codeCard);
		
		return card;
	}
}
