package pr1;

public class task55 {
    private double balance;
    private double interestRate;

    public task55(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interestAmount = balance * (interestRate / 100);
        balance += interestAmount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        double initialBalance = 1000.0; 
        double interestRate = 10.0; 

        task55 account = new task55(initialBalance, interestRate);

        System.out.println("Initial Balance: $" + account.getBalance());

        account.addInterest();

        System.out.println("New Balance after adding interest: $" + account.getBalance());
    }
}