package Nullオブジェクトの導入;

public class Customer {
	String customerName ="iida";
	BillingPlan plan = new BillingPlan(1);
	PaymentHistory paymentHistory = new PaymentHistory();
	int weeksDelinquent;



	public String getName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public BillingPlan getplan() {
		return plan;
	}

	public int getHistory() {
		return weeksDelinquent;
	}
	
	public boolean isNull() {
		return false;
	}
	
	protected Customer() {}
	
	static Customer newNull(){
		return new NullCustomer();
	}
	
}
