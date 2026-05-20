// tutorial 8 corrected modulo

package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;

/**
 * Binary modulo operation
 */

public class Modulo extends AbstractOperation implements BinaryOperation {

	// floating point modulo
	@Override
	public float perform(float arg1, float arg2) {
	    if (arg2 == 0) {
	        return Float.NaN;
	    }
	    return arg1 % arg2;
	}
		
	
	@Override
	public String getName() {
		return "%";
	}

}
