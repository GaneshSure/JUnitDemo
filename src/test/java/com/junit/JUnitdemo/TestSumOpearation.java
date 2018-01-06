package com.junit.JUnitdemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSumOpearation {

	SumOperation sp = null;
	int val1,val2,exp;

	@Before
	public void preWork() {
		sp = new SumOperation();
		val1 = val2=1; 
		exp=2;
	}

	@Test
	public void testdoSum() {
		assertEquals(2, sp.doSum(val1, val2));
		System.out.println("test case executed successfully");
		//		int result = sp.doSum(val1, val2);
		//		assertEquals(2,result);

	}

	@After
	public void postWork() {
		sp = null;
		val1=val2=exp=0;
		System.out.println("After test case is executed");
	}
}
