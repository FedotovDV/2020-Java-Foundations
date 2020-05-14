package testing.forJM.calculator;

import testing.forJM.calculator.numeric.RomanNumeric;

import java.io.*;
import java.util.regex.Pattern;

import static testing.forJM.calculator.impl.OperationFactory.getOperation;
import static testing.forJM.calculator.numeric.ConverterArabicToRoman.convertArabicToRoman;


public class CalculatorRun {

    public static void main(String[] args) {


        String[] expression = inputExpression();
//        for (String symbol : expression) {
//            System.out.print(symbol + " / ");
//        }

//        System.out.println(getOperation("*").result(4, 2));


    }

    private static String[] inputExpression() {
        String[] expression = null;
        String inputString;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Input: ");
//            inputString = bufferedReader.readLine();
//            System.out.println(Pattern.matches("[IVX]+.[-+*/].[IVX]+", inputString));
//            System.out.println(Pattern.matches("[0-9]+.[-+*/].[0-9]+", inputString));
//            expression = inputString.split(" ");


            try {
               inputString = bufferedReader.readLine();
                    int x = 0;
                    int y = 0;
                    if (Pattern.matches("[0-9]+.[-+*/].[0-9]+", inputString)) {
                        expression = inputString.split(" ");
                        if (Pattern.matches("[1-9]", expression[0]) || Pattern.matches("10", expression[0])) {
                            x = Integer.parseInt(expression[0]);
                            System.out.println("x = " + x);
                        }
                        if (Pattern.matches("[1-9]", expression[2]) || Pattern.matches("10", expression[2])) {
                            y = Integer.parseInt(expression[2]);
                            System.out.println("y = " + y);

                        }
                        if (Pattern.matches("[-+*/]", expression[1])) {
                            System.out.println("OUTPUT: ");
                            System.out.println(getOperation(expression[1]).result(x, y));

                        } else {
                            throw new IllegalArgumentException();
                        }


                    } else if (Pattern.matches("[IVX]+.[-+*/].[IVX]+", inputString)) {
                        expression = inputString.split(" ");
                        RomanNumeric romanNumeric;
                        if (Pattern.matches("[IVX]+", expression[0])) {
                            romanNumeric = RomanNumeric.valueOf(expression[0]);
                            x = romanNumeric.getArabicNumerals();
                            if(x > 10){
                                throw new IllegalArgumentException();
                            }
                        }
                        if (Pattern.matches("[IVX]+", expression[2])) {
                            romanNumeric = RomanNumeric.valueOf(expression[2]);
                            y = romanNumeric.getArabicNumerals();
                            if(y > 10){
                                throw new IllegalArgumentException();
                            }
                        }
                        if (Pattern.matches("[-+*/]", expression[1])) {
                            System.out.println("Output: ");
                            int result = getOperation(expression[1]).result(x, y);

                            System.out.println(convertArabicToRoman(result));

                        }
                    } else {
                        throw new IllegalArgumentException();
                    }

            } catch (IllegalArgumentException e) {
                System.out.println("Некорректный ввод!");
            }


        } catch (
                IOException e) {
            e.printStackTrace();
        }
        return expression;
    }

}






