package com.company;

public class Creditcard extends Account {

    // Methodes
    @Override
    public void makePayment(double amount) {
        account.accountBalance -= (amount * 1.03);
        System.out.println("new AccountBalance " + account.accountBalance + "$");
    }
}
