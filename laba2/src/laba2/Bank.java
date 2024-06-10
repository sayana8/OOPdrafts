package laba2;

import java.util.Vector;
class Bank {
    private Vector<Account> accounts;

    public Bank() {
        accounts = new Vector<Account>();
    }

    public void openAccount(Account account) {
        accounts.add(account);
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    public void update() {
        for (Account account : accounts) {
            if (account instanceof SavingsAccount) {
                SavingsAccount savingsAccount = (SavingsAccount) account;
                savingsAccount.addInterest();
            } else if (account instanceof CheckingAccount) {
                CheckingAccount checkingAccount = (CheckingAccount) account;
                checkingAccount.deductFee();
            }
        }
    }

    public void printAccounts() {
        for (Account account : accounts) {
            account.print();
        }
    }
}