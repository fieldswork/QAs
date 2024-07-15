package Encapsulation;

public class BankAccount {
    // Variables
    private String accountNumber;
    private double balance;
    protected String accountHolderName;
    public boolean accountExists;

    // Constructor
    public BankAccount(String accountNumber, double initialBalance, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.accountHolderName = accountHolderName;
        this.accountExists = true;
    }

    // Public Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public Getter for balance
    public double getBalance() {
        return balance;
    }

    // Protected method to display account holder name
    protected String getAccountHolderName() {
        return accountHolderName;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            double difference = amount - balance;
            System.out.println("Sorry, you're " + difference + " dollars short.");
        }
    }
}
