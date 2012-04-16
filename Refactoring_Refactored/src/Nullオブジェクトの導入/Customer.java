package Nullオブジェクトの導入;

public class Customer {
	String customerName;
	BillingPlan plan;
	PaymentHistory paymentHistory;
	int weeksDelinquent;

	public Customer(String customerName, BillingPlan plan,
			PaymentHistory paymentHistory, int weeksDelinquent) {
		super();
		this.customerName = customerName;
		this.plan = plan;
		this.paymentHistory = paymentHistory;
		this.weeksDelinquent = weeksDelinquent;
	}


	public String getName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public BillingPlan getplan() {
		return plan;
	}
	
	public void setPlan(BillingPlan plan) {
		this.plan = plan;
	}

	public int getHistory() {
		return weeksDelinquent;
	}
	
	public void setHistory(PaymentHistory paymentHistory) {
		this.paymentHistory = paymentHistory;
	}


	public boolean isNull() {
		return false;
	}
	
	protected Customer() {}
	
	static Customer newNull(){
		return new NullCustomer();
	}
	
}
