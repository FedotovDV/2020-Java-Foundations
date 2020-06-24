package core.lesson4.bankClient;

public class BankEmployee implements BankWorker{

    @Override
    public boolean checkClientForCredit(BankClient bankClient) {
        if("Bad".equalsIgnoreCase(bankClient.getCrediteHistory())){
            throw new BadCreditHistoryException("Проблемы с банковской историей");
        }else if("Problem with law".equalsIgnoreCase(bankClient.getCrediteHistory())){
            throw new ProblemWithLawException("Проблемы с банковской историей");
        }
        return true;
    }
}
