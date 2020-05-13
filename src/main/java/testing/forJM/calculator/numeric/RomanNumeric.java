package testing.forJM.calculator.numeric;

public enum RomanNumeric {

    I(1),
    II(2),
    III(3),
    IV(4),
    V(5),
    VI(6),
    VII(7),
    VIII(8),
    IX(9),
    X(10);


    private int arabicNumerals;

    RomanNumeric(int arabicNumerals) {
        this.arabicNumerals = arabicNumerals;
    }

    public int getArabicNumerals() {
        return arabicNumerals;
    }

}
