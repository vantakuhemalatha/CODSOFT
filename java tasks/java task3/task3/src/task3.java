import java.util.Scanner;
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    public double getBalance() {
        return balance;
    }
    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
public class task3 {
    public static void main(String[] args) {
        BankAccount userAccount = new BankAccount(1000.0); // Starting balance
        ATMMachine atm = new ATMMachine(userAccount);
        atm.run();
    }
}
class ATMMachine {
    private BankAccount account;
    public ATMMachine(BankAccount account) {
        this.account = account;
    }
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the ATM!");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        int choice;
        do {
            System.out.print("Please select an option: ");
            choice = scanner.nextInt();
        switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    withdraw(scanner);
                    break;
                case 3:
                    deposit(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 4);
     scanner.close();
    }
    private void checkBalance() {
        System.out.println("Your current balance: $" + account.getBalance());
    }
    private void withdraw(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful. Remaining balance: $" + account.getBalance());
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }
    private void deposit(Scanner scanner) {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            account.deposit(amount);
            System.out.println("Deposit successful. New balance: $" + account.getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}