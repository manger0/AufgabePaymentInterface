package com.company;

public class Account implements AccountMovements {

    // Variables
    protected double accountBalance;


    // Methodes
    @Override
    public void makePayment(double amount) {
        account.accountBalance -= amount;

    }

    @Override
    public void getAccountBalance() {
        System.out.println("AccountBalance: " + account.accountBalance + "$");

    }

    @Override
    public void setAccountBalance(double accountBalanceSet) {
        account.accountBalance = accountBalanceSet;
        System.out.println("new AccountBalance " + account.accountBalance + "$");

    }

    @Override
    public void changeAccountBalance(double amountOfChange) {
        account.accountBalance += amountOfChange;
        System.out.println("new AccountBalance " + account.accountBalance + "$");
    }
}
