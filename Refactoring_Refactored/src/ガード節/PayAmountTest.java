package ÉKÅ[Éhêﬂ;

import static org.junit.Assert.*;

import org.junit.Test;

public class PayAmountTest {

	@Test
	public void test() {
		assertEquals(0.1, new CalcAmount(true,false,false).getPayAmount(),0.01);
		assertEquals(0.2, new CalcAmount(false,true,false).getPayAmount(),0.01);
		assertEquals(0.5, new CalcAmount(false,false,true).getPayAmount(),0.01);
		assertEquals(0.0, new CalcAmount(false,false,false).getPayAmount(),0.01);
	}

}
