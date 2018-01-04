package com.junit.JUnitdemo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculatorTest {

	Calculator c = new Calculator();

	@Test
	public void testAdd() {
		assertEquals(9, c.mul(3,3));
	}

}
