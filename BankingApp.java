import java.util.Scanner;

// Class to represent a customer
class Customer {
    private String custName;
    private String password;
    private double balance;
    
    public Customer(String custName, String password, double balance) {
        this.custName = custName;
        this.password = password;
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public String getPassword() {
        return password;
    }

    public double getBalance() {
        return balance;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        balance += amount;
    }

    // Method to withdraw amount
    public boolean withdraw(double amount) {
        if (amount > balance)
            return false; // Withdrawal failed
        balance -= amount;
        return true; // Withdrawal successful
    }
}

// Class to handle customer operations
class Bank {
    private Customer customer;

    public void login(String custName, String password) throws Exception {
        // Check if customer exists and validate password
        if (customer == null || !customer.getCustName().equals(custName) || !customer.getPassword().equals(password)) {
            throw new Exception("Not a valid customer...");
        }
    }

    public void createCustomer(String custName, String password, double initialBalance) {
        customer = new Customer(custName, password, initialBalance);
    }

    public void deposit(double amount) {
        customer.deposit(amount);
    }

    public boolean withdraw(double amount) {
        return customer.withdraw(amount);
    }

    public double checkBalance() {
        return customer.getBalance();
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        System.out.println("Welcome to My Banking Application...");
        while (true) {
            System.out.println("Customer please Select");
            System.out.println("1. Customer Login");
            System.out.println("2. New Customer Sign in");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Customer Login
                    System.out.print("Enter your username: ");
                    String username = scanner.next();
                    System.out.print("Enter your password: ");
                    String password = scanner.next();
                    try {
                        bank.login(username, password);
                        System.out.println("Welcome " + username + "...");
                        handleCustomerOperations(scanner, bank);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                     // New Customer Sign in
                System.out.print("Enter your username: ");
                String newUsername = scanner.next();
                System.out.print("Enter your password: ");
                String newPassword = scanner.next();
                double initialBalance;
                do {
                    System.out.print("Enter initial balance (greater than 0): ");
                    initialBalance = scanner.nextDouble();
                    if (initialBalance <= 0) {
                        System.out.println("Initial balance must be greater than 0.");
                    }
                } while (initialBalance <= 0);
                bank.createCustomer(newUsername, newPassword, initialBalance);
                System.out.println("New customer created successfully!");
                break;
                case 3:
                    // Exit
                    System.out.println("Exited Application successfully...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to handle customer operations after login
    private static void handleCustomerOperations(Scanner scanner, Bank bank) {
        while (true) {
            System.out.println("\nAccount Details");
            System.out.println("a. Amount Deposit");
            System.out.println("b. Amount Withdrawal");
            System.out.println("c. Check Balance");
            System.out.println("d. Exit");

            System.out.print("Enter your choice: ");
            char choice = scanner.next().charAt(0);

            switch (choice) {
                case 'a':
                    // Amount Deposit
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    while (depositAmount <= 0) {
                        System.out.println("Amount must be greater than 0. Please enter a valid amount: ");
                        depositAmount = scanner.nextDouble();
                    }
                    bank.deposit(depositAmount);
                    System.out.println("Deposit successful. Current balance: " + bank.checkBalance());
                    break;
                case 'b':
                    // Amount Withdrawal
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    while (withdrawAmount <= 0) {
                        System.out.println("Amount must be greater than 0. Please enter a valid amount: ");
                        withdrawAmount = scanner.nextDouble();
                    }
                    while(withdrawAmount>bank.checkBalance())
                    {
                        System.out.println("Amount must be less than current balance.\nPlease enter a valid amount: ");
                        withdrawAmount = scanner.nextDouble();
                    }
                    if (bank.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful. Current balance: " + bank.checkBalance());
                    }
                    break;
                case 'c':
                    // Check Balance
                    System.out.println("Current balance: " + bank.checkBalance());
                    break;
                case 'd':
                    // Exit
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
