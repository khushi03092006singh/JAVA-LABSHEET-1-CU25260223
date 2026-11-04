class Q2BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    public void setAccountNumber(String n) {
        accountNumber = n;
    }

    public void setAccountHolder(String h) {
        accountHolder = h;
    }

    public void setBalance(double b) {
        if (b >= 0)
            balance = b;
        else
            System.out.println("Invalid opening balance.");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }
}

public class Q2Main {
    public static void main(String[] args) {
        Q2BankAccount a = new Q2BankAccount();

        a.setAccountNumber("123456");
        a.setAccountHolder("Riya");
        a.setBalance(5000);

        a.deposit(1000);
        a.withdraw(2000);

        System.out.println("Account: " + a.getAccountNumber());
        System.out.println("Holder: " + a.getAccountHolder());
        System.out.println("Balance: " + a.getBalance());

        a.deposit(-50);
        a.withdraw(10000);
    }
}
