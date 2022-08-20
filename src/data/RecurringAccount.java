package data;

public class RecurringAccount extends BankAccount{
    private String closingDate;
    private int tenure;

    public RecurringAccount(long accountNumber, String accountOpeningDate, String modeOfOperation, boolean internetBankingEnabled, double availableBalance, double totalBalance, double rateOfInterest, String closingDate,int tenure) {
        super(accountNumber, accountOpeningDate, modeOfOperation, internetBankingEnabled, availableBalance, totalBalance, rateOfInterest);
        this.closingDate = closingDate;
        this.tenure = tenure;
    }
    public String getClosingDate() {
        return closingDate;
    }
    public void setClosingDate(String closingDate) {
        this.closingDate = closingDate;
    }
    public void setTenure(int tenure){
        this.tenure = tenure;
    }
    public int getTenure(){
        return tenure;
    }
    @Override
    public double showBalance(){
        return getAvailableBalance();
    }
}
