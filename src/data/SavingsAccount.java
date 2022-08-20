package data;

public class SavingsAccount extends BankAccount{
    public SavingsAccount(long accountNumber, String accountOpeningDate, String modeOfOperation, boolean internetBankingEnabled, double availableBalance, double totalBalance, double rateOfInterest) {
        super(accountNumber, accountOpeningDate, modeOfOperation, internetBankingEnabled, availableBalance, totalBalance, rateOfInterest);
    }
    @Override
    public double showBalance(){
        return getAvailableBalance();
    }
    public double creditCash(double amount){
        setAvailableBalance(getAvailableBalance()+amount);
        return getAvailableBalance();
    }
    public double debitCash(double amount){
        setAvailableBalance(getAvailableBalance()-amount);
        return getAvailableBalance();
    }

    @Override
    public void display() {
        super.display();

        System.out.println("Balance in Savings Account is = $" + showBalance());
        System.out.println("Balance in Savings Account after crediting amount 500 is = $" + creditCash(500));
        System.out.println("Balance in Savings Account after debiting amount 300 is = $" + debitCash(300));
    }
}
