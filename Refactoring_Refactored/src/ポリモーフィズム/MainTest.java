package ポリモーフィズム;

import static org.junit.Assert.*;

import org.junit.Test;

public class MainTest {

	@Test
	public void test() {
		assertEquals(10000,new Employee(1).payAmount());
		assertEquals(11000,new Employee(2).payAmount());
		assertEquals(11500,new Employee(3).payAmount());
	}

}
