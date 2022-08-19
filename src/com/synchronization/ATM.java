package com.synchronization;

public class ATM {

    static synchronized void withdraw(BankAccount account, int amount) {
        int balance = account.getBalance();
        if ((balance - amount) < - account.getOverdraft()) {
            System.out.println("[" + Thread.currentThread().getName() + "] Transaction denied!");
        } else {
            account.debit(amount);
            System.out.println("[" + Thread.currentThread().getName() + "] $" + amount + " successfully withdrawn");
        }
        System.out.println("[" + Thread.currentThread().getName() + "] Current balance : " + account.getBalance());
    }
}
