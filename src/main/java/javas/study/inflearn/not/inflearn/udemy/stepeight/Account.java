package javas.study.inflearn.not.inflearn.udemy.stepeight;

import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transaction;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transaction = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit (int amount) {
        if (amount > 0) {
            transaction.add(amount);
            balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sum");
        }

    }

    public void withdraw(int amount) {
        int withdrawal = -amount;
        if (withdrawal < 0) {
            transaction.add(withdrawal);
            this.balance += withdrawal;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    public void calculateBalance () {
        balance = 0;

        for (int i : this.transaction) {
            this.balance += i;
        }
        System.out.println("Calculated balance is " + balance);
    }
}

