package ğŒ‹Lq‚Ì’Pƒ‰»;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcSendTest {

	@Test
	public void test() {
		assertEquals(980.0,new CalcSend(1000).sending(),1);
		assertEquals(950.0,new CalcSend(1001).sending(),1);
	}

}
