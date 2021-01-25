package com.serenitydojo.calculator;

import java.util.List;

import com.google.common.base.Splitter;
import org.apache.commons.lang3.StringUtils;

public class Calculator {
	   public int evaluate(String expression) {
	        if (expression.isEmpty()) {
	            return 0;
	        }
	        List<String> tokens = Splitter.on(" ").splitToList(expression);

	        int runningTotal = 0;
	        String nextOperator = "+";

	        for(String token : tokens) {
	            if (!isNumeric(token)) {
	                nextOperator = token;
	            } else {
	                runningTotal = process(runningTotal, nextOperator, token);
	            }
	        }

	        return runningTotal;
	    }

	    private boolean isNumeric(String token) {
		// TODO Auto-generated method stub
		return false;
	}

		private int process(int runningTotal, String nextOperator, String token) {
	        switch (nextOperator) {
	            case "+":
	                return runningTotal + Integer.parseInt(token);
	            case "-":
	                return runningTotal - Integer.parseInt(token);
	            case "*":
	                return runningTotal * Integer.parseInt(token);
	            default:
	                throw new IllegalMathsOperatorException("Unknown operator " + nextOperator);
	        }
	    }
}
