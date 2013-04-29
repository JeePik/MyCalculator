package com.my.calculator;

import java.util.HashMap;
import java.util.Map;

	public class MyOpFactory {
		
			MyOpFactory () {}
			
			public static Map<Integer, OperationBinary> getBinaryOperators() {    
			     Map<Integer, OperationBinary> Operations = new HashMap<Integer, OperationBinary>();
			     Operations.put(0, new OpPlus());
			     Operations.put(1, new OpMinus());
			     Operations.put(2, new OpMultiply());
			     Operations.put(3, new OpDivision());
			     return Operations;
			} 

			public static Map<Integer, OperationUnary> getUnaryOperators() {    
			     Map<Integer, OperationUnary> Operations = new HashMap<Integer, OperationUnary>();
			     Operations.put(4, new OpFactorial());
			     Operations.put(5, new OpKvkorin());
			     Operations.put(6, new OpCos());
			     Operations.put(7, new OpSin());
			     return Operations;
			}
		}