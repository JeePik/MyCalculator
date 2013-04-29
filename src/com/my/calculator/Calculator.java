package com.my.calculator;

import java.io.PrintStream;
import java.util.Map;
import java.util.Scanner;

class Calculator { 
	private Scanner in;
	private PrintStream out;
	private Map<Integer, OperationUnary> unaryOperations;
	private Map<Integer, OperationBinary> binaryOperations;
	private double arg1;
	private double arg2;
	Double res;
	private int inpOperation;
	private int whatDo;

	    public Calculator(){
	    	out = System.out;
	        unaryOperations = MyOpFactory.getUnaryOperators();
			binaryOperations = MyOpFactory.getBinaryOperators();
	    }
	   
	    public void exec(){   						
	        boolean nextStep = true;               

	        do {
	        	try{ 
	
	        		inpFirstArg();
	        		
	        		inpOperation();
	           	 	
	           	 	res = unOp(inpOperation);
	           	 	if (res != null){	
	           	 			out.println(res);   
	           	 	}else{
	           	 			inpSecondArg();
	           	 			res = binOp(inpOperation);
	           	 			if(res != null){
	           	 				out.println(res);	
	           	 			} else if ((inpOperation>7)||(inpOperation<0)){
	           	 				out.println("There is no such operation!");
	           	 			}
	           	 	}	
	           	 	
	           	 	inpWhatToDo();
	           		if (whatDo == 2) nextStep = false;
	        	 }catch(Exception e){
				    out.println("ERROR!!! Enter a number.");
	        	 }
	        } while (nextStep);
	    }
	    
	    private Double inpFirstArg(){		
	     	in = new Scanner(System.in);
            out.println("Enter first argument:");
            arg1 = in.nextDouble(); 
            return arg1;
	    }
	    
	    private Double inpSecondArg(){		
	    	in = new Scanner(System.in);
        	out.println("Enter second argument:");
        	arg2 = in.nextDouble(); 
            return arg2;
	    }
	    
	    private int inpOperation(){			
	    	in = new Scanner(System.in);
        	out.println("Choose some operation:");
        	out.println("----------------------------------------------");
        	out.print(" [0] - symma     |");  
        	out.println(" [1] - riznutcya  	   |");
        	out.print(" [2] - mnojennya  |");
        	out.println(" [3] - dilennya 	   |");
        	out.print(" [4] - factorial |");
        	out.println(" [5] - kvkorin |");
        	out.print(" [6] - cos  |");
       	 	out.println(" [7] - sin	   |");
       	 	out.println("----------------------------------------------");
       	 	inpOperation = in.nextInt();
       	 	return inpOperation;
	    }
	    
	    private int inpWhatToDo(){			
            in = new Scanner(System.in);
            out.println("Do you want to continue?");
            out.print("1 - Continue ");
            out.println("2 - Exit");  
            whatDo = in.nextInt();
            return whatDo;
	    }
	    
	    public Double binOp(int inpOperation) { 	
	    	if (binaryOperations.get(inpOperation) != null) {
				return Double.valueOf(binaryOperations.get(inpOperation).exec(arg1, arg2));
	    	}return null;
		}

		private Double unOp(int inpOperation) {		
			if (unaryOperations.get(inpOperation) != null) {
				return Double.valueOf(unaryOperations.get(inpOperation).exec(arg1));
			} return null;
		}
		
		public Double forTestUn(int inpOperation, double valueOne) {
			arg1 = valueOne;
			Double res = unOp(inpOperation);
			return res;
		}

		public Double forTestBin(int inpOperation, double valueOne, double valueTwo) {
			arg1 = valueOne;
			arg2 = valueTwo;
			Double res = binOp(inpOperation);
			return res;
		}
}