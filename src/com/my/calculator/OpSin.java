package com.my.calculator;

public class OpSin implements OperationUnary {
	int res;
		
		public double exec(double valueOne) {
			double res = Math.sin(valueOne);
	        return (res);
		}
	}

