package core.lesson4.bankClient;

public class BankClient {
    private String crediteHistory;
    public BankClient(String crediteHistory) {
        this.crediteHistory=crediteHistory;
    }

    public String getCrediteHistory() {
        return crediteHistory;
    }
}
