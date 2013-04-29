package com.my.calculator;

public class OpCos implements OperationUnary {
	int res;
		
		public double exec(double valueOne) {
			double res = Math.cos(valueOne);
	        return (res);
		}
	}
