package testing.forJM.calculator;

import testing.forJM.calculator.numeric.RomanNumeric;

import java.io.*;
import java.util.regex.Pattern;

public class CalculatorRun {

    public static void main(String[] args) {


        String[] expression = inputExpression();
        for (String symbol : expression) {
            System.out.print(symbol + " / ");

        }

//        System.out.println(getOperation("*").result(4, 2));


    }

    private static String[] inputExpression() {
        String[] expression = null;
        String inputString;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Input: ");
            inputString = bufferedReader.readLine();
            System.out.println(Pattern.matches("[A-Z_0-9].*.[A-Z_0-9]",inputString));
            expression = inputString.split(" ");


            try {
                RomanNumeric romanNumeric;

                if(Pattern.matches("[0-9]",expression[0]) ||Pattern.matches("[0-9][0-9]",expression[0] )){
                    System.out.println(expression[0]);
                } else {
                    romanNumeric = RomanNumeric.valueOf(expression[0]);
                    System.out.println(romanNumeric.name());
                    System.out.println(romanNumeric.getArabicNumerals());
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Некорректный ввод!");
            }




        } catch (IOException e) {
            e.printStackTrace();
        }
        return expression;
    }

}






