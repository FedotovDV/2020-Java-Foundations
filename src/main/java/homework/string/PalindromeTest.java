package homework.string;

public class PalindromeTest {
    public static void main(String[] args) {

        Palindromes[] palindromes = getPalindromes();

        for (Palindromes palindrome : palindromes) {
            printPalindrome(palindrome);
        }

    }

    private static void printPalindrome(Palindromes stringOrigin1) {
        System.out.println(stringOrigin1.toString() + " is palindrome ? -" + (stringOrigin1.isPalindrome() ? "Yes" : "No"));
    }
    private static Palindromes[] getPalindromes(){
        Palindromes palindromes1  = new Palindromes("Don't nod. ");
        Palindromes palindromes2  = new Palindromes("I did, did I? ");
        Palindromes palindromes3  = new Palindromes("My gym ");
        Palindromes palindromes4  = new Palindromes("Red rum, sir, is murder  ");
        Palindromes palindromes5  = new Palindromes("Was it a cat I saw? ");
        Palindromes palindromes6  = new Palindromes("Eva, can I see bees in a cave? ");
        Palindromes palindromes7  = new Palindromes("No lemon, no melon ");
        Palindromes palindromes8  = new Palindromes("Redder ");
        Palindromes palindromes9  = new Palindromes("Радар");
        Palindromes palindromes10  = new Palindromes("Мат и тут и там");
        Palindromes palindromes11  = new Palindromes("А роза упала на лапу Азора");
        Palindromes palindromes12  = new Palindromes("Дорог Рим город или дорог Миргород?!");
        Palindromes palindromes13  = new Palindromes("Алиса - сила!");

        return new Palindromes[]{palindromes1,palindromes2,palindromes3,palindromes4,palindromes5,palindromes6,
                palindromes7, palindromes8, palindromes9, palindromes10, palindromes11, palindromes12, palindromes13};
    }

}
