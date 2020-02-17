package exceptions;

public class WrongAgeException extends RuntimeException{
    public WrongAgeException() {
        super("Wrong age!");
    }
}
