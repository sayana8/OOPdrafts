package laba2;

public class BankTest {
    public static void main(String[] args) {
        Bank bank = new Bank();

        SavingsAccount savingsAccount = new SavingsAccount(1, 0.05);
        CheckingAccount checkingAccount = new CheckingAccount(2, 3); 


        bank.openAccount(savingsAccount);
        bank.openAccount(checkingAccount);


        savingsAccount.deposit(1000);
        checkingAccount.deposit(500);
        checkingAccount.withdraw(200);
        checkingAccount.deposit(300);
        savingsAccount.transfer(200, checkingAccount);

        bank.update();

      
        bank.printAccounts();
    }
}
