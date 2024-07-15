package Encapsulation;

public class BankEmployee {
    // Public method to access protected method in BankAccount
    public void greetAccountHolder(BankAccount account) {
        String name = account.getAccountHolderName();
        System.out.println("Why, hello there, " + name + "! \n");
    }
}
