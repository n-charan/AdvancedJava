package com.synchronization;

public class Users {

    static final BankAccount account = new BankAccount(50);

    public static void main(String[] args) {
        account.topUp(100);

        Thread t1 = new Thread(() -> {
           ATM.withdraw(account, 100);
        });
        Thread t2 = new Thread(() -> {
           ATM.withdraw(account, 100);
        });
        t1.setName("Thread1");
        t2.setName("Thread2");
        t1.start();
        t2.start();
    }
}
