package com.junit.JUnitdemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculatorTest {

	Calculator c = new Calculator();

	@BeforeClass
	public static void onetimeBefore() {
		System.out.println("Before all ... 1");
	}

	@Before
	public  void preWork() {
//		c = new Calculator();
		System.out.println("Just before test case ... 2");
	}


	@Test
	public void testAdd() {
		assertEquals(9, c.mul(3,3));
		System.out.println("Satisfied Result");
	}

	@Test
	public void testA() {
		System.out.println("In  A test case 3");
	}

	@Test
	public void testB() {
		System.out.println("In B test case 4");
	}

	@Test
	public void testC() {
		System.out.println("In c test case 5");
	}

	@After
	public  void postWork() {
		System.out.println("After complition of test case 6");
	}

	@AfterClass
	public static void onetimeAfter() {
		System.out.println("After complition of test case only once 7");
	}
}
