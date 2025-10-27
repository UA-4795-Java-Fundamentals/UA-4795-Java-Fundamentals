package com.softserve.academy.homework8;

public class Wallet {
    private int balance;

    public Wallet(int initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Negative initial balance");
        }
        this.balance = initialBalance;
    }

    public int deposit(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Bad deposit");
        }
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Bad withdraw");
        }

        if (amount > balance) {
            int needed = amount - balance;
            throw new InsufficientFundsException("Insufficient funds: need " + needed + " more");
        }

        balance -= amount;
        return balance;
    }

    public int getBalance() {
        return balance;
    }
}
