package com.epam.codegenerator.factory.bilder;

import java.util.Arrays;

import org.apache.log4j.Logger;
import com.epam.codegenerator.luhn.AlgorithmLuhn;

/**
 * Class builder of card
 */
public class CardBilder implements Builder {

	/**
	 * loger
	 */
	private static final Logger logger = Logger.getLogger(CardBilder.class);	
	/*Code of card*/
	private int[] codeCard;
	/*Code of card type*/
	private int[] codeTypeCard;
	/*card length*/
	private int cardLength;
	
	/**
	 * Create random code
	  @param lengh card code
	  @param type card
	 */
	public void createCode(int lengh, int[] codeTypeCard) {
		
		logger.debug("start of random code generation. lengh = " + lengh + " codeTypeCard = " + Arrays.toString(codeTypeCard));
		
		this.codeCard = new int[lengh];	
		this.codeTypeCard = codeTypeCard;
		this.cardLength = lengh;
		
		for (int i = 0; i < this.codeCard.length; i++) {
			if (i <= codeTypeCard.length - 1) {
				this.codeCard[i] = codeTypeCard[i];
			} else if (i >= codeTypeCard.length) {
				this.codeCard[i] = (int) (Math.random() * 10);
			}
		}
		
		logger.debug("finished of random code generation. codeCard = " + Arrays.toString(this.codeCard));
		
	}

	/**
	 * Create result card code
	 */
	public void createCard() {
		
		int sum = AlgorithmLuhn.checkSum(this.codeCard);
		
		while ((sum % 10) != 0) {
			if(this.codeCard[this.codeCard.length - 1] + (10 - (sum % 10)) < 9) {
				logger.debug("random code does not match the algorithm of the Luhn change this code card = " + Arrays.toString(this.codeCard) + " sum = " + sum);
				this.codeCard[this.codeCard.length - 1] = this.codeCard[this.codeCard.length - 1] + (10 - (sum % 10));
				sum = AlgorithmLuhn.checkSum(this.codeCard);
			} else {
				logger.debug("random code does not match the algorithm of the Luhn generate new code = " + Arrays.toString(this.codeCard) + " sum = " + sum);
				createCode(this.cardLength, this.codeTypeCard);
				sum = AlgorithmLuhn.checkSum(this.codeCard);
			}
		}
		
		logger.debug("finished of code generation. codeCard = " + Arrays.toString(this.codeCard) + "sum = " + sum);
	}

	/**
	 * Return card code
	  @return card code
	 */
    public int[] getResult() {
        return this.codeCard;
    }
}
