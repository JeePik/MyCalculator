package com.my.calculator;

public class OpFactorial implements OperationUnary{
	double res;
	public double exec(double valueOne) {
		res=1;
		if (valueOne == 0){
			res = 0;
		}
		else {
			if (valueOne<0){
				System.out.println("Vu vvelu vid'emne znachennya. Byla vukonana operaciya modyl'");
			    valueOne = Math.abs(valueOne); 
			}
					while (valueOne>0){
						res*=valueOne--;
		   }			
		}
       return (res);
    }
}
