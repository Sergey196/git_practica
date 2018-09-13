package com.epam.codegenerator.luhn;

/**
 * Class of Luhn algorithm
 */
public class AlgorithmLuhn {
	
	/**
	 * Check card number
	  @param full code card
	  @return the amount that must be a multiple of ten
	 */
	public static int getSumLuhnAlgorithm(int[] digits) {
		int sum = 0;
		int length = digits.length;
		for (int i = 0; i < length; i++) {

			int digit = digits[length - i - 1];

			if (i % 2 == 1) {
				digit *= 2;
			}
			sum += digit > 9 ? digit - 9 : digit;
		}
		return sum;
	}
}
