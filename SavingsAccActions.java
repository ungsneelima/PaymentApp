package pmt.actions;

import java.util.ArrayList;
import java.util.List;
import pmt.BankAccount;
import pmt.actions.BankAccActions;

public class SavingsAccActions implements BankAccActions {
    private List<BankAccount> savingsAccounts = new ArrayList<>();

    @Override
    public void addBankAccount(BankAccount account) {
        savingsAccounts.add(account);
        System.out.println("Savings account added: " + account.getAcctNumber());
    }

    @Override
    public void linkAccounts(List<BankAccount> accounts) {
        savingsAccounts.addAll(accounts);
        System.out.println("Linked savings accounts successfully.");
    }
}
