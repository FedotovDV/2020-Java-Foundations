package testing.forJM.calculator.numeric;


import java.util.HashMap;
import java.util.Map;

public class ConverterArabicToRoman {


    private static final Map<Integer, String> romanNumeric = new HashMap<>();

    static {
        romanNumeric.put(1, "I");
        romanNumeric.put(2, "II");
        romanNumeric.put(3, "III");
        romanNumeric.put(4, "IV");
        romanNumeric.put(5, "V");
        romanNumeric.put(6, "VI");
        romanNumeric.put(7, "VII");
        romanNumeric.put(8, "VIII");
        romanNumeric.put(9, "IX");
        romanNumeric.put(10, "X");
        romanNumeric.put(20, "XX");
        romanNumeric.put(30, "XX");
        romanNumeric.put(40, "XL");
        romanNumeric.put(50, "L");
        romanNumeric.put(60, "LX");
        romanNumeric.put(70, "LXX");
        romanNumeric.put(80, "LXXX");
        romanNumeric.put(90, "XC");
        romanNumeric.put(100, "C");
    }

    public static String convertArabicToRoman(int number) {
        if (number >= 1 && number <= 10) {
            return romanNumeric.get(number);

        } else if (number > 10 && number < 100) {
            String s = romanNumeric.get(number / 10 * 10);
            if ((number % 10) != 0) {
                s += romanNumeric.get(number % 10);
            }
            return s;
        } else if (number == 100) {
            return romanNumeric.get(number);
        }
        return "";
    }

}
