package main;


import data.RecurringAccount;
import data.SavingsAccount;

public class BankAccountImpl {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(459652324587L,"22.3.2005","Self",true,3000,3000,3.5);
        System.out.println("Savings Account Details ");
        savingsAccount.display();
        System.out.println();
        RecurringAccount recurringAccount = new RecurringAccount(456874563254L,"23.3.2005","Joint",false,4000,4000,3,"23.3.2010",5);
        System.out.println("Recurring Account Details ");
        recurringAccount.display();
    }
}
