package pmt.actions;

import pmt.BankAccount;
import java.util.List;

public interface BankAccActions {
    void addBankAccount(BankAccount account);
    void linkAccounts(List<BankAccount> accounts);
}
