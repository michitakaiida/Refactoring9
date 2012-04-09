package Nullオブジェクトの導入;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String customerName;
		BillingPlan plan;
		int weeksDelinquent;
	
		Customer customer = new Customer();
		Site site = new Site();
		//この下をコメントアウトでSiteのcustomerがnullになる。
//		site.setCustomer(customer);
		customer =site.getCustomer();
		
		if (customer == null) {
			customerName = "occupant";
		} else {
			customerName = customer.getName();
		}

		if (customer == null) {
			plan = BillingPlan.basic();
		} else {
			plan = customer.plan;
		}

		if (customer == null) {
			weeksDelinquent = 0;
		} else {
			weeksDelinquent = customer.paymentHistory
					.getWeeksDeliquentInLastYear();
		}

		System.out.println(customerName);
	}
}
