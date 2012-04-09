package Nullオブジェクトの導入;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		Site site = new Site();
		assertNull(site.getCustomer());
	}

	@Test
	public void notNullTest() {
		Customer customer = new Customer();
		Site site = new Site();
		site.setCustomer(customer);
		customer =site.getCustomer();
		assertNotNull(site.getCustomer());
		assertEquals("iida", customer.customerName);	
	}
}
