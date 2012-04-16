package Nullオブジェクトの導入;

public class NullCustomer extends Customer {
	

	public boolean isNull() {
		return true;
	}
	
	public String  getName() {
		return "occipant";
	}
	
	public void setPlan(BillingPlan plan ) {
		this.plan = new BillingPlan(0);
	}


}
