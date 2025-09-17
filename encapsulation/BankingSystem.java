package encapsulation;
import java.util.ArrayList;
import java.util.List;

/**
 * Banking System
 * Demonstrates Encapsulation, Abstract Classes, Interfaces, and Polymorphism
 */
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount sa = new SavingsAccount("ACC001", "Rohit Sharma", 50000);
        CurrentAccount ca = new CurrentAccount("ACC002", "Virat Kohli", 150000);

        accounts.add(sa);
        accounts.add(ca);

        // Perform transactions
        sa.deposit(10000);
        sa.withdraw(5000);

        ca.deposit(20000);
        ca.withdraw(100000);

        // Polymorphism: process all accounts via BankAccount reference
        for (BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.printf("Interest Earned: %.2f%n", acc.calculateInterest());

            if (acc instanceof Loanable) {
                Loanable loanable = (Loanable) acc;
                System.out.println(loanable.applyForLoan());
                System.out.printf("Loan Eligibility: %.2f%n", loanable.calculateLoanEligibility());
            }
            System.out.println("--------------------------------------");
        }
    }
}

/**
 * Loanable Interface
 */
interface Loanable {
    String applyForLoan();
    double calculateLoanEligibility();
}

/**
 * Abstract BankAccount Class
 */
abstract class BankAccount implements Loanable {
    private final String accountNumber; // immutable
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number cannot be blank");
        }
        this.accountNumber = accountNumber.trim();
        setHolderName(holderName);
        setBalance(balance);
    }

    // Getters
    public String getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setters with validation
    public void setHolderName(String holderName) {
        if (holderName == null || holderName.isBlank()) {
            throw new IllegalArgumentException("Holder name cannot be blank");
        }
        this.holderName = holderName.trim();
    }

    private void setBalance(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance cannot be negative");
        }
        this.balance = balance;
    }

    // Deposit Method
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid deposit amount.");
            return;
        }
        balance += amount;
        System.out.println(amount + " deposited successfully. New Balance: " + balance);
    }

    // Withdraw Method
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient balance.");
            return;
        }
        balance -= amount;
        System.out.println(amount + " withdrawn successfully. Remaining Balance: " + balance);
    }

    // Concrete Method
    public void displayDetails() {
        System.out.printf("Account Number: %s%nHolder Name: %s%nBalance: %.2f%n",
                accountNumber, holderName, balance);
    }

    // Abstract Method
    public abstract double calculateInterest();
}

/**
 * SavingsAccount Class
 */
class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04; // 4% per year

    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public String applyForLoan() {
        return "Savings Account Loan Application Submitted.";
    }

    @Override
    public double calculateLoanEligibility() {
        // Loan eligibility = 2x balance
        return getBalance() * 2;
    }
}

/**
 * CurrentAccount Class
 */
class CurrentAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02; // 2% per year

    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public String applyForLoan() {
        return "Current Account Loan Application Submitted.";
    }

    @Override
    public double calculateLoanEligibility() {
        // Loan eligibility = 3x balance
        return getBalance() * 3;
    }
}
