import java.util.*;
import java.util.ArrayList;

class Account {
    private String accountNumber;
    private String accountHolder;
    private int pin;
    private double balance;
    private List<String> transactionHistory;

    public Account(String accountNumber, String accountHolder, int pin, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.pin = pin;
        this.balance = initialBalance;
        this.transactionHistory = new ArrayList<>();
    }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public boolean checkPin(int inputPin) { return this.pin == inputPin; }
    public double getBalance() { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: " + amount + " | New Balance: " + balance);
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactionHistory.add("Withdrew: " + amount + " | New Balance: " + balance);
            return true;
        }
        return false;
    }

    public List<String> getTransactionHistory() {
        return new ArrayList<>(transactionHistory);
    }
}

class ATM {
    private Map<String, Account> accounts;

    public ATM() {
        accounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getAccountNumber(), account);
    }

    public Account login(String accNum, int pin) {
        Account account = accounts.get(accNum);
        if (account != null && account.checkPin(pin)) {
            return account;
        }
        return null;
    }
}

public class ATMProject {
    private static Scanner sc = new Scanner(System.in);
    private static ATM atm = new ATM();

    public static void main(String[] args) {
        // Seed some demo accounts
        atm.addAccount(new Account("1001", "Nikhil Yadav", 1234, 5000));
        atm.addAccount(new Account("1002", "Atharv Ugale", 2345, 3000));
        atm.addAccount(new Account("1003", "Harsh Shete", 3456, 7000));

        System.out.println("\n=== Welcome to Command-Line ATM System ===");
        while (true) {
            System.out.print("\nEnter Account Number: ");
            String accNum = sc.nextLine();
            System.out.print("Enter PIN: ");
            int pin = Integer.parseInt(sc.nextLine());

            Account user = atm.login(accNum, pin);
            if (user != null) {
                System.out.println("\nWelcome, " + user.getAccountHolder() + "!");
                boolean session = true;
                while (session) {
                    System.out.println("\nSelect Option:\n1. Balance Inquiry\n2. Deposit\n3. Withdraw\n4. Transaction History\n5. Switch Account\n6. Exit");
                    System.out.print("Enter your Choice : ");
                    String opt = sc.nextLine();
                    switch (opt) {
                        case "1":
                            System.out.println("Current Balance: " + user.getBalance());
                            break;
                        case "2":
                            System.out.print("Enter Deposit Amount: ");
                            double dep = Double.parseDouble(sc.nextLine());
                            user.deposit(dep);
                            System.out.println("Deposited " + dep + ". New Balance: " + user.getBalance());
                            break;
                        case "3":
                            System.out.print("Enter Withdrawal Amount: ");
                            double wit = Double.parseDouble(sc.nextLine());
                            if (user.withdraw(wit)) {
                                System.out.println("Withdrawal successful. New Balance: " + user.getBalance());
                            } else {
                                System.out.println("Insufficient funds or invalid amount.");
                            }
                            break;
                        case "4":
                            System.out.println("\nTransaction History:");
                            for (String trx : user.getTransactionHistory()) {
                                System.out.println(trx);
                            }
                            break;
                        case "5":
                            session = false;
                            break;
                        case "6":
                            System.out.println("Thank you for using ATM. Goodbye!");
                            System.exit(0);
                        default:
                            System.out.println("Invalid option. Try again.");
                    }
                }
            } else {
                System.out.println("Authentication failed! Invalid account number or PIN.");
            }
        }
    }
}

