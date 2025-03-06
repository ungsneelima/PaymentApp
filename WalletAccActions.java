package pmt.actions;

import pmt.BankAccount;
import java.util.ArrayList;
import java.util.List;

public class WalletAccActions implements BankAccActions {
    private List<BankAccount> walletAccounts = new ArrayList<>();

    @Override
    public void addBankAccount(BankAccount account) {
        walletAccounts.add(account);
        System.out.println("Wallet account added: " + account.getAcctNumber());
    }

    @Override
    public void linkAccounts(List<BankAccount> accounts) {
        walletAccounts.addAll(accounts);
        System.out.println("Linked wallet accounts successfully.");
    }
}
