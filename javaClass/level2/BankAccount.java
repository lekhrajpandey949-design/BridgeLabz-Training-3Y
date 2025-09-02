package javaClass.level2;


public class BankAccount {
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Display bank name
    public static void displayBank() {
        System.out.println("\t\t State of Chennai Bank \t\t");
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive");
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Lynda", "123456789", 700.00);

        displayBank();
        account.displayBalance();

        account.deposit(200.00);
        account.displayBalance();

        account.withdraw(100.00);
        account.displayBalance();

        account.withdraw(900.00);
    }
}
