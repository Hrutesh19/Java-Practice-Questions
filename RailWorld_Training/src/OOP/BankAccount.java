package OOP;
/*5. Define a class named BankAccount with attributes account_number, account_holder, and balance.
Include methods deposit(amount) and withdraw(amount) to deposit and withdraw money from the account,
respectively.
 */

public class BankAccount {
    // Attributes
    private final int accountNumber;  // Unique account number
    private final String accountHolder;  // Name of the account holder
    private double balance;  // Current balance of the account

    // Constructor to initialize the BankAccount object
    BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    // Method to deposit money into the account
    public void deposit(double amount) {
        // Checking if the deposit amount is valid
        if (amount > 0) {
            // Adding the deposit amount to the balance
            balance += amount;
            // Displaying success message
            System.out.println(amount + " Amount Deposited Successfully.");
        } else {
            // Displaying error message for invalid deposit amount
            System.out.println("Invalid Deposit Amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        // Checking if the withdrawal amount is valid and sufficient funds are available
        if (amount > 0 && amount <= balance) {
            // Subtracting the withdrawal amount from the balance
            balance -= amount;
            // Displaying success message
            System.out.println(amount + " withdrawn successfully.");
        } else {
            // Displaying error message for insufficient funds or invalid withdrawal amount
            System.out.println("Insufficient funds or invalid withdrawal amount.");
        }
    }

    // Getter method to retrieve the account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Getter method to retrieve the account holder's name
    public String getAccountHolder() {
        return accountHolder;
    }

    // Getter method to retrieve the current balance
    public double getBalance() {
        return balance;
    }


    // Main method for testing
    public static void main(String[] args) {
        // Creating a BankAccount object with initial values
        BankAccount account = new BankAccount(101, "Hrutesh Ghodmare", 5000);
        // Displaying initial account information
        System.out.println("Account Holder Name: " + account.getAccountHolder());
        System.out.println("Account Holder Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        // Depositing money into the account and displaying the current balance
        account.deposit(500.0);
        System.out.println("Current Balance after deposit: " + account.getBalance());

        // Withdrawing money from the account and displaying the current balance
        account.withdraw(200.0);
        System.out.println("Current Balance after withdrawal: " + account.getBalance());
    }
}

