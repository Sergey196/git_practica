package com.epam.codegenerator.tests;

import static org.junit.Assert.fail;
import java.io.PrintStream;
import org.junit.Test;
import com.epam.codegenerator.Generator;
import com.epam.codegenerator.card.Card;

/**
 * tests of output stream
 */
public class OutputStreamTest {
	
	/* length card code */
	private final static int LENGTH = 16;
	/* object of class Generator*/
	private Generator generator = new Generator();
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
	
	 /* Check output stream */
	private void outputStream(Card card) {
		//final StringBuilder result = new StringBuilder();
		PrintStream printStream = new PrintStream(System.out) {
			@Override
			public void print(Object obj) {
				if(obj == null) {
					fail("Could not generate card");
				}
			}
		};
		
		//int result = (condition)? 0: 1;
		printStream.print(card);
		
		//return result.length() != 0;
	}
	
	/**
	 * test visa gold output card
	 */
    @Test
    public void testVisaGoldCardOutput() {
    	outputStream(generator.getCard(VISA_GOLD_NAME, LENGTH));
    }
    
	/**
	 * test visa electron output card
	 */
    @Test
    public void testVisaElectronCardOutput() {
    	outputStream(generator.getCard(VISA_ELECTRON_NAME, LENGTH));
    }
    
	/**
	 * test visa classic output card
	 */
    @Test
    public void testVisaClassicCardOutput() {
    	outputStream(generator.getCard(MIR_CLASSIC_NAME, LENGTH));
    }
    
	/**
	 * test mir premium output card
	 */
    @Test
    public void testMirPremiumCardOutput() {
    	outputStream(generator.getCard(MIR_PREMIAL_NAME, LENGTH));
    }
    
	/**
	 * test mir debit output card
	 */
    @Test
    public void testMirDebitCardOutput() {
    	outputStream(generator.getCard(MIR_DEBIT_NAME, LENGTH));
    }
    
	/**
	 * test mir classic output card
	 */
    @Test
    public void testMirClassicCardOutput() {
    	outputStream(generator.getCard(VISA_CLASSIC_NAME, LENGTH));
    }
    
	/**
	 * test master standard output card
	 */
    @Test
    public void testSimpleMasterCardOutput() {
    	outputStream(generator.getCard(MASTERCARD_STANDARD_NAME, LENGTH));
    }
    
	/**
	 * test master maestro output card
	 */
    @Test
    public void testMasterMaestroCardOutput() {
    	outputStream(generator.getCard(MASTERCARD_MAESTRO_NAME, LENGTH));
    }
    
	/**
	 * test master electronic output card
	 */
    @Test
    public void testMasterElectronicCardOutput() {
    	outputStream(generator.getCard(MASTERCARD_ELECTRONIC_NAME, LENGTH));
    }
}
