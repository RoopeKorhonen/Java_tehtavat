package Week_3_OhtuUnitTesting_2;
// Account.java
public class Account {
    private double balance;

    // Default constructor
    public Account() {
        this.balance = 0.0;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // Method to withdraw money from the account
    // Returns the withdrawn amount if successful, otherwise 0.0
    public double withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            return amount;
        } else {
            return 0.0;
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return this.balance;
    }
}
