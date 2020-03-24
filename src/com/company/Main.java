package com.company;

public class Main {

    public static void main(String[] args) {

        //Initiate Payments
        Creditcard creditcard = new Creditcard();
        Debitcard debitcard = new Debitcard();
        Cash cash = new Cash();
        Check check = new Check();

        //AccountBalance set to 1000.00$
        Account.account.setAccountBalance(1000.00);

        //Testing of program functions
        creditcard.getAccountBalance();
        debitcard.getAccountBalance();
        cash.getAccountBalance();
        check.getAccountBalance();

        creditcard.makePayment(200);
        creditcard.getAccountBalance();
        debitcard.getAccountBalance();
        cash.getAccountBalance();
        check.getAccountBalance();

        cash.makePayment(500);
        creditcard.getAccountBalance();
        debitcard.getAccountBalance();
        cash.getAccountBalance();
        check.getAccountBalance();

        check.changeAccountBalance(600);
        creditcard.getAccountBalance();
        debitcard.getAccountBalance();
        cash.getAccountBalance();
        check.getAccountBalance();
    }
}
