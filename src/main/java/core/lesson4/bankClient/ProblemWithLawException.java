package core.lesson4.bankClient;

public class ProblemWithLawException extends RuntimeException{
    public ProblemWithLawException() {
    }

    public ProblemWithLawException(String message) {
        super(message);
    }
}
