package Encapsulation;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("123456789", 10.0, "John Doe");

        // Display initial account details
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance() + "\n");

        // Deposit money
        account.deposit(490.0);
        System.out.println("Balance after deposit: " + account.getBalance() + "\n");

        // Withdraw money
        account.withdraw(200.0);
        System.out.println("Balance after withdrawal: " + account.getBalance() + "\n");

        // Withdraw too much money
        account.withdraw(1000.0);
        System.out.println("Balance after withdrawal: " + account.getBalance() + "\n");

        // Accessing protected data from another class in the same project
        BankEmployee employee = new BankEmployee();
        employee.greetAccountHolder(account);

        // Taking matters into our own hands to get rich quick

        // Seeing if our account exists
        try {
            // Get the exists field
            Field accountExistsField = BankAccount.class.getDeclaredField("accountExists");
            boolean accountExists = (boolean) accountExistsField.get(account);

            if (accountExists) {
                System.out.println("This account so exists!\n");
            }
            else {
                System.out.println("oh no what\n");
            }
        } catch (NoSuchFieldException n) {
            System.out.println("Failed to find variable: " + n.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Illegal access exception: " + e.getMessage() + "\n");
        }

        // Getting rich very legitimately
        try {
            // Get the balance field
            Field accountBalanceField = BankAccount.class.getDeclaredField("balance");
            double currentBalance = (double) accountBalanceField.get(account);

            // Add money to the balance
            accountBalanceField.set(account, currentBalance + 9999999.0);
            double updatedBalance = (double) accountBalanceField.get(account);
            System.out.println("Very legitimate balance: " + updatedBalance);

            // Profit :)
        } catch (NoSuchFieldException n) {
            System.out.println("Failed to find variable: " + n.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println("Illegal access exception: " + e.getMessage() + "\n");
            System.out.println("we are going to jail :D\n");
        }
    }
}
