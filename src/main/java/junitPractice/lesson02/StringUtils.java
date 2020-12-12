package junitPractice.lesson02;

public class StringUtils {
    //"   **" ---> "**", "****" ---> "****","**  " ---> "**  "
    public static String chopOff2SpecesAtHead(String inputString) {
        if (inputString.length() <= 2) {
            return inputString.replaceAll(" ", "");
        }
        String head = inputString.substring(0, 2);
        String tail = inputString.substring(2);
        return head.replaceAll(" ", "") + tail;
    }
    // "1234" --> false, "1212" --> true, "12" --> true, "1" --> false
    public static boolean are2CharsAtHeadAndTailEqual(String checkedString) {
        if (checkedString.length() <= 1) {
            return false;
        }
        if (checkedString.length() == 2) {
            return true;
        }
        String head = checkedString.substring(0, 2);
        String tail = checkedString.substring(checkedString.length() - 2);
        return head.equals(tail);
    }
}
