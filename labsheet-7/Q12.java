class BankAccount {
    int balance = 1000;
    Object lock = new Object();

    void withdraw(int amount) {
        synchronized (lock) {
            balance = balance - amount;
        }
    }
}

class WithdrawThread extends Thread {
    BankAccount account;

    WithdrawThread(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 1; i <= 1000; i++) {
            account.withdraw(1);
        }
    }
}

public class Q12 {
    public static void main(String[] args)
            throws InterruptedException {

        BankAccount account = new BankAccount();

        WithdrawThread t1 = new WithdrawThread(account);
        WithdrawThread t2 = new WithdrawThread(account);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Balance: " + account.balance);
    }
}