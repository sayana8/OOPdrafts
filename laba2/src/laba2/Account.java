package laba2;

import java.util.Vector;

public class Account {
    private double balance;
    private int accNumber;

    public Account(int a) {
        balance = 0.0;
        accNumber = a;
    }

    public void deposit(double sum) {
        balance = balance + sum;
    }

    public void withdraw(double sum) {
        balance = balance - sum;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accNumber;
    }

    public void transfer(double amount, Account other) {
        withdraw(amount);
        other.deposit(amount);
    }

    public String toString() {
        return "In your " + accNumber + " account, your current balance is " + balance;
    }

    public final void print() {
        System.out.println(toString());
    }
}