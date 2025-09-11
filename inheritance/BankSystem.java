package inheritance;
// BankSystem.java
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println("Account: " + accountNumber + " | Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccount() {
        displayBalance();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void displayAccount() {
        displayBalance();
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
    }
}

public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 50000, 4.5);
        CurrentAccount ca = new CurrentAccount("CA456", 100000, 20000);

        sa.displayAccount();
        ca.displayAccount();
    }
}
