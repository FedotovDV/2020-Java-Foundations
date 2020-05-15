package testing.forJM.calculator.utils;

import testing.forJM.calculator.interfaces.CheckingExpression;

import java.util.regex.Pattern;

public class CheckingInputString implements CheckingExpression {

    private String inputString;
    private boolean romanNumeric;
    private boolean validExpression;

    public CheckingInputString(String inputString) {
        this.inputString = inputString;
        romanNumeric = false;
        validExpression = checkInputString();
    }


    private boolean checkInputString() {
        String[] expression;
        if (Pattern.matches("[0-9]+.[-+*/].[0-9]+", inputString)) {
            expression = inputString.split(" ");
            if (Pattern.matches("[1-9]", expression[0]) || Pattern.matches("10", expression[0])) {
                if (Pattern.matches("[-+*/]", expression[1])) {
                    if (Pattern.matches("[1-9]", expression[2]) || Pattern.matches("10", expression[2])) {
                        return true;
                    }
                }
            }
        } else if (Pattern.matches("[IVX]+.[-+*/].[IVX]+", inputString)) {
            expression = inputString.split(" ");
            if (Pattern.matches("[IVX]+", expression[0])) {
                if (Pattern.matches("[-+*/]", expression[1])) {
                    if (Pattern.matches("[IVX]+", expression[2])) {
                        romanNumeric = true;
                        return true;
                    }
                }
            }
        }

        return false;
    }

    @Override
    public boolean isRomanNumeric() {
        return romanNumeric;
    }

    @Override
    public boolean isValidExpression() {
        return validExpression;
    }
}
