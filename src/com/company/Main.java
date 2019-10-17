package com.company;

public class Main {

    public static void main(String[] args) {


        Bankaccount bobsAccount = new Bankaccount("12345", 0.00, "Bob Brown", "bobbrown@gmail.com", "555-555-5555");

        System.out.println("Bob's account number = " + bobsAccount.getNumber());
        System.out.println("Bob's account balance = " + bobsAccount.getBalance());


        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(50.0);
        bobsAccount.withdrawal(100.0);

        bobsAccount.deposit(51.0);
        bobsAccount.withdrawal(100.0);
    }
}
