package com.epam.codegenerator.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.epam.codegenerator.types.cards.TypesCards;

/**
 * Class input parameters test
 */
public class InputParametersTest {
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
	
	/**
	 * test mir debit input parameter
	 */
    @Test
    public void complianceMirDebitPaymentSystemTest() {
    	assertThat(TYPE_MIR_DEBIT, is(TypesCards.valueOf(MIR_DEBIT_NAME).getCodeTypeCard()));
    }
    
	/**
	 * test mir classic input parameter
	 */
    @Test
    public void complianceMirClassicPaymentSystemTest() {
    	assertThat(TYPE_MIR_CLASSIC, is(TypesCards.valueOf(MIR_CLASSIC_NAME).getCodeTypeCard()));
    }
    
	/**
	 * test mir classic input parameter
	 */
    @Test
    public void complianceMirPremiumPaymentSystemTest() {
    	assertThat(TYPE_MIR_PREMIAL, is(TypesCards.valueOf(MIR_PREMIAL_NAME).getCodeTypeCard()));
    }
    
	/**
	 * test master electronic input parameter
	 */
    @Test
    public void complianceMasterElectronicPaymentSystemTest() {
    	assertThat(TYPE_MASTERCARD_ELECTRONIC, is(TypesCards.valueOf(MASTERCARD_ELECTRONIC_NAME).getCodeTypeCard()));
    }
    
	/**
	 * test master maestro input parameter
	 */
    @Test
    public void complianceMasterMaestroPaymentSystemTest() {
    	assertThat(TYPE_MASTERCARD_MAESTRO, is(TypesCards.valueOf(MASTERCARD_MAESTRO_NAME).getCodeTypeCard()));
    }
    
	/**
	 * test master standard input parameter
	 */
    @Test
    public void complianceSimpleMasterPaymentSystemTest() {
    	assertThat(TYPE_MASTERCARD_STANDARD, is(TypesCards.valueOf(MASTERCARD_STANDARD_NAME).getCodeTypeCard()));
    }
    
	/**
	 * test visa classic input parameter
	 */
    @Test
    public void complianceVisaClasicPaymentSystemTest() {
    	assertThat(TYPE_VISA_CLASSIC, is(TypesCards.valueOf(VISA_CLASSIC_NAME).getCodeTypeCard()));
    }
    
	/**
	 * test visa electron input parameter
	 */
    @Test
    public void complianceVisaElectronPaymentSystemTest() {
    	assertThat(TYPE_VISA_ELECTRON, is(TypesCards.valueOf(VISA_ELECTRON_NAME).getCodeTypeCard()));
    }
    
	/**
	 * test visa gold input parameter
	 */
    @Test
    public void complianceVisaGoldPaymentSystemTest() {
    	assertThat(VISA_VISA_GOLD, is(TypesCards.valueOf(VISA_GOLD_NAME).getCodeTypeCard()));
    }
}
