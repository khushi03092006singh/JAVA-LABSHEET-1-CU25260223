class BankAccount {
    int accountNumber;
    double balance;
    static String bankName = "ABC Bank";

    void deposit(double amount) {
        double depositAmount = amount;  
        balance = balance + depositAmount;
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Bank: " + bankName);
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();

        b.accountNumber = 101;
        b.balance = 5000;

        b.deposit(2000);
        b.display();
    }
}