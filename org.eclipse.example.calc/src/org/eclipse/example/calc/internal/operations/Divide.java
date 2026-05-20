package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

/**
 * Binary divide operation
 */

public class Divide extends AbstractOperation implements BinaryOperation {

	// floating point division
	@Override
	public float perform(float arg1, float arg2) {
	    if (arg2 != 0) {
	        return arg1 / arg2;
	    }
	    return Float.NaN;
	}
		

	
	@Override
	public String getName() {
		return "/";
	}

}