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
public class TestCalcBinaryOp {
	 private int inpOperation;
	 private double arg1;
	 private double arg2;
	 private double expected;
	 double res;
	 private Calculator calc;
		 
		 	 @Before
		 	 public void setUp() throws Exception{
		 		calc = new Calculator();
		 	 }
		 	
			 public TestCalcBinaryOp(int inpOperation, double arg1, double  arg2, double  expected) {
			    this.inpOperation = inpOperation;
			    this.arg1 = arg1;
			    this.arg2 = arg2;
			    this.expected = expected;
			 }
		 
			 @Parameters
			 public static Collection<Object[]> data() {
			   Object[][] data = new Object[][] { 
					   { 0, 10, 5, 15 } ,
					   { 1, 5, 3, 2 } ,
					   { 2, 3, 5, 15 }, 
					   { 3, 8, 2, 4 } };
			   return Arrays.asList(data);
			 }

			 @Test
			 public void calcTest() {		 
				  res = calc.forTestBin(inpOperation, arg1, arg2);
				  Assert.assertEquals(expected, res, 0);
			 }
		}