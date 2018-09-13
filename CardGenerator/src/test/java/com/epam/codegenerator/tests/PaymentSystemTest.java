package com.epam.codegenerator.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.epam.codegenerator.Generator;

/**
 * tests of payments systems
 */
public class PaymentSystemTest {

	/* length card code */
	private final static int LENGTH = 16;
	/* object of class Generator*/
	private Generator generator = new Generator();
	/* code type of cards */
	private final static int[] TYPE_MASTERCARD_ELECTRONIC = {2, 2, 2, 1, 5, 6};
	private final static int[] TYPE_MASTERCARD_MAESTRO = {2, 2, 2, 1, 8, 8};
	private final static int[] TYPE_MASTERCARD_STANDARD = {2, 2, 5, 6, 7, 5};
	private final static int[] TYPE_MIR_CLASSIC = {2, 2, 2, 0, 4, 5};
	private final static int[] TYPE_MIR_DEBIT = {2, 2, 0, 4, 3, 7};	
	private final static int[] TYPE_MIR_PREMIAL = {2, 2, 0, 4, 5, 6};	
	private final static int[] TYPE_VISA_CLASSIC = {4, 4, 3, 9, 7, 4};	
	private final static int[] TYPE_VISA_ELECTRON = {4, 4, 3, 9, 8, 4};	
	private final static int[] VISA_VISA_GOLD = {4, 7, 9, 7, 3, 8};	
	/* names of cards */
	private final static String MASTERCARD_ELECTRONIC_NAME = "MASTERCARD_ELECTRONIC";
	private final static String MASTERCARD_MAESTRO_NAME = "MASTERCARD_MAESTRO";
	private final static String MASTERCARD_STANDARD_NAME = "MASTERCARD_STANDARD";
	private final static String MIR_CLASSIC_NAME = "MIR_CLASSIC";
	private final static String MIR_DEBIT_NAME = "MIR_DEBIT";	
	private final static String MIR_PREMIAL_NAME = "MIR_PREMIAL";	
	private final static String VISA_CLASSIC_NAME = "VISA_CLASSIC";	
	private final static String VISA_ELECTRON_NAME = "VISA_ELECTRON";	
	private final static String VISA_GOLD_NAME = "VISA_GOLD";	
	
	 /* Return result code type of card */
	private int[] checkTypeCard(int[] codeCard) {
		int[] cardType = new int[6];
		
		for (int i = 0; i < 6; i++) {
			cardType[i] = codeCard[i];
		}
		
		return cardType;
	}
    
	/**
	 * test for compliance with mir debit payment system
	 */
    @Test
    public void complianceMirDebitPaymentSystemTest() {
    	assertThat(TYPE_MIR_DEBIT, is(checkTypeCard(generator.getCard(MIR_DEBIT_NAME, LENGTH).getCodeCard())));
    }
	
	/**
	 * test for compliance with mir debit payment system
	 */
    @Test
    public void complianceMirPremiumPaymentSystemTest() {
    	assertThat(TYPE_MIR_PREMIAL, is(checkTypeCard(generator.getCard(MIR_PREMIAL_NAME, LENGTH).getCodeCard())));
    }
    
	/**
	 * test for compliance with visa classic payment system
	 */
    @Test
    public void compliancVisaClassicPaymentSystemTest() {
    	assertThat(TYPE_MIR_CLASSIC, is(checkTypeCard(generator.getCard(MIR_CLASSIC_NAME, LENGTH).getCodeCard())));
    }
    
	/**
	 * test for compliance with visa electron payment system
	 */
    @Test
    public void compliancVisaElectronPaymentSystemTest() {
    	assertThat(TYPE_VISA_CLASSIC, is(checkTypeCard(generator.getCard(VISA_CLASSIC_NAME, LENGTH).getCodeCard())));
    }
    
	/**
	 * test for compliance mir classic electron payment system
	 */
    @Test
    public void complianceMirClassicPaymentSystemTest() {
    	assertThat(TYPE_VISA_ELECTRON, is(checkTypeCard(generator.getCard(VISA_ELECTRON_NAME, LENGTH).getCodeCard())));
    }
    
	/**
	 * test for compliance visa gold electron payment system
	 */
    @Test
    public void compliancVisaGoldPaymentSystemTest() {
    	assertThat(VISA_VISA_GOLD, is(checkTypeCard(generator.getCard(VISA_GOLD_NAME, LENGTH).getCodeCard())));
    }
    
	/**
	 * test for compliance master electronic electron payment system
	 */
    @Test
    public void compliancMasterElectronicPaymentSystemTest() {
    	assertThat(TYPE_MASTERCARD_ELECTRONIC, is(checkTypeCard(generator.getCard(MASTERCARD_ELECTRONIC_NAME, LENGTH).getCodeCard())));
    }
    
	/**
	 * test for compliance master maestro electron payment system
	 */
    @Test
    public void compliancMasterMaestroPaymentSystemTest() {
    	assertThat(TYPE_MASTERCARD_MAESTRO, is(checkTypeCard(generator.getCard(MASTERCARD_MAESTRO_NAME, LENGTH).getCodeCard())));
    }
    
	/**
	 * test for compliance master standard electron payment system
	 */
    @Test
    public void compliancSimpleMasterPaymentSystemTest() {
    	assertThat(TYPE_MASTERCARD_STANDARD, is(checkTypeCard(generator.getCard(MASTERCARD_STANDARD_NAME, LENGTH).getCodeCard())));
    }
}
