package threadpractice2;

import java.util.concurrent.Callable;

public class WordLengthCallable implements Callable<Integer> {
    private String word;

    public WordLengthCallable(String word) {
        this.word = word;
    }

    public Integer call() {
        return word.length();
    }
}

