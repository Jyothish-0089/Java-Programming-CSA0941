import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private long accountNumber;
    private String accountType;
    private double balance;

    // Constructor
    public BankAccount(String depositorName, long accountNumber, String accountType, double balance) {
        this.depositorName = depositorName;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to read account details
    public void readAccountDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNumber = scanner.nextLong();

        System.out.print("Enter Depositor Name: ");
        scanner.nextLine(); // consume the newline character
        depositorName = scanner.nextLine();

        System.out.print("Enter Account Type (Savings/Current): ");
        accountType = scanner.next();

        // Assume initial balance is 10000
        balance = 10000;
    }

    // Method to deposit amount
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. Updated balance: Rs." + balance);
    }

    // Method to withdraw amount
    public void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
            System.out.println("Amount withdrawn successfully. Updated balance: Rs." + balance);
        } else {
            System.out.println("Insufficient balance. Minimum balance should be Rs.500.");
        }
    }

    // Method to display balance
    public void displayBalance() {
        System.out.println("Account Holder: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Current Balance: Rs." + balance);
    }
}

public class assign3_Q4 {
    public static void main(String[] args) {
        // Assume initial balance is 10000
        BankAccount account = new BankAccount("John Doe", 123456789, "Savings", 10000);

        // Uncomment the following line if you want to read account details from the user
        // account.readAccountDetails();

        account.displayBalance();

        // Deposit an amount
        account.deposit(2000);

        // Withdraw an amount
        account.withdraw(1500);

        // Display the final balance
        account.displayBalance();
    }
}
