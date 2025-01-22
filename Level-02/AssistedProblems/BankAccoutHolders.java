package AssistedProblems;


import java.util.ArrayList;
import java.util.List;

class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}

class Customer {
    private String name;
    List<BankAccount> accounts;

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(@org.jetbrains.annotations.NotNull Bank bank, double initialDeposit) {
        BankAccount account = bank.openAccount(this, initialDeposit);
        accounts.add(account);
    }

    public void viewBalance() {
        for (BankAccount account : accounts) {
            System.out.println("Account " + account.getAccountNumber() + " balance: " + account.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

class Bank {
    private String name;
    private List<Customer> customers;
    private List<BankAccount> accounts;

    public Bank(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
        this.accounts = new ArrayList<>();
    }

    public BankAccount openAccount(Customer customer, double initialDeposit) {
        int accountNumber = accounts.size() + 1;
        BankAccount account = new BankAccount(accountNumber, initialDeposit);
        accounts.add(account);
        customers.add(customer);
        System.out.println("Account " + accountNumber + " opened for " + customer.getName() + " with balance " + initialDeposit);
        return account;
    }

    public List<String> getCustomers() {
        List<String> customerNames = new ArrayList<>();
        for (Customer customer : customers) {
            customerNames.add(customer.getName());
        }
        return customerNames;
    }
}

public class BankAccoutHolders {
    public static void main(String[] args) {
        Bank myBank = new Bank("Avinash");
        Customer kunal = new Customer("Kunal");
        Customer suraj = new Customer("Suraj");

        kunal.openAccount(myBank, 1000);
        suraj.openAccount(myBank, 500);

        kunal.viewBalance();
        suraj.viewBalance();

        kunal.viewBalance();
        kunal.accounts.get(0).deposit(500);
        kunal.viewBalance();
    }
}
