package testing.forJM.calculator.impl;

import testing.forJM.calculator.interfaces.Operation;

public class DivideOperation implements Operation {
    @Override
    public int result(int x, int y) {
        return x / y;
    }
}
