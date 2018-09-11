package com.epam.codegenerator;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import java.io.PrintStream;

import org.junit.Test;

import com.epam.codegenerator.Generator;
import com.epam.codegenerator.luhn.AlgorithmLuhn;
import com.epam.codegenerator.types.cards.TypesCards;

/**
 * Test class
 */
public class Tests {
	
	/* Class launch card generator */
    private Generator generator = new Generator();
    /* correct card code */
    private final int[] GOOD_CODE_CARD = {4, 7, 9, 7, 3, 8, 7, 7, 3, 7, 1, 3, 6, 5, 9, 8};
    /* wrong card code */
    private final int[] BAD_CODE_CARD = {4, 7, 9, 7, 3, 8, 7, 7, 3, 7, 1, 3, 6, 5, 9, 2};
    
    /* Check luhn algorithm */
    private boolean isLuhnAlgoritm(int[] codeCard) {
    	if((AlgorithmLuhn.checkSum(codeCard) % 10) == 0) {
    		return true;
    	} else {
    		return false;
    	}
    }
    
	
	 /* Return result code type of card */
	private int[] checkTypeCard(int[] codeCard) {
		int[] cardType = new int[6];
		
		for (int i = 0; i < 6; i++) {
			cardType[i] = codeCard[i];
		}
		
		return cardType;
	}
	
	 /* Check output stream */
	private boolean isOutputStream(int[] codeCard) {
		final StringBuilder result = new StringBuilder();
		System.out.println("\n");
		System.out.println(result);
		System.out.println("\n");
		PrintStream printStream = new PrintStream(System.out) {
			@Override
			public void print(int i) {
				result.append(i);
			}
		};
		
		for (int i = 0; i < codeCard.length; i++) {
			printStream.print(codeCard[i]);
		}
		
		return result.length() != 0;
	
	}
	
	/**
	 * Check all cards by luhn algorithm 
	 */	
    @Test
    public void testAlgorithmLuhn() {
    	assertEquals(true, isLuhnAlgoritm(this.GOOD_CODE_CARD));
    	assertEquals(false, isLuhnAlgoritm(this.BAD_CODE_CARD));
    }
    
	/**
	 * Check all results generate cards by input parameter
	 */	
    @Test
    public void testCardParametr() {
    	
    	int[] typeMasterElectronic = {2, 2, 2, 1, 5, 6};
    	int[] typeMasterMaestro = {2, 2, 2, 1, 8, 8};
    	int[] typeSimpleMaster = {2, 2, 5, 6, 7, 5};
    	int[] typeMirClasic = {2, 2, 2, 0, 4, 5};
    	int[] typeMirDebit = {2, 2, 0, 4, 3, 7};	
    	int[] typeMirPremium = {2, 2, 0, 4, 5, 6};	
    	int[] typeVisaClasic = {4, 4, 3, 9, 7, 4};	
    	int[] typeVisaElectron = {4, 4, 3, 9, 8, 4};	
    	int[] typeVisaGold = {4, 7, 9, 7, 3, 8};	
		
		assertThat(typeMasterElectronic, is(checkTypeCard(generator.generate(TypesCards.MASTER_ELECTRONIC))));
		assertThat(typeMasterMaestro, is(checkTypeCard(generator.generate(TypesCards.MASTER_MAESTRO))));
		assertThat(typeSimpleMaster, is(checkTypeCard(generator.generate(TypesCards.SIMPLE_MASTER))));
		assertThat(typeMirClasic, is(checkTypeCard(generator.generate(TypesCards.MIR_CLASIC))));
		assertThat(typeMirDebit, is(checkTypeCard(generator.generate(TypesCards.MIR_DEBIT))));
		assertThat(typeMirPremium, is(checkTypeCard(generator.generate(TypesCards.MIR_PREMIUM))));
		assertThat(typeVisaClasic, is(checkTypeCard(generator.generate(TypesCards.VISA_CLASIC))));
		assertThat(typeVisaElectron, is(checkTypeCard(generator.generate(TypesCards.VISA_ELECTRON))));
		assertThat(typeVisaGold, is(checkTypeCard(generator.generate(TypesCards.VISA_GOLD))));
    }
    
	/**
	 * Check all results by null
	 */	
    @Test
    public void testCardResult() {
    	assertEquals(true, isOutputStream(generator.generate(TypesCards.MASTER_ELECTRONIC)));
    	assertEquals(true, isOutputStream(generator.generate(TypesCards.MASTER_MAESTRO)));
    	assertEquals(true, isOutputStream(generator.generate(TypesCards.SIMPLE_MASTER)));
    	assertEquals(true, isOutputStream(generator.generate(TypesCards.MIR_CLASIC)));
    	assertEquals(true, isOutputStream(generator.generate(TypesCards.MIR_DEBIT)));
    	assertEquals(true, isOutputStream(generator.generate(TypesCards.MIR_PREMIUM)));
    	assertEquals(true, isOutputStream(generator.generate(TypesCards.VISA_CLASIC)));
    	assertEquals(true, isOutputStream(generator.generate(TypesCards.VISA_ELECTRON)));
    	assertEquals(true, isOutputStream(generator.generate(TypesCards.VISA_GOLD)));
    }
	
}
