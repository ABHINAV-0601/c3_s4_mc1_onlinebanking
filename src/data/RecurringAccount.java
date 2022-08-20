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

    @Override
    public void display() {
        super.display();
        System.out.println("closingDate = " + closingDate);
        System.out.println("tenure = " + tenure);
        System.out.println("Balance in the recurring account is : $" + showBalance());
    }
}
