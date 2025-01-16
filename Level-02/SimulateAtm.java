class BankAccount {

    // Attributes of the class
    private String accountHolder;
    private String accountNumber;
    private double balance;

    // Constructor to initialize the BankAccount object
    public BankAccount(String accountHolder, String accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Account balance: " + balance);
    }

    // Main method to test the BankAccount class
    public static void main(String[] args) {
        // Create a bank account with an initial balance of $1000
        BankAccount account = new BankAccount("Avinash kumar", "123456789", 1000);

        // Display the current balance
        account.displayBalance();

        // Deposit money into the account
        account.deposit(500);

        // Withdraw money from the account
        account.withdraw(300);

        // Display the updated balance
        account.displayBalance();

        // Try withdrawing more money than available balance
        account.withdraw(1500);

        // Display the final balance
        account.displayBalance();
    }
}
