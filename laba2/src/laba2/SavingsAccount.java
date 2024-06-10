package laba2;

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accNumber, double interestRate) {
        super(accNumber);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    @Override
    public String toString() {
        return "Savings : " + super.toString();
    }
}
