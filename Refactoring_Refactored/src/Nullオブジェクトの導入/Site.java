package Nullオブジェクトの導入;

public class Site {
	Customer customer;

	public Customer getCustomer() {
		if (customer == null) {
			return Customer.newNull();
		} else {
			return customer;
		}

	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}
