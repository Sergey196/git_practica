package com.epam.card;

import com.epam.card.master.MasterElectronic;
import com.epam.card.master.MasterMaestro;
import com.epam.card.master.SimpleMaster;
import com.epam.card.mir.MirClasic;
import com.epam.card.mir.MirDebit;
import com.epam.card.mir.MirPremium;
import com.epam.card.visa.VisaClasic;
import com.epam.card.visa.VisaElectron;
import com.epam.card.visa.VisaGold;
import com.epam.types.cards.TypesCards;

/**
 * Card class
 */
abstract public class Card {
	
	/**
	 * Full code of card
	 */
	public abstract int[] createCodeCard();
	
    /**
     * Enumeration storing types of objects to be created
      @param type card
      @return Object of the class, depending on the type
     */
	public static Card createCards(TypesCards type) {
	    switch(type)
	    {
	        case MIR_CLASIC:
	            return new MirClasic();
	        case MIR_DEBIT:
	            return new MirDebit();
	        case MIR_PREMIUM:
	            return new MirPremium();
	        case VISA_CLASIC:
	            return new VisaClasic();
	        case VISA_ELECTRON:
	            return new VisaElectron();
	        case VISA_GOLD:
	            return new VisaGold();
	        case MASTER_ELECTRONIC:
	            return new MasterElectronic();
	        case MASTER_MAESTRO:
	            return new MasterMaestro();
	        case SIMPLE_MASTER:
	            return new SimpleMaster();
	        default:
	            return null;
	    }
	}
}
