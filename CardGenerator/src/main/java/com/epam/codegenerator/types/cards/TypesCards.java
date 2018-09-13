package com.epam.codegenerator.types.cards;

/**
 * type of cards
 */
public enum TypesCards {
	
	MIR_CLASSIC { 
		/**
		 * Get mir classic type code
		 */
		public int[] getCodeTypeCard() {
			final int[] CodeTypeCard = {2, 2, 2, 0, 4, 5};
			return CodeTypeCard;
		};
	}, 
	MIR_DEBIT { 
		/**
		 * Get mir debit type code
		 */
		public int[] getCodeTypeCard() {
			final int[] CodeTypeCard = {2, 2, 0, 4, 3, 7};
			return CodeTypeCard;
		};	       
	},
	MIR_PREMIAL { 
		/**
		 * Get mir preminal type code
		 */
		public int[] getCodeTypeCard() {
			final int[] CodeTypeCard = {2, 2, 0, 4, 5, 6};
			return CodeTypeCard;
		};	       
	}, 
	VISA_CLASSIC { 
		/**
		 * Get visa classic type code
		 */
		public int[] getCodeTypeCard() {
			final int[] CodeTypeCard = {4, 4, 3, 9, 7, 4};
			return CodeTypeCard;
		};	       
	}, 
	VISA_ELECTRON { 
		/**
		 * Get visa electron type code
		 */
		public int[] getCodeTypeCard() {
			final int[] CodeTypeCard = {4, 4, 3, 9, 8, 4};
			return CodeTypeCard;
		};	       
	}, 
	VISA_GOLD { 
		/**
		 * Get visa gold type code
		 */
		public int[] getCodeTypeCard() {
			final int[] CodeTypeCard = {4, 7, 9, 7, 3, 8};
			return CodeTypeCard;
		};	       
	}, 
	MASTERCARD_ELECTRONIC { 
		/**
		 * Get mastercard electronic type code
		 */
		public int[] getCodeTypeCard() {
			final int[] CodeTypeCard = {2, 2, 2, 1, 5, 6};
			return CodeTypeCard;
		};	       
	},
	MASTERCARD_MAESTRO { 
		/**
		 * Get mastercard maestro type code
		 */
		public int[] getCodeTypeCard() {
			final int[] CodeTypeCard = {2, 2, 2, 1, 8, 8};
			return CodeTypeCard;
		};	       
	},
	MASTERCARD_STANDARD { 
		public int[] getCodeTypeCard() {
			/**
			 * Get mastercard standart type code
			 */
			final int[] CodeTypeCard = {2, 2, 5, 6, 7, 5};
			return CodeTypeCard;
		};	       
	};
	
	public abstract int[] getCodeTypeCard();
}
