package laba2;

class CheckingAccount extends Account {
    private int transactions;
    private int freeTransactions;

    public CheckingAccount(int accNumber, int freeTransactions) {
        super(accNumber);
        this.transactions = 0;
        this.freeTransactions = freeTransactions;
    }

    public void deductFee() {
        int extraTransactions = transactions - freeTransactions;
        if (extraTransactions > 0) {
            double fee = extraTransactions * 0.02; 
            withdraw(fee);
        }
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactions++;
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactions++;
    }

    @Override
    public String toString() {
        return "Checking " + super.toString();
    }
}

