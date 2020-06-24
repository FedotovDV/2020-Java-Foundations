package core.lesson4.bankClient;

public class BadCreditHistoryException extends RuntimeException{
    public BadCreditHistoryException() {
    }

    public BadCreditHistoryException(String message) {
        super(message);
    }
}
