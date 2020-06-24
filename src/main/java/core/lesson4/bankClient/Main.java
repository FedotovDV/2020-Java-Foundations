package core.lesson4.bankClient;

public class Main {
    public static void main(String[] args) {
        BankClient client1 = new BankClient("Bad");
        BankClient client2 = new BankClient("Problem with law");
        BankClient client3 = new BankClient("Good history");
        BankWorker employee = new BankEmployee();

        System.out.println(getCreditForClient(employee, client1));
        System.out.println(getCreditForClient(employee, client2));
        System.out.println(getCreditForClient(employee, client3));
    }

    private static boolean getCreditForClient(BankWorker bankWorker, BankClient bankClient) {
        try {
            return bankWorker.checkClientForCredit(bankClient);
        } catch (BadCreditHistoryException | ProblemWithLawException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }
}
