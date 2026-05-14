/**********************************************************************
 *
 **********************************************************************/

package org.eclipse.example.calc.internal.operations;

import org.eclipse.example.calc.BinaryOperation;


/**
 * Binary power operation
 */
public class Power extends AbstractOperation implements BinaryOperation {

	@Override
	public float perform(float arg1, float arg2) {
		double result = Math.pow(arg1, arg2);
		return (float) result;
	}

	@Override
	public String getName() {
		return "^";
	}
}
