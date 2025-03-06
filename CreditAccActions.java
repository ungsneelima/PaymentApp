package pmt.actions;

import pmt.BankAccount;
import java.util.List;
import java.util.ArrayList;

public class CreditAccActions implements BankAccActions {
    private List<BankAccount> creditAccounts = new ArrayList<>();

    @Override
    public void addBankAccount(BankAccount account) {
        creditAccounts.add(account);
        System.out.println("Credit account added: " + account.getAcctNumber());
    }

    @Override
    public void linkAccounts(List<BankAccount> accounts) {
        creditAccounts.addAll(accounts);
        System.out.println("Linked credit accounts successfully.");
    }
}
