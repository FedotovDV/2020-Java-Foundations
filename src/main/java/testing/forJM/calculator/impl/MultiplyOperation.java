package testing.forJM.calculator.impl;

import testing.forJM.calculator.interfaces.Operation;

public class MultiplyOperation implements Operation {
    @Override
    public int result(int x, int y) {
        return x * y;
    }
}