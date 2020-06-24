package core.lesson3.checkLabels;

public class TooLongTextAnalyzer implements TextAnalyzer {
    private int maxLength;

    public TooLongTextAnalyzer(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public Label processText(String text) {
        return (text.length()<= maxLength)? Label.OK: Label.TOO_LONG;
    }
}
