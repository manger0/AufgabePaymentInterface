package com.company;

public interface AccountMovements {

    // Variables
    Account account = new Account();

    // Methodes
    void makePayment(double amount);
    void getAccountBalance();
    void setAccountBalance(double accountBalance);
    void changeAccountBalance(double amountOfChange);
}
