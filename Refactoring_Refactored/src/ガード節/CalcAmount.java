package ƒK[ƒhß;

public class CalcAmount {
	double result;
	boolean isdead;
	boolean isSeparated;
	boolean isRetired;

	public CalcAmount(boolean isdead, boolean isSeparated, boolean isRetired) {
		this.isdead = isdead;
		this.isSeparated = isSeparated;
		this.isRetired = isRetired;
	}

	public double getPayAmount() {
		if (isdead) {
			return deadAmount();
		}
		if (isSeparated) {
			return separatedAmount();
		}
		if (isRetired) {
			return retiredAmount();
		}
		return result;
	}

	private static double retiredAmount() {
		// TODO Auto-generated method stub
		return 0.5;
	}

	private static double separatedAmount() {
		// TODO Auto-generated method stub
		return 0.2;
	}

	private static double deadAmount() {
		// TODO Auto-generated method stub
		return 0.1;
	}

}
