package ðŒ‹Lq‚Ì’Pƒ‰»;

public class CalcSend {
	int price;
	double total;

	public CalcSend(int price) {
		this.price = price;
	}

	public double sending() {
		if (isSpecalDeal()) {
			total = price * 0.95;
			send();
		} else {
			total = price * 0.98;
			send();
		}
		return total;
	}

	private void send() {
		System.out.println("send!!" + total);

	}

	private boolean isSpecalDeal() {
		return this.price > 1000;
	}
}