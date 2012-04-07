package ğŒ‹Lq‚Ì•ª‰ğ;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcChargeTest {

	@Test
	public void test() {
		Calculation calculation = new Calculation();
		assertEquals(10,calculation.calcCharge());
		assertNotSame(9, calculation.calcCharge());

	}

}
