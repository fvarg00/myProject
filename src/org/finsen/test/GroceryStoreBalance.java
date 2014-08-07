package org.finsen.test;

public class GroceryStoreBalance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] denom= {20,10,5,1,0.25f};
		float currencyGiven = 100f;
		float total = 94.25f;
		float[] destArray = {0,0,0,0,0};
		float balance = (currencyGiven-total);
		System.out.println("balance is:"+balance);
		for (int i = 0; i < denom.length; i++) {
			
			destArray[i] = balance/denom[i];
			balance = balance%denom[i];
			System.out.println((int)destArray[i] + " x " + denom[i]);
		}
		
		System.out.println("balance:"+balance);

		
		//System.out.println(72.5%20%10%5%1);
		
		
	}

}
