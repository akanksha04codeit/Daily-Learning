package Multithreading;


class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount);
            balance -= amount;
        } else {
            System.out.println("Insufficient Balance for " + Thread.currentThread().getName());
        }
        System.out.println("Remaining Balance: " + balance);
    }
}

public class ThreadExample3 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Thread t1 = new Thread(() -> account.withdraw(700), "User-1");
        Thread t2 = new Thread(() -> account.withdraw(700), "User-2");

        t1.start();
        t2.start();
    }
}

