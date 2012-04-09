package Nullオブジェクトの導入;

public class BillingPlan {
	String plan;
	
	public BillingPlan(int type) {
		// TODO Auto-generated constructor stub
		if (type == 1) {
			plan = "高いけど安定";
		}
	}
	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}
	
	public static BillingPlan basic() {
		// TODO Auto-generated method stub
		return null;
	}


}
