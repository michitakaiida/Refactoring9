package ğŒ‹Lq‚Ì•ª‰ğ;

public class Calculation {
	public int calcCharge() {
		int month = 1;
		int charge;
		int quantity = 5;
		// int summerRate = 10;
		// int nonSummerRate = 2;

		// TODO Auto-generated method stub
		if (isSummer(month)) {
			charge = summerCharge(quantity);
		} else {
			charge = nonSummerCharge(quantity);
		}
		return charge;
	}

	private boolean isSummer(int month) {
		return 6 < month && month < 9;
	}

	private int summerCharge(int quantity) {
		int summerRate = 10;
		return quantity * summerRate;
	}

	private int nonSummerCharge(int quantity) {
		int nonSummerRate = 2;
		return quantity * nonSummerRate;
	}
}