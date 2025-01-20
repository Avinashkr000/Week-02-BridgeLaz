class BankAccount {
    static String bankName = "XYZ Bank";
    static int totalAccounts = 0;
    final int accountNumber;
    String accountHolderName;
    double balance;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Account Holder Name: " + this.accountHolderName);
            System.out.println("Bank Name: " + BankAccount.bankName);
            System.out.println("Account Number: " + this.accountNumber);
            System.out.println("Account Balance: $" + this.balance);
        } else {
            System.out.println("This is not a valid BankAccount object.");
        }
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Avinash", 12345, 1500.50);
        BankAccount account2 = new BankAccount("ashu", 67890, 2500.75);
        account1.displayAccountDetails();
        account2.displayAccountDetails();
        getTotalAccounts();
    }
}
