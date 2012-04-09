package ポリモーフィズム;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		Employee emp = new Employee();
		assertEquals(10000,new Engiineer().payAmount(emp));
		assertEquals(11000,new SalesMan().payAmount(emp));
		assertEquals(11500,new Manager().payAmount(emp));
	}

}
