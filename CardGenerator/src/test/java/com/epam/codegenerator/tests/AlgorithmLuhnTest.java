package com.epam.codegenerator.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.epam.codegenerator.Generator;
import com.epam.codegenerator.luhn.AlgorithmLuhn;

/**
 * Class of algorithm Luhn tests
 */
public class AlgorithmLuhnTest {

	/* length card code */
	private static final int LENGTH = 16;
	/* object of class Generator*/
	private Generator generator = new Generator();
    /* correct card code */
	private final static int[] GOOD_CODE_CARD = {4, 7, 9, 7, 3, 8, 7, 7, 3, 7, 1, 3, 6, 5, 9, 8};
    /* wrong card code */
	private final static int[] BAD_CODE_CARD = {4, 7, 9, 7, 3, 8, 7, 7, 3, 7, 1, 3, 6, 5, 9, 2};
	/* names of cards*/
	private final static String MASTERCARD_ELECTRONIC_NAME = "MASTERCARD_ELECTRONIC";
	private final static String MASTERCARD_MAESTRO_NAME = "MASTERCARD_MAESTRO";
	private final static String MASTERCARD_STANDARD_NAME = "MASTERCARD_STANDARD";
	private final static String MIR_CLASSIC_NAME = "MIR_CLASSIC";
	private final static String MIR_DEBIT_NAME = "MIR_DEBIT";	
	private final static String MIR_PREMIAL_NAME = "MIR_PREMIAL";	
	private final static String VISA_CLASSIC_NAME = "VISA_CLASSIC";	
	private final static String VISA_ELECTRON_NAME = "VISA_ELECTRON";	
	private final static String VISA_GOLD_NAME = "VISA_GOLD";	
    
    /* Check luhn algorithm */
    private boolean isLuhnAlgoritm(int[] codeCard) {
		return (AlgorithmLuhn.getSumLuhnAlgorithm(codeCard) % 10) == 0;
	}
    /* does this code match luhn algorithm */
    private boolean isCheckAlgorithmLuhn(int[] digits) {
        int sum = 0;
        int length = digits.length;
        for (int i = 0; i < length; i++) {

            // get digits in reverse order
            int digit = digits[length - i - 1];

            // every 2nd number multiply by 2
            if (i % 2 == 1) {
                digit *= 2;
            }
            sum += digit > 9 ? digit - 9 : digit;
        }
        return sum % 10 == 0;
    }

	/**
	 * does program algorithm match good code card correctly
	*/	
	@Test
	public void AlgorithmLuhnCorrectlyTest() {
	    assertEquals(true, isLuhnAlgoritm(GOOD_CODE_CARD));
	} 
	
	/**
	 * does program algorithm match bad code card correctly
	*/		
	@Test
	public void AlgorithmLuhnWrongTest() {
	    assertEquals(false, isLuhnAlgoritm(BAD_CODE_CARD));
	}
	
	/**
	 * does code mir classic match luhn algorithm
	*/	
	@Test
	public void CodeMirClasicCardsAlgorithmLuhnTest() {
	    assertEquals(true, isCheckAlgorithmLuhn(generator.getCard(VISA_CLASSIC_NAME, LENGTH).getCodeCard()));
	} 
	
	/**
	 * does code mir debit match luhn algorithm
	*/	
	@Test
	public void CodeMirDebitCardsAlgorithmLuhnTest() {
		assertEquals(true, isCheckAlgorithmLuhn(generator.getCard(MIR_DEBIT_NAME, LENGTH).getCodeCard()));
	} 
	
	/**
	 * does code mir premium match luhn algorithm
	*/
	@Test
	public void CodeMirPremiumCardsAlgorithmLuhnTest() {
		assertEquals(true, isCheckAlgorithmLuhn(generator.getCard(MIR_PREMIAL_NAME, LENGTH).getCodeCard()));
	} 
	
	/**
	 * does code visa classic match luhn algorithm
	*/
	@Test
	public void CodeVisaClasicCardsAlgorithmLuhnTest() {
		assertEquals(true, isCheckAlgorithmLuhn(generator.getCard(MIR_CLASSIC_NAME, LENGTH).getCodeCard()));
	} 
	
	/**
	 * does code visa electron match luhn algorithm
	*/
	@Test
	public void CodeVisaElectronCardsAlgorithmLuhnTest() {
		assertEquals(true, isCheckAlgorithmLuhn(generator.getCard(VISA_ELECTRON_NAME, LENGTH).getCodeCard()));
	} 
	
	/**
	 * does code visa gold match luhn algorithm
	*/
	@Test
	public void CodeVisaGoldCardsAlgorithmLuhnTest() {
		assertEquals(true, isCheckAlgorithmLuhn(generator.getCard(VISA_GOLD_NAME, LENGTH).getCodeCard()));
	} 
	
	/**
	 * does code master electron match luhn algorithm
	*/
	@Test
	public void CodeMasterElectronicCardsAlgorithmLuhnTest() {
		assertEquals(true, isCheckAlgorithmLuhn(generator.getCard(MASTERCARD_ELECTRONIC_NAME, LENGTH).getCodeCard()));
	} 
	
	
	/**
	 * does code master maestro match luhn algorithm
	*/
	@Test
	public void CodeMasterMaestroCardsAlgorithmLuhnTest() {
		assertEquals(true, isCheckAlgorithmLuhn(generator.getCard(MASTERCARD_MAESTRO_NAME, LENGTH).getCodeCard()));
	} 
	
	/**
	 * does code master standard match luhn algorithm
	*/
	@Test
	public void CodeSimpleMasterCardsAlgorithmLuhnTest() {
		assertEquals(true, isCheckAlgorithmLuhn(generator.getCard(MASTERCARD_STANDARD_NAME, LENGTH).getCodeCard()));
	} 
}
