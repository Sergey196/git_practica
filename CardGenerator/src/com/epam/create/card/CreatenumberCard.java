package com.epam.create.card;

/**
 * Class create a card code
 */
public class CreatenumberCard {
	
	/**
	 * Code of card
	 */
	private int[] codeCard;
	
	public CreatenumberCard() {
		this.codeCard = new int[16];
	}
	
	/**
	 * Check create random code
	  @param type card code
	 */
	public void createCode(int[] codeTypeCard) {
		
		for (int i = 0; i < this.codeCard.length; i++) {
			if(i <= codeTypeCard.length - 1) {
				this.codeCard[i] = codeTypeCard[i];
			} else if(i >= codeTypeCard.length) {
				this.codeCard[i] = (int) (Math.random() * 10);
			}
		}
	}
	
	/**
	 * Check create result card code
	  @param type card code
	  @return correct card code
	 */
	public int[] createCard(int[] codeTypeCard) {
		int sum = 1;
		
		do {
			createCode(codeTypeCard);
			sum = AlgorithmLuhn.checkSum(this.codeCard);
			if(this.codeCard[this.codeCard.length - 1] + (10 - (sum % 10)) < 10) {
				this.codeCard[this.codeCard.length - 1] = this.codeCard[this.codeCard.length - 1] + (10 - (sum % 10));
				sum = AlgorithmLuhn.checkSum(this.codeCard);
			}
		} while ((sum % 10) != 0);
		
		return this.codeCard;
	}

}

