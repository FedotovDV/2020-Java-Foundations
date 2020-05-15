package testing.forJM.calculator.impl;

import testing.forJM.calculator.interfaces.Operation;

public class SubtractOperation implements Operation {
    @Override
    public int result(int x, int y) {
        return x - y;
    }
}
