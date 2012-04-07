package ğŒ‹Lq‚Ì“‡;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcDisabilityMainTest {

	@Test
	public void test() {
		CalcDisability calcDisability = new CalcDisability();
		assertEquals(0,calcDisability.disabiilityAmount());
		assertNotSame(10, calcDisability.disabiilityAmount());
	}

}
