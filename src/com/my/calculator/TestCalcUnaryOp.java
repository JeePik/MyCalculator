package com.my.calculator;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestCalcUnaryOp {
	 private int inpOperation;
	 private double arg1;
	 private double expected;
	 double res;
	 private Calculator calc;

	@Before
	public void setUp() throws Exception {
		calc = new Calculator();
	}
	
	public TestCalcUnaryOp(int inpOperation, double arg1, double  expected) {
	    this.inpOperation = inpOperation;
	    this.arg1 = arg1;
	    this.expected = expected;
	 }
 
	 @Parameters
	 public static Collection<Object[]> data() {
	   Object[][] data = new Object[][] { 
			   { 4, 5, 120 }, 
			   { 5, 9, 3 },
			   { 6, 90, -0.4480736161291702 },
			   { 7, 90, 0.8939966636005579 }};
	   return Arrays.asList(data);
	 }
	 
	 @Test
	 public void calcTest() {		 
		  res = calc.forTestUn(inpOperation, arg1);
		  Assert.assertEquals(expected, res, 1.0e-5);
	 }
}