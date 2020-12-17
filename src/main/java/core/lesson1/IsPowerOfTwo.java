package core.lesson1;

public class IsPowerOfTwo {

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(129));
    }

    /**
     * Checks if given <code>value</code> is a power of two.
     *
     * @param value any number
     * @return <code>true</code> when <code>value</code> is power of two, <code>false</code> otherwise
     */
    public static boolean isPowerOfTwo(int value) {
        return Integer.bitCount(Math.abs(value)) == 1; // you implementation here
    }
}
