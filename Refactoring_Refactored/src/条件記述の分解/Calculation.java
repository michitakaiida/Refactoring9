package ğŒ‹Lq‚Ì•ª‰ğ;

public class Calculation {
	public int calcCharge() {
		int month = 1;
		int charge;
		int quantity = 5;
		int summerRate = 10;
		int nonSummerRate = 2;

		// TODO Auto-generated method stub
		if (6 < month && month < 9) {
			charge = quantity * summerRate;
		} else {
			charge = quantity * nonSummerRate;
		}
		return charge;
	}
}