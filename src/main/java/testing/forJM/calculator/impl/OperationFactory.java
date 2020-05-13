package testing.forJM.calculator.impl;

import collections.listPractice.myArrayList.MyArrayList;
import testing.forJM.calculator.Operation;
import testing.forJM.calculator.impl.*;
import java.util.*;

public class OperationFactory {

    private static final   Map<String, Operation> operationMap = new HashMap<>();

    static {
        operationMap.put("+", new AddOperation());
        operationMap.put("-", new SubtractOperation());
        operationMap.put("*", new MultiplyOperation());
        operationMap.put("/", new DivideOperation());
    }

    public static Operation getOperation(String symbol) {
        return operationMap.get(symbol);
    }
}
