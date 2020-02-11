package homework.string;

public class Palindromes {

    private String stringOrigin;

    public Palindromes(String stringOrigin) {
        this.stringOrigin = stringOrigin;
    }

    public boolean isPalindrome() {
        String stringTemp = stringOrigin.trim().toLowerCase().
                replace(",", "").
                replace("'", "").
                replace("?", "").
                replace("!", "").
                replace(".", "");
        String[] stringStrip = stringTemp.split(" ");
        StringBuilder stringBuilderSplit = new StringBuilder();
        for (String word : stringStrip) {
            stringBuilderSplit.append(word);
        }
        stringTemp = new String(stringBuilderSplit);
        StringBuilder stringBuilderOrigin = new StringBuilder(stringTemp);
        String stringReverse = new String(stringBuilderOrigin.reverse());
        return stringTemp.equals(stringReverse);
    }

    @Override
    public String toString() {
        return "\u001B[1m"+'\'' + stringOrigin + '\''+"\u001B[0m";
    }
}
