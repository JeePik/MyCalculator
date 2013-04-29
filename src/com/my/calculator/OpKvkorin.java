package com.my.calculator;

public class OpKvkorin implements OperationUnary {
	double res;
	
	public double exec(double valueOne) {
		double res = Math.sqrt(valueOne);
        return (res);
	}
}
