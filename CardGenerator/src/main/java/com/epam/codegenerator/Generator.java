package com.epam.codegenerator;

import com.epam.codegenerator.factory.method.CardFactory;
import com.epam.codegenerator.factory.method.master.MasterElectronicFactory;
import com.epam.codegenerator.factory.method.master.MasterMaestroFactory;
import com.epam.codegenerator.factory.method.master.SimpleMasterFactory;
import com.epam.codegenerator.factory.method.mir.MirClasicFactory;
import com.epam.codegenerator.factory.method.mir.MirDebitFactory;
import com.epam.codegenerator.factory.method.mir.MirPremiumFactory;
import com.epam.codegenerator.factory.method.visa.VisaClasicFactory;
import com.epam.codegenerator.factory.method.visa.VisaElectronFactory;
import com.epam.codegenerator.factory.method.visa.VisaGoldFactory;
import com.epam.codegenerator.types.cards.TypesCards;

import java.util.Arrays;

import org.apache.log4j.Logger;

/**
 * Class launch card generator
 */
public class Generator {
	
	/**
	 * loger
	 */
	private static final Logger logger = Logger.getLogger(Generator.class);	
	
	/**
	 * Client main method
	 */
    public static void main(String[] args) {
    	
		for (int i = 0; i < args.length; i++) {
			int[] codeCard = typeSearch(args[i]);
			System.out.print("Card code: ");
			for (int j = 0; j < codeCard.length; j++) {
				//System.out.print("Card code: " + codeCard[j]);
				System.out.print(codeCard[j]);
			}
			System.out.println("\n");
			
		}
    }
    
	/**
	 * Return card code
	  @param name of type card
	  @return card code
	 */
    private static int[] typeSearch(String type) {
    	Generator generator = new Generator();
    	return generator.generate(TypesCards.valueOf(type));
    }
    
	/**
	 * Create card code
	 * @param type of card
	 */
    public int[] generate(TypesCards types) {
    	logger.info("start of card generation type " + types);
    	int[] codeCard = createCards(types).createCodeCard();
    	logger.info("finished of code generation code card = " + Arrays.toString(codeCard));
    	return codeCard;
    }
    
	/**
	 * Create card factory
	 * @param type of card
	 */
    private CardFactory createCards(TypesCards type) {
         
		switch (type) {
			case MIR_CLASIC:
				return new MirClasicFactory();
			case MIR_DEBIT:
				return new MirDebitFactory();
			case MIR_PREMIUM:
				return new MirPremiumFactory();
			case VISA_CLASIC:
				return new VisaClasicFactory();
			case VISA_ELECTRON:
				return new VisaElectronFactory();
			case VISA_GOLD:
				return new VisaGoldFactory();
			case MASTER_ELECTRONIC:
				return new MasterElectronicFactory();
			case MASTER_MAESTRO:
				return new MasterMaestroFactory();
			case SIMPLE_MASTER:
				return new SimpleMasterFactory();
			default:
				return null;
		}
    }
}
