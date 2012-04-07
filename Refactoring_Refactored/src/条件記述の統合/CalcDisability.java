package ğŒ‹Lq‚Ì“‡;

public class CalcDisability {

	public int disabiilityAmount() {

		int seniority = 0;
		boolean isPartTimer = false;
		int monthDisabled = 0;
		int amount = 10;

		if (seniority < 2) {
			amount=0;
		}
		if (monthDisabled > 12) {
			amount=0;
		}
		if (isPartTimer) {
			amount=0;
		}
		return amount;
	}
}
