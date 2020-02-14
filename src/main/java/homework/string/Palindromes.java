package homework.string;

public class Palindromes {

    private String stringOrigin;

    public Palindromes(String stringOrigin) {
        this.stringOrigin = stringOrigin;
    }

    public boolean isPalindrome() {
        String stringTemp = stringOrigin.trim().replaceAll("\\W", "");
        StringBuilder stringBuilderOrigin = new StringBuilder(stringTemp);
        return stringTemp.equalsIgnoreCase(new String(stringBuilderOrigin.reverse()));
    }

    @Override
    public String toString() {
        return "\u001B[1m"+'\'' + stringOrigin + '\''+"\u001B[0m";
    }
}
