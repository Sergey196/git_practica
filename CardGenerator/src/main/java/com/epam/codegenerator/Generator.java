package com.epam.codegenerator;

import com.epam.codegenerator.card.Card;
import com.epam.codegenerator.creator.CardCreator;
import com.epam.codegenerator.types.cards.TypesCards;

import java.util.Arrays;

import org.apache.log4j.Logger;

/**
 * Class launch card generator
 */
public class Generator {
	
	private final static int LENGTH = 16;
	
	/**
	 * loger
	 */
	private static final Logger logger = Logger.getLogger(Generator.class);	
	
	/**
	 * Client main method
	 */
    public static void main(String[] args) {
    	Generator generator = new Generator();
		for (int i = 0; i < args.length; i++) {
			String codeCard = generator.getCardNumber(args[i]);
			System.out.print("Card code: " + codeCard + "\n");			
		}
    }
    
	/**
	 * Create card code
	 * @param type of card
	 */
    public String getCardNumber(String type) {
    	logger.info("start of card generation type " + type);
    	
    	Card card = getCard(type, LENGTH);
    	String code = null;
    	
    	if(card != null) {
    		code = getCard(type, LENGTH).toString();
    		logger.info("finished of code generation code card = " + code);
    	} else {
    		code = "Could not generate card";
    	}
    	
    	return code;
    }
    
	/**
	 * get card
	  @param type type of card
	  @param length length of card
	  @return card
	 */
    public Card getCard(String type, int length) {
    	CardCreator cardBilder = new CardCreator();
    	Card card = null;
    	try {
    		card = cardBilder.createCardCode(16, TypesCards.valueOf(type).getCodeTypeCard());
    	} catch(RuntimeException e) {
    		logger.error("No card from such a payment system: " + type);
    	}
		return card;
    }
    
}
