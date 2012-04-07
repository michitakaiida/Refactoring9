package ğŒ‹Lq‚Ì“‡;

public class CalcDisability {

	public int disabiilityAmount() {
		int amount = 10;
	
		if (isNotEligible()) {
			amount = 0;
		}
		return amount;
	}

	private boolean isNotEligible() {
		Settings settings = new Settings();
		return settings.seniority < 2 || settings.monthDisabled > 12
				|| settings.isPartTimer;
	}
}
