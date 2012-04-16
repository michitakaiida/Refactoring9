package Nullオブジェクトの導入;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		Customer customer = new Customer();
		Site site = new Site();
		site.setCustomer(customer);
		assertNull(site.getCustomer().customerName);
	}
	@Test
	public void notNullTest() {
		Customer customer = new Customer("iida",new BillingPlan(1),new PaymentHistory(),1);
		Site site = new Site();
		site.setCustomer(customer);
		customer =site.getCustomer();
		assertNotNull(site.getCustomer());
		assertEquals("iida", customer.customerName);	
	}
}
