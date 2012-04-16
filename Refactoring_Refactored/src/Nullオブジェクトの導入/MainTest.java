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
		assertNull(site.getCustomer().plan);
	}

	@Test
	public void notNullTest() {
		Customer customer = new Customer("iida",new BillingPlan(1),new PaymentHistory(),1);
		Site site = new Site();
		site.setCustomer(customer);
		customer =site.getCustomer();
		assertNotNull(site.getCustomer());
		assertEquals("iida", customer.customerName);
		assertEquals("高いけど安定", customer.plan.plan);
	}
}
