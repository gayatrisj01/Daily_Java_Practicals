// Abstract class: BankAccount
abstract class BankAccount {
    // Attributes
    protected String accountNumber;
    protected double balance;

    // Constructor to initialize account number and balance
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Abstract methods
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber + ", Current Balance: ₹" + balance);
    }
}

// Subclass: CheckingAccount
class CheckingAccount extends BankAccount {
    // Constructor to initialize account number and balance
    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    // Implementation of deposit method
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited. New balance is ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Implementation of withdraw method
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn. New balance is ₹" + balance);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }
}

// Bank class to demonstrate the use of BankAccount and CheckingAccount classes
public class Bank {
    public static void main(String[] args) {
        // Create an object of the CheckingAccount class
        CheckingAccount myAccount = new CheckingAccount("123456789", 10000.00);

        // Display initial balance
        myAccount.displayBalance();

        // Call the deposit method
        myAccount.deposit(5000.00);

        // Call the withdraw method
        myAccount.withdraw(3000.00);

        // Display final balance
        myAccount.displayBalance();
    }
}


/*
Output:-
Account Number: 123456789, Current Balance: ₹10000.0
₹5000.0 deposited. New balance is ₹15000.0
₹3000.0 withdrawn. New balance is ₹12000.0
Account Number: 123456789, Current Balance: ₹12000.0
*/